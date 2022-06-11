package com.tejbhan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessagesRepo extends JpaRepository<Messages, Long> {

    @Query(nativeQuery = true, value = "select * from messages where room_id =:roomId")
    List<Messages> findByRoomId(String roomId);

    @Query(nativeQuery = true, value = "select room_id from messages")
    List<String> findAllRoomId();

    @Query(nativeQuery = true, value = "select sender_name from messages")
    List<String> findAllUsers();

    @Query(nativeQuery = true, value = "select sender_name from messages where room_id =:roomId")
    List<String> findUsersByRoomId(String roomId);

}
