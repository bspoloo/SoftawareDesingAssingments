package bspo.Assingments.Restaurand.Tables;

import bspo.SoftwareDesing.Restaurant.Order;

public class NullTable implements ITable{
    @Override
    public void setOrder(Order order) {
        System.out.println("Table don't exist.");
    }

    @Override
    public String getStatus() {
        return null;
    }

    @Override
    public int getNumber() {
        return 0;
    }
}
