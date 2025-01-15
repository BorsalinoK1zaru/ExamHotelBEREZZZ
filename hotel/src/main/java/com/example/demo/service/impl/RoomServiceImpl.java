package com.example.demo.service.impl;

import com.example.demo.model.Room;
import com.example.demo.model.Status;
import com.example.demo.repository.RoomRepository;
import com.example.demo.service.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoomServiceImpl implements RoomService {

    private final RoomRepository roomRepository;

    @Override
    public Room createRoom(Room room) {
        return roomRepository.save(room);
    }

    @Override
    public Room getRoomById(String id) {
        return roomRepository.findById(id).orElseThrow(
                ()->new RuntimeException("Room not find")
        );
    }

    @Override
    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    @Override
    public Room updateRooms(String id, Room room) {
        if(roomRepository.existsById(id)){
            throw new RuntimeException("room not found");
        }

        room.setId(id);
        return roomRepository.save(room);
    }

    @Override
    public List<Room> getAllFreeRooms() {
        List<Room> rooms = roomRepository.findAll();

        return rooms.stream().filter(r-> r.getStatus().equals(Status.FREE)).toList();

    }


    @Override
    public void deleteRoomById(String id) {
        roomRepository.deleteById(id);
    }
}
