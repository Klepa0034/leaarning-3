package org.example.mapper;

import org.example.customAray.MessageCustomArray;
import org.example.customAray.MessageCustomArrayImpl;

import java.sql.ResultSet;
import java.sql.SQLException;


public interface MessageResultMapper {
    MessageCustomArray resultToListMapper(ResultSet resultSet) throws SQLException;
}
