package com.ru.chat;

import org.joda.time.LocalDateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "NewChat")
public class MessageModel {

    @Id
    private String id;

    private String text;
    private String author;
    private LocalDateTime createDate;

    public MessageModel() {

    }
    public MessageModel(String text, String author, LocalDateTime createDate) {
        this.text = text;
        this.author = author;
        this.createDate = createDate;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "{" +"\"id\":\"" + id + '\"' +
                ",\"text\":\"" + text + '\"' +
                ",\"author\":\"" + author + '\"' +
                ",\"createDate\":\"" + createDate + "\"" +
                '}';
    }
}