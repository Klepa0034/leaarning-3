package org.example.mapper;

import org.example.customAray.UserCustomArray;
import org.example.customAray.UserCustomArrayImpl;
import org.example.entity.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserResultMapperImpl implements UserResultMapper{
    public UserCustomArray resultToListMapper(ResultSet resultSet) throws SQLException {
        UserCustomArray UserCustomArrayImpl = new UserCustomArrayImpl();
        while (resultSet.next()) {
            long userId = resultSet.getLong("id");
            User user = new User(userId);
            UserCustomArrayImpl.addElement(user);
        }
        return UserCustomArrayImpl;
    }
}
