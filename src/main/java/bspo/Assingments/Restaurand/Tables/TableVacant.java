package bspo.Assingments.Restaurand.Tables;

import bspo.SoftwareDesing.Restaurant.Order;

public class TableVacant implements ITable{
    int number;
    Order order;
    String status;
    public TableVacant(int number, String status) {
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
