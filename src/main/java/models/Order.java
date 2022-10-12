package models;

import java.util.List;

public class Order {
    List<LP> lps;
    public Order(String s) {
    }

    public void addLP(int q, String prod) {
        this.lps.add(new LP(q,prod));
    }

    public LP getLP(int i) {
        return this.lps.get(i);
    }

    public String getUserId() {
        return null;
    }

    public LP[] lps() {
        return new LP[0];
    }
}
