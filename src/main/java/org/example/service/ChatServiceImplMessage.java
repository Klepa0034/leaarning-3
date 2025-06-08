package org.example.service;

import org.example.customAray.ChatCustomArrayImpl;
import org.example.customAray.MessageCustomArrayImpl;
import org.example.repository.ChatRepository;
import org.example.repository.ChatRepositoryImpl;

import java.sql.SQLException;

public class ChatServiceImplMessage implements ChatService {
    private ChatRepository chatRepository;




    public ChatServiceImplMessage(ChatRepository chatRepositoryI){
        this.chatRepository = chatRepository;
    }
    public ChatCustomArrayImpl[] SelectAllQuery(String tableName) throws SQLException {
        return new ChatCustomArrayImpl[0];
    }

}
