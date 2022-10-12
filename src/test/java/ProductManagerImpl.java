import models.Order;
import models.Product;
import models.User;

import java.io.ObjectInputStream;
import java.util.*;

public class ProductManagerImpl implements ProductManager {

    List<Product> products;
    //private final ArrayList<Object> products;
    HashMap<String, User> users;
    //private final HashMap<Object, Object> users;
    Queue<Order> orders;
    //private final LinkedList<Object> orders; //--> esto es lo que me ponia el intellij para
    //solucionar los errores, pero lo de arriba es lo que tenia el profe y ns que diferencia hay

    public ProductManagerImpl(){
        this.products = new ArrayList<>();
        this.users = new HashMap<>();
        this.orders = new LinkedList<>();
    }

    @Override
    public List<Product> productsByPrice() {

        List<Product> list = new ArrayList<>(this.products);
        list.sort((Product p1, Product p2) -> Double.compare(p1.getPrice(), p2.getPrice()));

        list.sort(new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.getPrice(), p2.getPrice());
            }

        });

        return list;
    }

    @Override
    public List<Product> productsBySales() {
        List<Product> list = new ArrayList<>(this.products);
        list.sort((Product p1, Product p2) -> Double.compare(p1.getNumSales(), p2.getNumSales()));

        return list;
    }

    @Override
    public void addOrder(Order order) {
        this.orders.add(order);
    }



    @Override
    public Order processOrder() {
        Order o = this.orders.poll();
        String userId = o.getUserId();
        User user = this.getUser(userId);
        user.addOrder(o);

        for (order.LP lp: o.lps()){
            incNumSales(lp.getProductId(), lp.getQuantity());
        }
        return o;
    }


    private User getUser(String userId) {
        return null;
    }

    private void incNumSales (String productId, int quantity){
        Product product = getProduct(productId);
        product.incNumSales(quantity);
    }

    @Override
    public List<Order> ordersByUser(String userId) {
        User user = this.users.get(userId);
        return user.orders();
    }

    @Override
    public void addUser(String s, String name, String surname) {

    }

    @Override
    public void addProduct(String productId, String name, double price) {

    }

    @Override
    public Product getProduct(String productId) {
        Product product = (Product) this.products.stream(), filter(p -> p.getProductId().equals(productId)).findAny().get();
        return product;
    }

    @Override
    public int numUsers() {
        return 0;
    }

    @Override
    public int numProducts() {
        return 0;
    }

    @Override
    public int numOrders() {
        return 0;
    }

    @Override
    public int numSales(String b001) {
        return 0;
    }
}
