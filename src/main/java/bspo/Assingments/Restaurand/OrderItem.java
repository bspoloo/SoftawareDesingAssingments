package bspo.Assingments.Restaurand;

class OrderItem {
    private Product product;
    private String specialRequest;

    public OrderItem(Product menuItem, String specialRequest) {
        this.product = menuItem;
        this.specialRequest = specialRequest;
    }

    public Product getProduct() {
        return product;
    }

    public String getSpecialRequest() {
        return specialRequest;
    }
}
