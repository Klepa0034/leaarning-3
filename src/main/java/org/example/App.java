package org.example;

import org.example.controller.ChatController;
import org.example.controller.UserController;
import org.example.customAray.ChatCustomArrayImpl;
import org.example.customAray.MessageCustomArrayImpl;
import org.example.controller.MessageController;
import org.example.customAray.UserCustomArrayImpl;
import org.example.manager.ConnectionManager;
import org.example.manager.ConnectionManagerImpl;
import org.example.manager.QueryManager;
import org.example.manager.QueryManagerImpl;
import org.example.mapper.*;
import org.example.repository.*;
import org.example.service.*;

import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException {
        UserResultMapper userResultMapper = new UserResultMapperImpl();
        MessageResultMapper messageResultMapper = new MessageResultMapperImpl();
        ChatResultMapper chatResultMapper = new ChatResultMapperImpl();

        QueryManager queryManager = new QueryManagerImpl();
        ConnectionManager connectionManager = new ConnectionManagerImpl();

        MessageRepository messageRepository = new MessageRepositoryImpl(connectionManager,queryManager,messageResultMapper);
        MessageService messageService = new MessageServiceImpl(messageRepository);
        MessageController messageController = new MessageController(messageService);
        MessageCustomArrayImpl messageCustomArrayImpl = messageRepository.SelectAllQuery("messages");

        UserRepository userRepository = new UsersRepositoryImpl(connectionManager,queryManager, userResultMapper);
        UserService userService = new UserServiceImpl(userRepository);
        UserController userController = new UserController(userService);
        UserCustomArrayImpl userCustomArray = userRepository.SelectAllQuery("users");

        ChatRepository chatRepository = new ChatRepositoryImpl(connectionManager,queryManager, chatResultMapper);
        ChatService chatService = new ChatServiceImplMessage(chatRepository);
        ChatController chatController = new ChatController(chatService);
        ChatCustomArrayImpl chatCustomArray = chatRepository.SelectAllQuery("chats");

        messageCustomArrayImpl.print();
        chatCustomArray.print();
        userCustomArray.print();



    }
}
