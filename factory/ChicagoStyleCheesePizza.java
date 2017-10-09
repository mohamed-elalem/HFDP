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
public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
//        name = "Chicago Style Deep Dish Cheese Pizza";
//        dough = "Extra Thick Crust Dough";
//        sauce = "Plum Tomato Sauce";
//        toppings = new ArrayList<>();
//        toppings.add("Shredded Mozzarella Cheese");
    }
    
    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }

    @Override
    public void prepare() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
