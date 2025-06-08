package org.example.service;

import org.example.customAray.MessageCustomArrayImpl;
import org.example.customAray.UserCustomArrayImpl;

import java.sql.SQLException;

public interface UserService {
    UserCustomArrayImpl[] SelectAllQuery(String tableName) throws SQLException;

}
