/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author mohamed
 */
public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
    
    private String location;
    private int count;
    
    
    public GumballMachine(String location, int count) throws RemoteException {
        this.location = location;
        this.count = count;
    }
    
    public String getLocation() throws RemoteException {
        return location;
    }
    
    public int getCount() throws RemoteException {
        return count;
    }

    @Override
    public State getState() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
