package org.example.repository;

import org.example.customAray.UserCustomArrayImpl;

import java.sql.SQLException;

public interface UserRepository {
    UserCustomArrayImpl SelectAllQuery(String tableName) throws SQLException;
}
