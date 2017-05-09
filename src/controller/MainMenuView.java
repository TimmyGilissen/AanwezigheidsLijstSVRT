package controller;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class MainMenuView extends JPanel {
      
    private JFrame frame;
	private JPanel panel;
    private JLabel titel, iconLabel;
    private ImageIcon icon;
    private JButton newTraining, oldTraining, settings;

    public MainMenuView(){	
        panel = new JPanel(new GridBagLayout ());
        GridBagConstraints c = new GridBagConstraints();
        
        ImageIcon icon = new ImageIcon("images/SVRT_icon.png");
        this.iconLabel = new JLabel(icon);
	        c.fill = GridBagConstraints.FIRST_LINE_START;
        	c.gridx = 0;
	        c.gridy = 0;
	        c.weighty = 0.2;
	    panel.add(this.iconLabel, c);
        
        this.titel = new JLabel("Hoofdmenu");
	        c.gridx = 1;
	        c.gridy = 0;
	        c.weighty = 0.2;
        panel.add(this.titel, c);
        
        this.newTraining = new JButton("Nieuwe Training");        
	        c.gridx = 0;
	        c.gridy = 1;
	        c.weighty = 0.4;
        panel.add(this.newTraining, c);    
        
        this.oldTraining = new JButton("Vorige Training Opzoeken");        
	        c.gridx = 0;
	        c.gridy = 2;
	        c.weighty = 0.6;
        panel.add(this.oldTraining, c);    
    
	    this.settings = new JButton("Instellingen");        
		    c.gridx = 0;
		    c.gridy = 3;
		    c.weighty = 0.8;
	    panel.add(this.settings, c);    
    }
    
    
}
