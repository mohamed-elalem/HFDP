/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mohamed
 */
public class GumballMachineTestDrive {
    public static void main(String [] args) {
        GumballMachineRemote gumballMachine = null;
        try {
            gumballMachine = new GumballMachine("Seattle", 40);
            Naming.rebind("rmi://127.0.0.1/gumballmachine", gumballMachine);
        } catch(RemoteException ex) {
            ex.printStackTrace();
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }
    }
}
