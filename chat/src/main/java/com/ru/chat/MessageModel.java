package com.ru.chat;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


@Document(collection = "NewChat")
public class MessageModel {

    @Id
    private String id;

    private String text;
    private String author;
    private Date createDate;

    //Date createDate = new Date();
    //java.text.SimpleDateFormat df = new java.text.SimpleDateFormat("MM/dd");
    //String createDateString = df.format(createDate);



    //java.text.SimpleDateFormat df = new java.text.SimpleDateFormat("MM/dd");
    //String createDateString = df.format(createDate);


    public MessageModel(String text, String author, Date createDate) {
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

    public  Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "{" +"\"id\":\"" + id + '\"' + ",\"text\":\"" + text + '\"' + ",\"author\":\"" + author + '\"' +
                ",\"createDate\":\"" + createDate + "\"" + '}';
    }
}