package bspo.Assingments.Restaurand;

import java.util.List;

public class Menu {
    List<Product> dishes;
    List<Product> beverages;
    List<Product> desserts;
    public Menu ( List<Product> dishes, List<Product> beverages, List<Product> desserts) {
        this.dishes = dishes;
        this.beverages = beverages;
        this.desserts = desserts;
    }
    public void printMenuDishes(){
        System.out.println("##################################################");
        System.out.println("Dishes:");
        for (Product dish : dishes) {
            System.out.println(dish.getName() + " - " + dish.getPrice());
        }
    }
    public void printMenuBeverages(){
        System.out.println("##################################################");

        System.out.println("Beverages:");
        for (Product beverage : beverages) {
            System.out.println(beverage.getName() + " - " + beverage.getPrice());
        }
    }
    public void printMenuDesserts(){
        System.out.println("##################################################");
        System.out.println("Desserts:");
        for (Product dessert : desserts) {
            System.out.println(dessert.getName() + " - " + dessert.getPrice());
        }
    }
    public Product getProduct(String name){
        for (Product dish : dishes) {
            if (dish.getName().equals(name)){
                return dish;
            }
        }
        for (Product beverage : beverages) {
            if (beverage.getName().equals(name)){
                return beverage;
            }
        }
        for (Product dessert : desserts) {
            if (dessert.getName().equals(name)){
                return dessert;
            }
        }
        System.out.println("Product not found");
        return null;
    }
}
