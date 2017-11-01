/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

import java.util.ArrayList;

/**
 *
 * @author mohamed
 */
public class PancakeHouseMenuIterator implements java.util.Iterator {
    
    private ArrayList menuItems;
    private int position = 0;
    
    public PancakeHouseMenuIterator(ArrayList menuItems) {
        this.menuItems = menuItems;
    }
    
    @Override
    public boolean hasNext() {
        return position < menuItems.size();
    }

    @Override
    public Object next() {
        MenuItem menuItem = (MenuItem) menuItems.get(position);
        position++;
        return menuItem;
    }
    
}
