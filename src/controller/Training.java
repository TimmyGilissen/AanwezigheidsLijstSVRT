package controller;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author 100043735
 *
 */
public class Training {
	String aanwezigeRenners[], aanwezigeTrainers[], ingevuldDoor, type, piste, testers[], trainingsDag;
	String datum;
	Calendar calDatum;
	short startUur, eindUur;
	
	Training(){
		this.setDate();
	}
	
	private void setDate(){
		// GET CURRENT SYSTEM DATE
		DateFormat dateFormat = new SimpleDateFormat("EEEE dd-MMM-yyyy");
		this.calDatum = Calendar.getInstance();
		this.datum = dateFormat.format(calDatum.getTime());
		//System.out.println(cal.getTime());
		
		// SET DEFAULT HOURS ON TRAININGDAYS
		switch (calDatum.get(Calendar.DAY_OF_WEEK)) {
		case 4: this.startUur	= 	1800;				// WOENSDAG DEFAULT
				this.eindUur	=	2000;
		case 6: this.startUur	= 	1900;				// VRIJDAG DEFAULT
				this.eindUur	=	2100;
		case 7: this.startUur	= 	1500;				// ZATERDAG DEFAULT
				this.eindUur	=	1700;
		}
	}

}

