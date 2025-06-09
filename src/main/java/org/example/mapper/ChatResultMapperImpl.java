package org.example.mapper;

import org.example.customAray.ChatCustomArrayImpl;
import org.example.customAray.UserCustomArrayImpl;
import org.example.entity.Chat;
import org.example.entity.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ChatResultMapperImpl implements ChatResultMapper{
    public ChatCustomArrayImpl resultToListMapper(ResultSet resultSet) throws SQLException {
        ChatCustomArrayImpl ChatCustomArrayImpl = new ChatCustomArrayImpl();
        while (resultSet.next()) {
            long chatId = resultSet.getLong("id");
            Chat chat = new Chat(chatId);
            ChatCustomArrayImpl.addElement(chat);
        }
        return ChatCustomArrayImpl;
    }
}
