package com.example.demo;


//import org.apache.log4j.Logger;

/**
 * Класс пользователь.
 * @author Илья Тришин i@gmail.com
 * @version 1.0
 */

public class User {

    /** final static Logger logger = Logger.getLogger(User.class);
    public void fict() {
        logger.info("Test log");
    }
     */
    //@Id
    private Integer id;

    private String FIO;

    private String phone;

    public User(Integer id, String FIO, String phone) {
        this.id = id;
        this.FIO = FIO;
        this.phone = phone;
    }
    public Integer getId() {
        return id;
    }

    public String getFIO() {
        return FIO;
    }

    public String getPhone() {
        return phone;
    }

    /**@Override
    public String toString() {
        return String.format(
                "Customer[id=%s, FIO='%s', phone='%s']",
                id, FIO, phone);
    }

     */
    /** public void setId(Integer id) {
        this.id = id;
    }

    public String toString() {
        return String.valueOf((this.id)+" "+this.FIO+" "+this.phone);
    }
     */
}
