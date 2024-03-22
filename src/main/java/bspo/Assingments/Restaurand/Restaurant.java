package bspo.Assingments.Restaurand;

import bspo.SoftwareDesing.Restaurant.Tables.ITable;

import java.util.List;

public class Restaurant {
    List<ITable> tables;
    Menu menu;
    public Restaurant( List<ITable> tables, Menu menu) {
        this.tables = tables;
        this.menu = menu;
    }
    public void printTables(){
        for (ITable table : tables) {
            System.out.println(table.getNumber() + " - " + table.getStatus());
        }
    }
    public void printMenu(String productType){
        switch (productType.toLowerCase()){
            case "dishes":
                menu.printMenuDishes();
                break;
            case "beverages":
                menu.printMenuBeverages();
                break;
            case "desserts":
                menu.printMenuDesserts();
                break;
            default:
                System.out.println("Invalid product type");
        }
    }
}
