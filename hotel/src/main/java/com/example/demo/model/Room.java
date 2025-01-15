package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Room {
    @Id
    private String id;
    private int floor;
    private Capacity capacity;
    private Status status;

    private LocalDate firstCheckIn;

    private LocalDate lastCheckIn;

}
