/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

import java.rmi.RemoteException;

/**
 *
 * @author mohamed
 */
public class GumballMonitor {
    private GumballMachineRemote gumballMachine;
    
    public GumballMonitor(GumballMachineRemote gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    
    public void report() throws RemoteException {
        System.out.println("GumballMachine: " + gumballMachine.getLocation());
        System.out.println("Current Inventory: " + gumballMachine.getCount());
        
    }
}
