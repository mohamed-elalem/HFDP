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
public class SynchronizedSingleton {
    private static SynchronizedSingleton uniqueInstance;
    private static int counter;
    
    
    private SynchronizedSingleton() {
    }
    
    public static synchronized SynchronizedSingleton getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new SynchronizedSingleton();
            counter++;
        }
        return uniqueInstance;
    }
    
    
    @Override
    public String toString() {
        return "SynchronizedSingleton [" + System.identityHashCode(this) + "] Initialized " + counter + " times";
    }
}
