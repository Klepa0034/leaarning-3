package org.example.repository;

import org.example.customAray.MessageCustomArray;
import org.example.manager.ConnectionManager;
import org.example.manager.QueryManager;
import org.example.mapper.MessageResultMapper;
import org.example.customAray.MessageCustomArrayImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MessageRepositoryImpl implements MessageRepository {
    private ConnectionManager connectionManager;
    private QueryManager queryManager;
    private MessageResultMapper messageResultMapper;
    public MessageRepositoryImpl(ConnectionManager connectionManager,QueryManager queryManager,MessageResultMapper messageResultMapper){
        this.connectionManager=connectionManager;
        this.queryManager=queryManager;
        this.messageResultMapper=messageResultMapper;
    }

    public MessageCustomArray findAll(String tableName) throws SQLException {
        Connection connection = connectionManager.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(queryManager.createSelectQuery("messages"));
        return messageResultMapper.resultToListMapper(resultSet);
    }

}
