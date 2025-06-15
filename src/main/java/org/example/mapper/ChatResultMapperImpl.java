package org.example.mapper;

import org.example.customAray.ChatCustomArray;
import org.example.customAray.ChatCustomArrayImpl;
import org.example.customAray.UserCustomArrayImpl;
import org.example.entity.Chat;
import org.example.entity.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ChatResultMapperImpl implements ChatResultMapper{
    public ChatCustomArray resultToListMapper(ResultSet resultSet) throws SQLException {
        ChatCustomArray chatCustomArray = new ChatCustomArrayImpl();
        while (resultSet.next()) {
            long chatId = resultSet.getLong("id");
            Chat chat = new Chat(chatId);
            chatCustomArray.addElement(chat);
        }
        return chatCustomArray;
    }
}
//public class ChatResultMapperImpl implements ChatResultMapper {
//    public ChatCustomArrayImpl resultToListMapper(ResultSet resultSet) throws SQLException {
//        ChatCustomArrayImpl chatCustomArray = new ChatCustomArrayImpl(); // Изменено на ChatCustomArrayImpl
//        while (resultSet.next()) {
//            long chatId = resultSet.getLong("id");
//            Chat chat = new Chat(chatId);
//            chatCustomArray.addElement(chat);
//        }
//        return chatCustomArray;
//    }
//}