package models;

import java.util.List;

public class Order {
    List<LP> lps;
    public Order(String s) {
    }

    public void addLP(int q, String prod) {
        this.lps.add(new LP(q,prod));
    }

    public Object getLP(int i) {

        return null;
    }
}
