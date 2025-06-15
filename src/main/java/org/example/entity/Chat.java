package org.example.entity;

public class Chat {
    private long id;
    public Chat(long id){
        this.id = id;
    }
    public String toString() {
        return "Chats{" +
                ", chat id='" + id + '\'' +
                '}';
    }
}
