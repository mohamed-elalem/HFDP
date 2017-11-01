package iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mohamed
 */
//public class MenuItem {
//    private String name;
//    private String description;
//    private boolean vegetarian;
//    private double price;
//
//    public String getName() {
//        return name;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public boolean isVegetarian() {
//        return vegetarian;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public MenuItem(String name, String description, boolean vegetarian, double price) {
//        this.name = name;
//        this.description = description;
//        this.vegetarian = vegetarian;
//        this.price = price;
//    }
//}

public class MenuItem extends MenuComponent {
    private String name;
    private String description;
    private boolean vegetarian;
    private double price;
    
    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public double getPrice() {
        return price;
    }
    
    @Override
    public void print() {
        System.out.print(" " + getName());
        if(isVegetarian()) {
            System.out.print(" (v)");
        }
        System.out.print(", " + getPrice());
        System.out.println("    -- " + getDescription());
    }
    
    
}
