package controller;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Calendar;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

public class NewTrainingView {
	
	public NewTrainingView() {
		JFrame frame = new JFrame();
	    frame.getContentPane().setLayout(new GridBagLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);           
        // FRAME FOR DEVELOPPING
        	frame.setSize(600,600);
         //FULL SCREEN
	        //frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
	        //frame.setUndecorated(true);
        GridBagConstraints c = new GridBagConstraints();
        	c.fill = GridBagConstraints.HORIZONTAL;
        	c.weightx = 0.1;
        	c.weighty = 0.1;
		
		JButton validate = new JButton("OK");
		
		c.gridx = 0;
		c.gridy = 0;
		c.anchor = GridBagConstraints.FIRST_LINE_START;
		frame.add(this.algemeenPanel(), c);
		//frame.add(validate);
		
		frame.setVisible(true);
	}
	
	private JPanel algemeenPanel() {
		JPanel algemeenPanel  = new JPanel();
		algemeenPanel.setBorder(new TitledBorder("ALGEMEEN"));
		algemeenPanel.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		JTextField ingevuldTextField = new JTextField(5);
		TitledBorder ingevuldDoorBorder = new TitledBorder("Ingevuld door:");
			ingevuldTextField.setBorder(ingevuldDoorBorder);
			ingevuldTextField.setSize(new Dimension(300,16));
		
		JTextField ingevuldTextFieldAnders = new JTextField(5);
		TitledBorder ingevuldDoorBorderAnders = new TitledBorder("Ingevuld door Anders:");
			ingevuldTextFieldAnders.setBorder(ingevuldDoorBorderAnders);
			ingevuldTextFieldAnders.setSize(new Dimension(300,16));
			
		JLabel typeLabel = new JLabel("Type");
		JComboBox<String> comboType = new JComboBox<String>();
		JPanel typePanel = new JPanel(new GridBagLayout());
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.1;
    	c.weighty = 0.1;
    	c.gridx = 0;
    	c.gridy = 0;
		typePanel.add(typeLabel, c);
		c.gridx = 1;
		typePanel.add(comboType, c);
			
		JLabel pisteLabel = new JLabel("Piste");
		JComboBox<String> comboPiste = new JComboBox<String>();
		JPanel pistePanel = new JPanel(new GridBagLayout());
		c.gridx = 0;
		pistePanel.add(pisteLabel, c);
		c.gridx = 1;
		pistePanel.add(comboPiste, c);
			
		// TEXFIELDS
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.1;
    	c.weighty = 0.1;
    	c.gridx = 0;
    	c.gridy = 0;
		algemeenPanel.add(ingevuldTextField, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.1;
    	c.weighty = 0.1;
    	c.gridx = 1;
    	c.gridy = 0;
		algemeenPanel.add(ingevuldTextFieldAnders, c);
			
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.1;
    	c.weighty = 0.1;
    	c.gridx = 0;
    	c.gridy = 1;
		algemeenPanel.add(datePanelCreator(), c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.1;
    	c.weighty = 0.1;
    	c.gridx = 1;
    	c.gridy = 1;
		algemeenPanel.add(hourPanelCreator(), c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.1;
    	c.weighty = 0.1;
    	c.gridx = 0;
    	c.gridy = 2;
		algemeenPanel.add(typePanel, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.1;
    	c.weighty = 0.1;
    	c.gridx = 1;
    	c.gridy = 2;
		algemeenPanel.add(pistePanel, c);
		
		return algemeenPanel;
	}
	
	private JPanel hourPanelCreator(){
		JPanel hourPanel = new JPanel();
		hourPanel.setLayout(new GridBagLayout());
		GridBagConstraints cHourPanel = new GridBagConstraints();
		
		JLabel uurLabel = new JLabel("Uur");
		JLabel uurVan = new JLabel("Van");
		JLabel uurTot = new JLabel("Tot");
		JLabel dubbelPunt = new JLabel(":");
		
		int i;
		String[] urenStr = new String[24];
		String[] minStr = new String[4];
		for (i=0; i<=23; i++) urenStr[i] = String.valueOf(i);
		for (i=0; i<=45; i=i+15) minStr[i/15] = String.valueOf(i);
		JComboBox<String> urenComboVan = new JComboBox<String>(urenStr);
		JComboBox<String> minutenComboVan = new JComboBox<String>(minStr);
		JComboBox<String> urenComboTot = new JComboBox<String>(urenStr);
		JComboBox<String> minutenComboTot = new JComboBox<String>(minStr);
		
		cHourPanel.weightx = 0.1;
		cHourPanel.weighty = 0.1;
		
		cHourPanel.gridx = 0;
		cHourPanel.gridy = 0;
		hourPanel.add(uurLabel,cHourPanel);
		
		cHourPanel.gridx = 0;
		cHourPanel.gridy = 1;
		hourPanel.add(uurVan,cHourPanel);
		
		cHourPanel.gridx = 1;
		cHourPanel.gridy = 1;
		hourPanel.add(urenComboVan,cHourPanel);
		
		cHourPanel.gridx = 2;
		cHourPanel.gridy = 1;
		hourPanel.add(dubbelPunt,cHourPanel);
		
		cHourPanel.gridx = 3;
		cHourPanel.gridy = 1;
		hourPanel.add(minutenComboVan,cHourPanel);
		
		cHourPanel.gridx = 0;
		cHourPanel.gridy = 2;
		hourPanel.add(uurTot,cHourPanel);
		
		cHourPanel.gridx = 1;
		cHourPanel.gridy = 2;
		hourPanel.add(urenComboTot,cHourPanel);
		
		cHourPanel.gridx = 2;
		cHourPanel.gridy = 2;
		hourPanel.add(dubbelPunt,cHourPanel);
		
		cHourPanel.gridx = 3;
		cHourPanel.gridy = 2;
		hourPanel.add(minutenComboTot,cHourPanel);
		
		return hourPanel;
	}
	
	private JPanel datePanelCreator () {
		// DATUM
		JLabel datum = new JLabel("Datum");
		Properties p = new Properties();
			p.put("text.today", "Vandaag");
			p.put("text.month", "Maand");
			p.put("text.year", "Jaar");
		UtilDateModel model = new UtilDateModel();
		JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
		
		Calendar date = Calendar.getInstance();
		model.setDate(date.get(Calendar.YEAR), date.get(Calendar.MONTH), date.get(Calendar.DAY_OF_MONTH));
				
		JPanel datePanel1  = new JPanel();
		datePanel1.setLayout(new GridBagLayout());
		GridBagConstraints cDatePanel = new GridBagConstraints(); 
			cDatePanel.fill = GridBagConstraints.HORIZONTAL;
			cDatePanel.weightx = 0.1;
	    	cDatePanel.weighty = 0.1;
	    	cDatePanel.gridx = 0;
	    	cDatePanel.gridy = 0;
	    	datePanel1.add(datum, cDatePanel);
			
			cDatePanel.fill = GridBagConstraints.HORIZONTAL;
			cDatePanel.weightx = 0.1;
	    	cDatePanel.weighty = 0.1;
	    	cDatePanel.gridx = 1;
	    	cDatePanel.gridy = 0;
	    	datePanel1.add(datePicker, cDatePanel);
	    	
		return datePanel1;
	}

}
