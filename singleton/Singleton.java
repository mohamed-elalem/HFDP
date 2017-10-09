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
public class Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * Basic Singleton without any thread safe code
         */
        
        new Thread(()-> {
            BasicSingleton singleton;
            long start = System.currentTimeMillis();
            for(int i = 0; i < 100; i++) {
                singleton = BasicSingleton.getInstance();
                System.out.println(singleton);
            }
            System.out.println("BasicSingleton finished in " + (System.currentTimeMillis() - start) / 1000.0);
        }).start();
        
        /**
         * Singleton using synchronized method
         */
        
        new Thread(()-> {
            SynchronizedSingleton singleton;
            long start = System.currentTimeMillis();
            for(int i = 0; i < 100; i++) {
                singleton = SynchronizedSingleton.getInstance();
                System.out.println(singleton);
            }
            System.out.println("SynchronizedSingleton finished in " + (System.currentTimeMillis() - start) / 1000.0);
        }).start();
        
        /**
         * Singleton using synchronized block
         */
        
        new Thread(()-> {
            DoubleCheckedLockingSingleton singleton;
            long start = System.currentTimeMillis();
            for(int i = 0; i < 100; i++) {
                singleton = DoubleCheckedLockingSingleton.getInstance();
                System.out.println(singleton);
            }
            System.out.println("DoubleCheckedLockingSingleton finished in " + (System.currentTimeMillis() - start) / 1000.0);
        }).start();
    }
    
}
