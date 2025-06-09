package org.example.service;

import org.example.customAray.MessageCustomArrayImpl;

import java.sql.SQLException;

public interface MessageService {
    MessageCustomArrayImpl[] SelectAllQuery(String tableName) throws SQLException;

}
