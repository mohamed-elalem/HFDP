/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author mohamed
 */
public class BasicSingleton {
    private static BasicSingleton uniqueInstance;
    
    private static int counter;
    
    private BasicSingleton() {
        counter = 0;
    }
    
    public static BasicSingleton getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new BasicSingleton();
            counter++;
        }
        return uniqueInstance;
    }
    
    
    
    @Override
    public String toString() {
        return "BasicSingleton [" + System.identityHashCode(this) + "] Initialized " + counter + " times";
    }
}
