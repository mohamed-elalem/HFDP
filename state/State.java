/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author mohamed
 */
public interface State {
    
    public void insertQuarter();
    
    public void ejectQuarter();
    
    public void turnCrank();
    
    public void dispense();
}
