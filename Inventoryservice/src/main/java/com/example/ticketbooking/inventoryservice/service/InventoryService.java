package com.example.ticketbooking.inventoryservice.service;

import com.example.ticketbooking.inventoryservice.repository.EventRepository;
import com.example.ticketbooking.inventoryservice.repository.VenueRepository;
import com.example.ticketbooking.inventoryservice.response.EventInventoryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {

    //Event and Venue tables needed to map so two distinct repositories needed
    private final EventRepository eventRepository;
    private final VenueRepository venueRepository;

    @Autowired
    public InventoryService(final EventRepository eventRepository, final VenueRepository venueRepository){
        this.eventRepository=eventRepository;
        this.venueRepository=venueRepository;
    }
    public List<EventInventoryResponse> getAllEvents(){
        return
    }
}
