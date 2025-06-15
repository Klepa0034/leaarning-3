package org.example.controller;

import org.example.customAray.ChatCustomArray;
import org.example.customAray.MessageCustomArray;
import org.example.service.MessageService;

import java.sql.SQLException;

public class MessageController {
    private MessageService messageService;
    public MessageController(MessageService messageService)throws SQLException {
        this.messageService = messageService;
    }
    public MessageCustomArray getAllChats(String tableName) throws SQLException {
        return messageService.findAll(tableName);
    }
}
