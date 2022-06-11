package com.tejbhan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChatHistoryController {

    @Autowired
    private MessagesRepo messagesRepo;

    @GetMapping("getMessagesByRoomId")
    public List<Messages> getMessagesByRoomId(@RequestParam String roomId) {
        return messagesRepo.findByRoomId(roomId);
    }

    @GetMapping("findAllRoomId")
    public List<String> findAllRoomId() {
        return messagesRepo.findAllRoomId();
    }

    @GetMapping("getAllUsers")
    public List<String> getAllUsers() {
        return messagesRepo.findAllUsers();
    }

    @GetMapping("getAllUsersByRoomId")
    public List<String> getUsersByRoomId(@RequestParam String roomId) {
        return messagesRepo.findUsersByRoomId(roomId);
    }
}
