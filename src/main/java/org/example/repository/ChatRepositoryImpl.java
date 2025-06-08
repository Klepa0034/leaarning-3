package org.example.repository;

import org.example.customAray.ChatCustomArrayImpl;
import org.example.manager.ConnectionManager;
import org.example.manager.QueryManager;
import org.example.mapper.ChatResultMapper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ChatRepositoryImpl implements ChatRepository  {
    private  ConnectionManager connectionManager;
    private  QueryManager queryManager;
    private  ChatResultMapper chatResultMapper;
    public ChatRepositoryImpl(ConnectionManager connectionManager, QueryManager queryManager, ChatResultMapper chatResultMapper){
        this.connectionManager=connectionManager;
        this.queryManager=queryManager;
        this.chatResultMapper=chatResultMapper;
    }

    public ChatCustomArrayImpl SelectAllQuery(String tableName) throws SQLException {
        Connection connection = connectionManager.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(queryManager.SelectAllQuery("chats"));
        return chatResultMapper.resultToListMapper(resultSet);
    }
}
