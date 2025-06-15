package org.example.service;

import org.example.customAray.MessageCustomArray;
import org.example.customAray.MessageCustomArrayImpl;
import org.example.repository.MessageRepository;

import java.sql.SQLException;

public class MessageServiceImpl implements MessageService {
    private MessageRepository messageRepository;
    public MessageServiceImpl(MessageRepository messageRepository){
        this.messageRepository=messageRepository;
    }
    public MessageCustomArray findAll(String tableName) throws SQLException{
        return messageRepository.findAll(tableName);
    }

}
