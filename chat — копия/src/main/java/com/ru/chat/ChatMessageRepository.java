package com.ru.chat;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface ChatMessageRepository extends MongoRepository<MessageModel, String> {
    List<MessageModel> findAllByOrderByCreateDateAsc();
}