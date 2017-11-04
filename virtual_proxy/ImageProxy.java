/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtual_proxy;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author mohamed
 */
public class ImageProxy implements Icon {

    private ImageIcon imageIcon;
    private URL imageURL;
    private Thread retrievalThread;
    private boolean retrieving;
    
    public ImageProxy(URL url) {
        imageURL = url;
    }
    
    @Override
    public void paintIcon(Component cmpnt, Graphics grphcs, int i, int i1) {
        if(imageIcon != null) {
            imageIcon.paintIcon(cmpnt, grphcs, i, i1);
        }
        else {
            grphcs.drawString("Loading CD Cover, Please wait ....", i + 300, i1 + 190);
            if(!retrieving) {
                System.out.println("Retrieving");
                retrieving = true;
                retrievalThread = new Thread(new Runnable() {
                    public void run() {
                        try {
                            imageIcon = new ImageIcon(imageURL, "CD Cover");
                            System.out.println("Retrieved\nRepainting...");
                            cmpnt.repaint();
                        } catch(Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                });
                retrievalThread.start();
            }
        }
    }

    @Override
    public int getIconWidth() {
        if(imageIcon != null) {
            return imageIcon.getIconWidth();
        }
        else {
            return 800;
        }
    }

    @Override
    public int getIconHeight() {
        if(imageIcon != null) {
            return imageIcon.getIconHeight();
        }
        else {
            return 600;
        }
    }
    
}
