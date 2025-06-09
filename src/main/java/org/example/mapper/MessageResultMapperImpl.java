package org.example.mapper;

import org.example.customAray.MessageCustomArrayImpl;
import org.example.entity.Message;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MessageResultMapperImpl implements MessageResultMapper{
    public MessageCustomArrayImpl resultToListMapper(ResultSet resultSet) throws SQLException {
        MessageCustomArrayImpl messageCustomArrayImpl = new MessageCustomArrayImpl();
        while (resultSet.next()) {
            long sender_id = resultSet.getLong("sender id");
            long recipient_id = resultSet.getLong("recipient id");
            long chats_id = resultSet.getLong("chat id");
            String text = resultSet.getString("text");
            Message message = new Message(sender_id,recipient_id,chats_id,text);
            messageCustomArrayImpl.addElement(message);
        }
        return messageCustomArrayImpl;
    }
}
