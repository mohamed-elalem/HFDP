/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtual_proxy;

import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author mohamed
 */
public class Virtual_proxy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException {
        JFrame frame = new JFrame("Virtual Proxy");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(800, 600);
        
        URL init = new URL("https://eoimages.gsfc.nasa.gov/images/imagerecords/87000/87903/tyuleniy_oli_2016097_lrg.jpg");
        Icon icon = new ImageProxy(init);
        JLabel imageComponent = new JLabel(icon);
        frame.getContentPane().add(imageComponent);
        
        frame.setVisible(true);
    }
    
}
