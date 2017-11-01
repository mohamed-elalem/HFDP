///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package iterator;
//
//import java.util.ArrayList;
//
///**
// *
// * @author mohamed
// */
//public class PancakeHouseMenu implements Menu {
//    private ArrayList menuItems;
//    
//    public PancakeHouseMenu() {
//        menuItems = new ArrayList();
//        
//        addItem("Pancake item 1", "gebrish", true, 2.99);
//        addItem("Pancake item 2", "gebrish", false, 1.99);
//        addItem("Pancake item 3", "gebrish", true, 5.99);
//        addItem("Pancake item 4", "gebrish", false, 4.99);
//        addItem("Pancake item 5", "gebrish", true, 3.99);
//    }
//    
//    public void addItem(String name, String description, boolean vegetarian, double price) {
//        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
//        menuItems.add(menuItem);
//    }
//    
//    @Override
//    public java.util.Iterator createIterator() {
////        return new PancakeHouseMenuIterator(menuItems);
//        return menuItems.iterator();
//    }
//}
