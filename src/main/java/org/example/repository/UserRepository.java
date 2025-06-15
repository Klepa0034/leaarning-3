package org.example.repository;

import org.example.customAray.UserCustomArray;
import org.example.customAray.UserCustomArrayImpl;

import java.sql.SQLException;

public interface UserRepository {
    UserCustomArray findAll(String tableName) throws SQLException;
}
