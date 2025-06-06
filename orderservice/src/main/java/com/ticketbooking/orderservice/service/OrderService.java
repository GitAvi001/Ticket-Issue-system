package com.ticketbooking.orderservice.service;

import com.ticketbooking.orderservice.bookingservice.event.BookingEvent;
import com.ticketbooking.orderservice.client.InventoryServiceClient;
import com.ticketbooking.orderservice.repository.OrderRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import com.ticketbooking.orderservice.entity.Order;

@Service
@Slf4j
public class OrderService {

    private OrderRepository orderRepository;
    private InventoryServiceClient inventoryServiceClient;

    @Autowired
    public OrderService(final OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
    @KafkaListener(topics= "booking", groupId = "order-service")
    public void orderEvent(BookingEvent bookingEvent) {
        log.info("Received order for booking event: {}", bookingEvent);
        // Object for Database
        Order order = createOrder(bookingEvent);
        orderRepository.saveAndFlush(order);

        //Update inventory
        //less tickets - No of tickets booked
    inventoryServiceClient.updateInventory(order.getEventId(), order.getTicketCount());
      log.info("Inventory updated for event ID: {}, less tickets: {}", order.getEventId(), order.getTicketCount());
    }
    //create an Order object from BookingEvent
    private Order createOrder(BookingEvent bookingEvent) {
        // Logic to create an Order object from BookingEvent
        return Order.builder()
                .customerId(bookingEvent.getUserId())
                .eventId(bookingEvent.getEventId())
                .ticketCount(bookingEvent.getTicketCount())
                .totalPrice(bookingEvent.getTotalPrice())
                .build();
    }
}
