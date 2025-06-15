package org.example.service;

import org.example.customAray.ChatCustomArray;

import java.sql.SQLException;

public interface ChatService {
    ChatCustomArray findAll(String tableName) throws SQLException;
}
