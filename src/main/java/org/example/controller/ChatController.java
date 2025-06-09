package org.example.controller;

import org.example.service.ChatService;

import java.sql.SQLException;

public class ChatController {
    private ChatService chatService;
    public ChatController(ChatService chatService)throws SQLException {
        this.chatService = chatService;
    }
}
