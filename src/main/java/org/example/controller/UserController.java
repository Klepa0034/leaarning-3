package org.example.controller;

import org.example.customAray.ChatCustomArray;
import org.example.customAray.UserCustomArray;
import org.example.service.MessageService;
import org.example.service.UserService;

import java.sql.SQLException;

public class UserController {
    private UserService userService;
    public UserController(UserService userService)throws SQLException {
        this.userService = userService;
    }
    public UserCustomArray getAllChats(String tableName) throws SQLException {
        return userService.findAll(tableName);
    }
}
