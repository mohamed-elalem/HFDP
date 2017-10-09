/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import java.util.ArrayList;

/**
 *
 * @author mohamed
 */
abstract class Pizza {
    
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Cheese cheese;
    protected Clam clam;
    protected ArrayList<String> toppings;
    
//    public void prepare() {
//        System.out.println("Preparing " + this.name);
//        System.out.println("Tossing Dough....");
//        System.out.println("Adding Sauce....");
//        System.out.println("Adding toppings:");
//        for(String topping : this.toppings) {
//            System.out.println("\t" + topping);
//        }
//    }
    
    public abstract void prepare();
    
    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }
    
    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
    
    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
