
public class Month {

	public int theMonth;
	public int maxNumberOfDays;
	public String monthNames[] = {"January", "February", "March", "April",
            "May", "June", "July", "August", "September",
            "October", "November", "December"};
	
	// Constructor
	
	public Month() {
		
	}
	
	// Methods
	
	// Calculate max number of days and use it to set max size of singly linked list?
	
	public int calculateMaxNumberOfDays(int someMonth) {
		int enteredMonth = someMonth;
		int howManyDaysTotal = 0;
		
		if(enteredMonth == 1 || enteredMonth == 3 || 
		   enteredMonth == 5 || enteredMonth == 7 || 
		   enteredMonth == 8 || enteredMonth == 10 || enteredMonth == 12) {
	        	
	       	howManyDaysTotal = 31;
	        	
	    }else if(enteredMonth == 4 || enteredMonth == 6 || enteredMonth == 9 || enteredMonth == 11) {
	        	
	    	howManyDaysTotal = 30;
	        	
	    }else if(enteredMonth == 2) {
	        	
	    	howManyDaysTotal = 28;
	        	
	    }else {
	      	System.out.println("Not a valid month.\n");
	    }
		return howManyDaysTotal;
		
	}
	
	public String display(int someMonth) {
		return monthNames[someMonth-1];
	}

	


	
}
