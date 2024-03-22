package bspo.Assingments.Restaurand.Tables;

import bspo.SoftwareDesing.Restaurant.Order;

public class TableWaiting implements ITable{
    int number;
    Order order;
    String status;
    public TableWaiting(int number, String status) {
        this.number = number;
        this.status = status;
        this.order = new Order();
    }
    @Override
    public void setOrder(Order order) {
        this.order = order;
    }
    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public int getNumber() {
        return number;
    }
}
