package org.example.service;

import org.example.customAray.ChatCustomArrayImpl;

import java.sql.SQLException;

public interface ChatService {
    ChatCustomArrayImpl[] SelectAllQuery(String tableName) throws SQLException;

}
