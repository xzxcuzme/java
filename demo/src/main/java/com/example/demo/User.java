package com.example.demo;


public class User {
    private Integer id;
    private String FIO;
    private String phone;

    public void setId (Integer id){
        this.id=id;
    }
    public String toString() {
        return String.valueOf((this.id)+" "+this.FIO+" "+this.phone);
    }

    public User(Integer id, String FIO, String phone) {
        this.id = id;
        this.FIO = FIO;
        this.phone = phone;
    }
}
