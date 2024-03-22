package bspo.Assingments.Restaurand;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderItem> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(OrderItem item) {
        System.out.println("Adding item to order: " + item.getProduct().getName());
        items.add(item);
    }

    public List<OrderItem> getItems() {
        return items;
    }
    public double getTotalCost() {
        double total = 0;
        for (OrderItem item : items) {
            total += item.getProduct().getPrice();
        }
        return total;
    }
}
