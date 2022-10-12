package models;
import java.util.LinkedList;
import java.util.List;

public class User {
    List<Order> orderList;
    private String userId;
    private String name;
    private String surname;

    public String getUserId(){

        return null;
    }
    public User(String userID, String name, String surname) {
        this.userId = userID;
        this.name = name;
        this.surname = surname;
        this.orderList = new LinkedList<Order>();
    }

    public List<Order> orders() {
        return null;
    }

    public void addOrder(Order o) {
    }
}
