package com.example.ticketbooking.inventoryservice.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "venue") //Database table name
public class Venue {

    //Storing venue table's column data
    @Id
    @Column(name="id")
    private Long id;

    @Column(name= "name")
    private String name;

    @Column(name="address")
    private String address;

    @Column(name= "total capacity")
    private Long totalCapacity;

}
