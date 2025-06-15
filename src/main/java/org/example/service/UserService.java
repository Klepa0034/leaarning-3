package org.example.service;

import org.example.customAray.UserCustomArray;

import java.sql.SQLException;

public interface UserService {
    UserCustomArray findAll(String tableName) throws SQLException;
}
