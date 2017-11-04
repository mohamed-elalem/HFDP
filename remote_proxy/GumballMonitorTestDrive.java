/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 *
 * @author mohamed
 */
public class GumballMonitorTestDrive {
    public static void main(String [] args) throws NotBoundException, MalformedURLException {
        String location = "rmi://localhost/gumballmachine";
        try {
            GumballMachineRemote gumballMachine = (GumballMachineRemote) Naming.lookup(location);
            GumballMonitor monitor = new GumballMonitor(gumballMachine);
        } catch(RemoteException ex) {
            ex.printStackTrace();
        }
    }
}
