/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 *
 * @author mohamed
 */
//public interface Menu {
//    public java.util.Iterator createIterator();
//}


public class Menu extends MenuComponent {
    private List<MenuComponent> menuComponents;
    private String name;
    private String description;
    
    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
        this.menuComponents = new ArrayList<>();
    }
    
    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }
    
    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }
    
    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }
    
    @Override
    public String getName() {
        return this.name;
    }
    
    @Override
    public String getDescription() {
        return this.description;
    }
    
    @Override
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("-------------------------");
        
        Iterator iterator = menuComponents.iterator();
        
        while(iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }
    }
    
    @Override
    public Iterator createIterator() {
        return menuComponents.iterator();
    }
}