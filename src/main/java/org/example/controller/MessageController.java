package org.example.controller;

import org.example.service.MessageService;

import java.sql.SQLException;

public class MessageController {
    private MessageService messageService;
    public MessageController(MessageService messageService)throws SQLException {
        this.messageService = messageService;
    }
}
