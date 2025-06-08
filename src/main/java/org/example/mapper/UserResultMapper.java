package org.example.mapper;

import org.example.customAray.UserCustomArrayImpl;

import java.sql.ResultSet;
import java.sql.SQLException;


public interface UserResultMapper {
    UserCustomArrayImpl resultToListMapper(ResultSet resultSet) throws SQLException;
}
