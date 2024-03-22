package bspo.Assingments.Restaurand;

import bspo.SoftwareDesing.Restaurant.Tables.FactoryTables;
import bspo.SoftwareDesing.Restaurant.Tables.ITable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Checker checker = new Checker();
    static Menu menu;
    static Order order;
    static Billing billing;
    public static void main(String[] args) {

        menu = readMenu();
        order = new Order();
        billing = new Billing(order);
        Restaurant restaurant = new Restaurant(readTables(), menu);
        System.out.println("Select a Table to order: ");
        restaurant.printTables();
        int table = Integer.parseInt(scanner.nextLine());
        checker.checkTable(restaurant.tables.get(table));

        printMenu(restaurant);
    }

    public static void printMenu(Restaurant restaurant) {

        System.out.println("Select a product: ");
        System.out.println("1 - dishes");
        System.out.println("2 - beverages");
        System.out.println("3 - desserts");
        System.out.println("4 - Billing");

        String productType = scanner.nextLine();
        if (productType.toLowerCase().equals("billing")) {
            billing.prinBilling();
            return;
        }
        restaurant.printMenu(productType);

        System.out.println("Select a product to add to order: ");
        String product = scanner.nextLine();

        System.out.println("Enter to special request: ");
        String request = scanner.nextLine();
        order.addItem(new OrderItem(menu.getProduct(product), request));

        printMenu(restaurant);
    }

    public static List<ITable> readTables() {
        List<ITable> tables = new ArrayList<>();
        tables.add(FactoryTables.getTable(0, "occupied"));
        tables.add(FactoryTables.getTable(1, "vacant"));
        tables.add(FactoryTables.getTable(2, "waiting"));
        tables.add(FactoryTables.getTable(3, "occupied"));
        tables.add(FactoryTables.getTable(4, "vacant"));
        return tables;
    }

    public static Menu readMenu() {
        List<Product> dishes = new ArrayList<>();
        List<Product> beverages = new ArrayList<>();
        List<Product> desserts = new ArrayList<>();

        dishes.add(new Product("Pizza", 10));
        dishes.add(new Product("Pasta", 8));
        dishes.add(new Product("Salad", 5));

        beverages.add(new Product("Coke", 2));
        beverages.add(new Product("Beer", 4));
        beverages.add(new Product("Wine", 6));

        desserts.add(new Product("Ice Cream", 3));
        desserts.add(new Product("Cake", 4));
        desserts.add(new Product("Coffee", 2));

        return new Menu(dishes, beverages, desserts);
    }
    public void selectProduct(){

    }
}
