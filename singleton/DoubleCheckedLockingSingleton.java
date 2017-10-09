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
public class DoubleCheckedLockingSingleton {
    private static volatile DoubleCheckedLockingSingleton uniqueInstance;
    private static int counter;
    
    private DoubleCheckedLockingSingleton() {
    }
    
    public static DoubleCheckedLockingSingleton getInstance() {
        if(uniqueInstance == null) {
            synchronized(DoubleCheckedLockingSingleton.class) {
                uniqueInstance = new DoubleCheckedLockingSingleton();
                counter++;
            }
        }
        return uniqueInstance;
    }
    
    
    @Override
    public String toString() {
        return "DoubleCheckedLockingSingleton [" + System.identityHashCode(this) + "] Initialized " + counter + " times";
    }
}
