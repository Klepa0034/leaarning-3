package org.example.repository;

import org.example.customAray.ChatCustomArrayImpl;
import org.example.customAray.MessageCustomArrayImpl;

import java.sql.SQLException;

public interface ChatRepository {
    ChatCustomArrayImpl SelectAllQuery(String tableName) throws SQLException;
}
