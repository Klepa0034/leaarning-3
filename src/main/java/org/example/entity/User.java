package org.example.entity;

public class User {
    private long id;

    public User (long id){
        this.id = id;
    }
    public String toString() {
        return "Users{" +
                ", user id='" + id + '\'' +
                '}';
    }
}
