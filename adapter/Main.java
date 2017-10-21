/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mohamed
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        
        System.out.println("The turkey says.....");
        turkey.gobble();
        turkey.fly();
        
        System.out.println("\nThe duck says.....");
        duck.quack();
        turkey.fly();
        
        System.out.println("\nThe turkeyAdapter says.....");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
    
}
