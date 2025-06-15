package org.example.repository;

import org.example.customAray.MessageCustomArray;
import org.example.customAray.MessageCustomArrayImpl;

import java.sql.SQLException;

public interface MessageRepository {
    MessageCustomArray findAll(String tableName) throws SQLException;
}
