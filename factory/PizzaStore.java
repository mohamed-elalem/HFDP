/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author mohamed
 */
public abstract class PizzaStore {
//    private SimplePizzaFactory factory;
//    
//    public PizzaStore(SimplePizzaFactory factory) {
//        this.factory = factory;
//    }
    
    public Pizza orderPizza(String type) {
        
//        Pizza pizza = factory.createPizza(type);
        
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    
    public abstract Pizza createPizza(String type);
}
