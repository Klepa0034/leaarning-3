package org.example.repository;

import org.example.manager.ConnectionManager;
import org.example.manager.QueryManager;
import org.example.mapper.MessageResultMapper;
import org.example.customAray.MessageCustomArrayImpl;

import java.sql.*;

public class MessageRepositoryImpl implements MessageRepository {
    private ConnectionManager connectionManager;
    private QueryManager queryManager;
    private MessageResultMapper messageResultMapper;
    public MessageRepositoryImpl(ConnectionManager connectionManager,QueryManager queryManager,MessageResultMapper messageResultMapper){
        this.connectionManager=connectionManager;
        this.queryManager=queryManager;
        this.messageResultMapper=messageResultMapper;
    }

    public MessageCustomArrayImpl SelectAllQuery(String tableName) throws SQLException {
        Connection connection = connectionManager.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(queryManager.SelectAllQuery("messages"));
        return messageResultMapper.resultToListMapper(resultSet);
    }

}
