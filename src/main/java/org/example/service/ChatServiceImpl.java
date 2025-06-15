package org.example.service;

import org.example.customAray.ChatCustomArray;
import org.example.customAray.ChatCustomArrayImpl;
import org.example.repository.ChatRepository;

import java.sql.SQLException;

public class ChatServiceImpl implements ChatService {
    private ChatRepository chatRepository;
    public ChatServiceImpl(ChatRepository chatRepository){
        this.chatRepository = chatRepository;
    }
    public ChatCustomArray findAll(String tableName) throws SQLException {
        return chatRepository.findAll(tableName);
    }
}
