package org.example.service;

import org.example.customAray.MessageCustomArrayImpl;
import org.example.repository.MessageRepository;

import java.sql.SQLException;

public class MessageServiceImpl implements MessageService {
    private MessageRepository messageRepository;




    public MessageServiceImpl(MessageRepository messageRepository){
        this.messageRepository=messageRepository;
    }
    public MessageCustomArrayImpl[] SelectAllQuery(String tableName) throws SQLException{
        return new MessageCustomArrayImpl[0];
    }

}
