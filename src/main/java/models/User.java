package models;
import java.util.LinkedList;
import java.util.List;

public class User {
    List<Order> orderList;
    private String userId;
    private String name;
    private String surname;

    public String getUserId(){
    }
    public User(String userID, String name, String surname) {
        this.userId = userID;
        this.name = name;
        this.surname = surname;
        this.orderList = new LinkedList<Order>();
    }
}
