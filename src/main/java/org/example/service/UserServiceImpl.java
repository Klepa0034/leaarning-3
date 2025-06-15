package org.example.service;

import org.example.customAray.MessageCustomArrayImpl;
import org.example.customAray.UserCustomArray;
import org.example.customAray.UserCustomArrayImpl;
import org.example.repository.MessageRepository;
import org.example.repository.UserRepository;
import org.example.repository.UsersRepositoryImpl;

import java.sql.SQLException;

public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository=userRepository;
    }
    public UserCustomArray findAll(String tableName) throws SQLException{
        return userRepository.findAll(tableName);
    }

}


