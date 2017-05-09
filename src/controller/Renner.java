package controller;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;

public class Renner {
	private Date geboorteDatum;
	private char geslacht;
	private String naam, voorNaam;
	private List<Date> trainingenAanwezig;
	
	Renner(Date bd, char gender, String name, String firstName) {
		this.geboorteDatum = bd;
		this.geslacht = gender;
		this.naam = name;
		this.voorNaam = firstName;
		this.trainingenAanwezig = new ArrayList<Date>();
		}
		
		private void addTraining(Date trainingDatum){
			this.trainingenAanwezig.add(trainingDatum);
		}
		
		private void removeTraining(Date trainingDatum) {
			boolean found = false;
			ListIterator<Date> li = this.trainingenAanwezig.listIterator();
			
			while (li.hasNext() && !found) {
				if (li.next() == trainingDatum) {
					li.remove();
					found = true;
				}
			}
			
			if(found)
				System.out.println("Training met specifieke datum niet teruggevonden: "+trainingDatum.toString());
		}
}
