package controller;

import java.awt.Dimension;
import java.util.Observable;

import javax.swing.JFrame;

public class MainView implements java.util.Observer {

	MainView() {
		JFrame frame = new JFrame();
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setSize(new Dimension(600,600));
    	frame.setVisible(true);
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		//who called us and what did they send?
		//System.out.println ("View      : Observable is " + obs.getClass() + ", object passed is " + obj.getClass());

		//model Pull 
		//ignore obj and ask model for value, 
		//to do this, the view has to know about the model (which I decided I didn't want to do)
		//uncomment next line to do Model Pull
    		//myTextField.setText("" + model.getValue());

		//model Push 
		//parse obj
		//myTextField.setText("" + ((Integer)obj).intValue());	//obj is an Object, need to cast to an Integer
		
	}
}
