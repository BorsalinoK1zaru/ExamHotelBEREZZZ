package com.example.demo.service;

import com.example.demo.model.Client;
import com.example.demo.model.Room;

import java.util.List;

public interface RoomService {
    Room createRoom(Room room);
    Room getRoomById(String id);
    List<Room> getAllRooms();
    Room updateRooms(String id, Room room);

    List<Room> getAllFreeRooms();
    void deleteRoomById(String id);
}
