package org.example.controller;

import org.example.service.MessageService;
import org.example.service.UserService;

import java.sql.SQLException;

public class UserController {
    private UserService userService;
    public UserController(UserService userService)throws SQLException {
        this.userService = userService;
    }
}
