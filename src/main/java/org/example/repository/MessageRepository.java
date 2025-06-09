package org.example.repository;

import org.example.customAray.MessageCustomArrayImpl;

import java.sql.SQLException;

public interface MessageRepository {
    MessageCustomArrayImpl SelectAllQuery(String tableName) throws SQLException;
}
