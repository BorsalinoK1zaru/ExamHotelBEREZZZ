package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Client {
    @Id
    private int passport;

    private String name;
    private String surname;

    private String secondName; //Отчество

    @ManyToOne
    @JoinColumn(name = "room_num")
    private Room room;

}
