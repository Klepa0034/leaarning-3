package org.example.entity;

public class Chat {
    private long chatId;
    public Chat(long chatId){
        this.chatId = chatId;
    }
    public String toString() {
        return "Chats{" +
                ", chat id='" + chatId + '\'' +
                '}';
    }
}
