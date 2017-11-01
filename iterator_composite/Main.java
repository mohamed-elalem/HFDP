/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

/**
 *
 * @author mohamed
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PancakeHouseMenu", "Breakfast");
        MenuComponent dinerMenu = new Menu("DinerMenu", "Lunch");
        MenuComponent cafeMenu = new Menu("CafeMenu", "Dinner");
        MenuComponent dessertMenu = new Menu("Dessert Menu", "Dessert of course");
        
        MenuComponent allMenus = new Menu("All Menus", "All menus combined");
        
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);
        
        dinerMenu.add(new MenuItem("Pasta", "Spaghetti with marinara sauce, and a slice of sourdough bread", true, 3.89));
        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("Apple Pie", "Apple pie with a flackey clust", true, 1.59));
        
        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
        waitress.printVegetarianMenu();
    }
    
}
