package org.example;

import org.example.controller.ChatController;
import org.example.controller.UserController;
import org.example.customAray.*;
import org.example.controller.MessageController;
import org.example.manager.ConnectionManager;
import org.example.manager.ConnectionManagerImpl;
import org.example.manager.QueryManager;
import org.example.manager.QueryManagerImpl;
import org.example.mapper.ChatResultMapper;
import org.example.mapper.ChatResultMapperImpl;
import org.example.mapper.MessageResultMapper;
import org.example.mapper.MessageResultMapperImpl;
import org.example.mapper.UserResultMapper;
import org.example.mapper.UserResultMapperImpl;
import org.example.repository.ChatRepository;
import org.example.repository.ChatRepositoryImpl;
import org.example.repository.MessageRepository;
import org.example.repository.MessageRepositoryImpl;
import org.example.repository.UserRepository;
import org.example.repository.UsersRepositoryImpl;
import org.example.service.ChatService;
import org.example.service.ChatServiceImpl;
import org.example.service.MessageService;
import org.example.service.MessageServiceImpl;
import org.example.service.UserService;
import org.example.service.UserServiceImpl;

import java.sql.SQLException;

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
        MessageCustomArray messageCustomArrayImpl = messageController.getAllChats("messages");


        UserRepository userRepository = new UsersRepositoryImpl(connectionManager,queryManager, userResultMapper);
        UserService userService = new UserServiceImpl(userRepository);
        UserController userController = new UserController(userService);
        UserCustomArray userCustomArray = userController.getAllChats("users");


        ChatRepository chatRepository = new ChatRepositoryImpl(connectionManager,queryManager, chatResultMapper);
        ChatService chatService = new ChatServiceImpl(chatRepository);
        ChatController chatController = new ChatController(chatService);
        ChatCustomArray allChats = chatController.getAllChats("chats");

        messageCustomArrayImpl.print();
        userCustomArray.print();
        allChats.print();



    }
}
