package org.example.manager;

public class QueryManagerImpl implements QueryManager {
    public String SelectAllQuery(String tableName){
        return "SELECT * FROM %s".formatted(tableName);
    }
}
