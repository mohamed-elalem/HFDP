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
public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        }
        else if(type.equals("pepperoni")) {
            pizza = new ChicagoStylePepperoniPizza();
        }
        else if(type.equals("clam")) {
            pizza = new ChicagoStyleClamPizza();
        }
        else if(type.equals("viggie")) {
            pizza = new ChicagoStyleVeggiePizza();
        }
        return pizza;
    }
    
}
