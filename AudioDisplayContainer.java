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
import javax.sound.sampled.*;


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

public class AudioDisplayContainer extends JPanel implements ActionListener{
    
    public AudioDisplayContainer (){
        
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createLineBorder(Color.green));
        setMinimumSize(new Dimension(500,10));
        
        AudioFileVisualDisplay audio_file_display = new AudioFileVisualDisplay();
        AudioFileInfo audio_file_info = new AudioFileInfo();
        
        add(audio_file_info, BorderLayout.LINE_START);
        add(audio_file_display, BorderLayout.LINE_END);
        
        

        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
