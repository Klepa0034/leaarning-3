package org.example.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManagerImpl implements ConnectionManager  {
    private String name="name";
    private String password="password";
    private String url="jdbc:postgresql://localhost:5432/name";
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,name,password);
    }
}
