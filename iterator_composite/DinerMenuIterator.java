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
public class DinerMenuIterator implements java.util.Iterator {
    
    private MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }
    
    @Override
    public boolean hasNext() {
        if(position >= items.length || items[position] == null) {
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position++;
        return menuItem;
    }
    
}
