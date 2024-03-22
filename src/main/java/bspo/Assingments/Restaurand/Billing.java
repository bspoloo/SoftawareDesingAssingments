package bspo.Assingments.Restaurand;

public class Billing {
    Order order;
    public Billing(Order order) {
        this.order = order;
    }
    public void prinBilling() {
        System.out.println("Facturation");
        System.out.println("Order: ");
        for(OrderItem order : order.getItems()){
            System.out.println(order.getProduct().getName() + " " + order.getProduct().getPrice());
        }
        System.out.println("Total: " + order.getTotalCost());
    }
}
