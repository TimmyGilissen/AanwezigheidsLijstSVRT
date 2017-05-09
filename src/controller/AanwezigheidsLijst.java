package controller;

public class AanwezigheidsLijst {

	public AanwezigheidsLijst() {
		Training alTrainingModel = new Training();
		MainView alView = new MainView();
		
		alTrainingModel.addObserver(alView);
	}
}
