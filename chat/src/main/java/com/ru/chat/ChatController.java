package com.ru.chat;

import org.joda.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;



@Controller
public class ChatController {

    @Autowired
    private ChatMessageRepository chatMessageRepository;

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/chat")
    public String chat() {
        return "chat";
    }

    @RequestMapping(value = "/messages", method = RequestMethod.POST)
    @MessageMapping("/newMessage")
    @SendTo("/topic/newMessage")
    public Message save(MessageModel MessageModel) {
        MessageModel Message = new MessageModel(MessageModel.getText(), MessageModel.getAuthor(), new LocalDateTime());
        MessageModel message = chatMessageRepository.save(Message);
        List<MessageModel> MessageModelList = chatMessageRepository.findAll(PageRequest.of(0, 50, Sort.Direction.DESC, "createDate")).getContent();
        return new Message(MessageModelList.toString());
    }

    @RequestMapping(value = "/messages", method = RequestMethod.GET)
    public HttpEntity list() {
        List<MessageModel> MessageModelList = chatMessageRepository.findAll(PageRequest.of(0, 50, Sort.Direction.DESC, "createDate")).getContent();
        return new ResponseEntity(MessageModelList, HttpStatus.OK);
    }
}

