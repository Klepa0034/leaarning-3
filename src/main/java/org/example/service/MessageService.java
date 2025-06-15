package org.example.service;

import org.example.customAray.MessageCustomArray;

import java.sql.SQLException;

public interface MessageService {
    MessageCustomArray findAll(String tableName) throws SQLException;
}
