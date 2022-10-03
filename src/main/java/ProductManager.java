import models.Order;
import models.Product;
import java.util.List;

public interface ProductManager {
    public List<Product> productsByPrice();
    public List<Product> productsBySales();
    public void addOrder(Order order);
    public Order processOrder();
    public List<Order> ordersByUser(String userID);
}
