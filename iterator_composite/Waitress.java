/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;
import java.util.Iterator;
/**
 *
 * @author mohamed
 */
//public class Waitress {
//    Menu pancakeMenu;
//    Menu dinerMenu;
//    
//    public Waitress(Menu pancakeMenu, Menu dinerMenu) {
//        this.pancakeMenu = pancakeMenu;
//        this.dinerMenu = dinerMenu;
//    }
//    
//    public void printMenu() {
//        Iterator pancakeIterator = pancakeMenu.createIterator();
//        Iterator dinerIterator = dinerMenu.createIterator();
//        System.out.println("Menu\n--------\nBreakfast");
//        printMenu(pancakeIterator);
//        System.out.println("\nLUNCH\n");
//        printMenu(dinerIterator);
//    }
//    
//    public void printMenu(Iterator iterator) {
//        while(iterator.hasNext()) {
//            MenuItem menuItem = (MenuItem) iterator.next();
//            System.out.println(menuItem.getName() + ", " + menuItem.getPrice() + ", " + menuItem.getDescription());
//        }
//    }
//}

class Waitress {
    MenuComponent allMenus;
    
    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }
    
    public void printMenu() {
        allMenus.print();
    }
    
    
    public void printVegetarianMenu() {
        Iterator iterator = allMenus.createIterator();
        System.out.println("\nVegetarian Menu\n----------");
        
        while(iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            try {
                if(menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch(UnsupportedOperationException ex) {
                
            }
        }
    }
}