package bspo.Assingments.Restaurand.Tables;

import bspo.SoftwareDesing.Restaurant.Order;

public interface ITable {
    void setOrder(Order order);
    String getStatus();
    int getNumber();
}
