package org.example.repository;

import org.example.customAray.UserCustomArray;
import org.example.customAray.UserCustomArrayImpl;
import org.example.manager.ConnectionManager;
import org.example.manager.QueryManager;
import org.example.mapper.UserResultMapper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsersRepositoryImpl implements UserRepository  {
    private  ConnectionManager connectionManager;
    private  QueryManager queryManager;
    private  UserResultMapper userResultMapper;
    public UsersRepositoryImpl(ConnectionManager connectionManager, QueryManager queryManager, UserResultMapper userResultMapper){
        this.connectionManager=connectionManager;
        this.queryManager=queryManager;
        this.userResultMapper=userResultMapper;
    }

    public UserCustomArray findAll(String tableName) throws SQLException {
        Connection connection = connectionManager.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(queryManager.createSelectQuery("users"));
        return userResultMapper.resultToListMapper(resultSet);
    }
}
