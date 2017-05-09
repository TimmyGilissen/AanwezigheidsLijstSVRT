package controller;

public class Controller {
	
	private MainView mainFrame;
	private MainMenuView mainView;
	
	Controller(){
		StartApplication();
	}

	
	public void StartApplication(){
		mainFrame = new MainView();
		
		mainView = new MainMenuView();
		mainView.setVisible(true);
		
		mainFrame.add(mainView);
	}
}
