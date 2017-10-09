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
public class NYStylePizzaStore extends PizzaStore {
    
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        
        if(type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }
        else if(type.equals("pepperoni")) {
//            pizza = new PepperoniPizza(ingredientFactory);
        }
        else if(type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }
        else if(type.equals("viggie")) {
//            pizza = new NYStyleVeggiePizza();
        }
        return pizza;
    }
    
}
