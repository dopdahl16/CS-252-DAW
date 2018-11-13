package daw;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.*;
import java.util.*;
import javax.swing.*;
import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.io.File;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author opdada01 Daniel Opdahl
 * @author mantno01 Noah Manternach
 * @author nteste01 Teboho Nteso
 * 
 */

/*
DOCUMENTATION
*/

public class ToolBar extends JToolBar implements ActionListener, KeyListener{
    
    public ToolBar(){
        
        setFloatable(false);
        
        JButton play, pause, stop;
        
        play = makeButton("play.png", "play", "playButton");
        pause = makeButton("pause.png", "pause", "pauseButton");
        stop = makeButton("stop.png", "stop", "stopButton");
        
        add(play);
        add(pause);
        add(stop);
        
        play.addActionListener(this);
        pause.addActionListener(this);
        stop.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("play")){
            
        }
        if (e.getActionCommand().equals("pause")){
            
        }
        if (e.getActionCommand().equals("stop")){
            
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    protected JButton makeButton(String imageName, String actionCommand, String altText) {
        
        File img_file = new File("images/" + imageName);
        String img_string = "images/" + imageName;
        ImageIcon img_ico = new ImageIcon(img_string, altText);
        Image image = img_ico.getImage();
        Image newimg = image.getScaledInstance(40, 40,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        img_ico = new ImageIcon(newimg); 
        
        JButton button = new JButton();
        button.setActionCommand(actionCommand);
        button.addActionListener(this);
 
        if (img_file.exists()) {                      //image found
            
            button.setIcon(img_ico);
        } else {                                     //no image found
            button.setText(altText);
            System.err.println("Resource not found: " + img_string);
        }
 
        return button;
    }
    
}
