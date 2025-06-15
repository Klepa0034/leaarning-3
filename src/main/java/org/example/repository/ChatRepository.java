package org.example.repository;

import org.example.customAray.ChatCustomArray;
import org.example.customAray.ChatCustomArrayImpl;

import java.sql.SQLException;

public interface ChatRepository {
    ChatCustomArray findAll(String tableName) throws SQLException;
}
