package com.example.ticketbooking.inventoryservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "event") //Database table name
public class Event {

    @Id
    @Column(name="id")
    private Long id;

    @Column(name= "name")
    private String name;

    @Column(name="total_capacity")
    private Long totalCapacity;

    @Column(name= "left_capacity")
    private Long leftCapacity;

    @ManyToOne //Multiple events can have same movie theater
    @JoinColumn(name = "venue_id") //Foreign key exists for event table for map to venue table's id
    private Venue venue;

}
