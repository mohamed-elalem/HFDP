///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package iterator;
//
///**
// *
// * @author mohamed
// */
//public class DinerMenu extends MenuComponent {
//    private static final int MAX_ITEMS = 6;
//    private int numberOfItems = 0;
//    MenuItem[] menuItems;
//    
//    public DinerMenu() {
//        menuItems = new MenuItem[MAX_ITEMS];
//        
//        addItem("Diner item 1", "gebrish", true, 1.99);
//        addItem("Diner item 2", "gebrish", false, 2.99);
//        addItem("Diner item 3", "gebrish", false, 3.99);
//        addItem("Diner item 4", "gebrish", false, 4.99);
//        
//    }
//    
//    public void addItem(String name, String description, boolean vegetarian, double price) {
//        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
//        if(numberOfItems >= MAX_ITEMS) {
//            System.out.println("Max reached");
//        }
//        else {
//            menuItems[numberOfItems++] = menuItem;
//        }
//    }
//    
//    @Override
//    public java.util.Iterator createIterator() {
//        return new DinerMenuIterator(menuItems);
//    }
//}
