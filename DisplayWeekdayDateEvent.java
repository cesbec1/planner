// concrete class that implements Display interface
public class DisplayWeekdayDateEvent implements Display{
	@Override 
	public String displayTheLog(Entry someEntry) {
		
		// calculate day of the week
		// ( year code + month code + century code + date number - leap year code)%7
		// year = 2021, so:
		// (YY + (YY / 4))%7
		int currentYear = 2021;
		int yearCode = (currentYear+(currentYear/4))%7;
		int monthCode = 0;
		int month = someEntry.month;
		
		// month code calculation
		if(month == 1 || month == 10) {
			monthCode = 0;
		}else if(month == 2 || month == 3 || month == 11){
			monthCode = 3;
		}else if(month == 4 || month == 7){
			monthCode = 6;
		}else if(month == 5){
			monthCode = 1;
		}else if(month == 6){
			monthCode = 4;
		}else if(month == 8){
			monthCode = 2;
		}else if(month == 9 || month == 12){
			monthCode = 5;
		}else{
			System.out.println("That's an invald month.");
		}
		
		int centuryCode = 6;
		int leapYearCode = 0;
		int dateNumber = someEntry.date;
		
		int dayOfTheWeek = (yearCode + monthCode + centuryCode + dateNumber - leapYearCode)%7;
		// parse dayOfWeek to String form
		String weekdayString = "";
		
		switch(dayOfTheWeek) {
		  case 0:
		    weekdayString = "SUN";
		    break;
		  case 1:
			weekdayString = "MON";
		    break;
		  case 2:
			weekdayString = "TUE";
			break;
		  case 3:
			weekdayString = "WED";
			break;
		  case 4:
			weekdayString = "THUR";
			break;
		  case 5:
			weekdayString = "FRI";
			break;
		  case 6:
			weekdayString = "SAT";
			break;
		  default:
		    System.out.println("ERR");
		}
		
		
		return weekdayString + " " +  Integer.toString(someEntry.date) + " : " + someEntry.event;
	}
}
