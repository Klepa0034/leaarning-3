package org.example.entity;

public class User {
    private long userId;

    public User (long userId){
        this.userId = userId;
    }
    public String toString() {
        return "Users{" +
                ", user id='" + userId + '\'' +
                '}';
    }
}
