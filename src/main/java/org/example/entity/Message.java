package org.example.entity;

public class Message {
    private long senderId;
    private long recipientId;
    private long chatId;
    private String text;

    public Message(long senderId, long recipientId, long chatId, String text){
        this.senderId = senderId;
        this.recipientId = recipientId;
        this.chatId = chatId;
        this.text = text;
    }
    @Override
    public String toString() {
        return "Messages{" +
                ", sender id='" + senderId + '\'' +
                ", recipient id='" + recipientId + '\'' +
                ", chat id='" + chatId + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
//TODO Поменять названия свойств. Добавить 2 другие сущности"", интерфейсы для репки два других, добавить интерфесы к сервису, сделать доп CustomArray,
//TODO Добавить контролеры с норм названием