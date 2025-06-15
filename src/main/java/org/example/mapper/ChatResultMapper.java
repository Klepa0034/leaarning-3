package org.example.mapper;

import org.example.customAray.ChatCustomArray;
import org.example.customAray.ChatCustomArrayImpl;
import org.example.customAray.UserCustomArrayImpl;

import java.sql.ResultSet;
import java.sql.SQLException;


public interface ChatResultMapper {
    ChatCustomArray resultToListMapper(ResultSet resultSet) throws SQLException;
}
