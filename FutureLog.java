import java.util.*;
public class FutureLog {

	
public  FutureLog() {
		
		// create
		System.out.println("Select a month");
		
		// Number of months
		int numberOfMonths = 12;
		
		// Array of Arraylists
		ArrayList<Entry>[] months = new ArrayList[numberOfMonths];
		
		// initializing Arraylists
		for(int i = 0; i < numberOfMonths; i++) {
			months[i] = new ArrayList<Entry>();
		}
				
		Entry tester = new Entry();
		tester.setMonth(1);
		tester.setDate(2);
		tester.setEvent("Flight to LA");
		
		Entry tester2 = new Entry();
		tester2.setMonth(2);
		tester2.setDate(2);
		tester2.setEvent("Flight to Nola");
		
		Entry tester3 = new Entry();
		tester3.setMonth(3);
		tester3.setDate(2);
		tester3.setEvent("Flight to Seattle");
		
		Entry tester4 = new Entry();
		tester4.setMonth(1);
		tester4.setDate(5);
		tester4.setEvent("Flight to Busan");
		
		Entry tester5 = new Entry();
		tester5.setMonth(2);
		tester5.setDate(25);
		tester5.setEvent("Flight to Bangkok");
		
		Entry tester6 = new Entry();
		tester6.setMonth(3);
		tester6.setDate(7);
		tester6.setEvent("Flight to Taipei");
		
		Entry tester7 = new Entry();
		tester7.setMonth(1);
		tester7.setDate(17);
		tester7.setEvent("Flight to Boise");
		
		Entry tester8 = new Entry();
		tester8.setMonth(2);
		tester8.setDate(10);
		tester8.setEvent("Flight to Prague");
		
		Entry tester9 = new Entry();
		tester9.setMonth(3);
		tester9.setDate(21);
		tester9.setEvent("Flight to Krabi");
		
		// Add inputs
		// Adjust month
		// int adjustedMonth = tester.getMonth()+1;
		// months[adjustedMonth].add(tester);
		months[tester.getMonth()-1].add(tester);
		months[tester2.getMonth()-1].add(tester2);
		months[tester3.getMonth()-1].add(tester3);
		months[tester4.getMonth()-1].add(tester4);
		months[tester5.getMonth()-1].add(tester5);
		months[tester6.getMonth()-1].add(tester6);
		months[tester7.getMonth()-1].add(tester7);
		months[tester8.getMonth()-1].add(tester8);
		months[tester9.getMonth()-1].add(tester9);
		
		Month justPrintTheMonths = new Month(); // For stringify integer month values
		
		while(true) {
		
			System.out.println("\n\nFuture Log Commands:");
			System.out.println("Print the Future Log - 0");
			System.out.println("Add an entry - 1");
			System.out.println("Remove an entry - 2");
			System.out.println("Delay an entry - 3");
			
			Scanner scanMenu = new Scanner(System.in);
			int menuSelection = scanMenu.nextInt();
			
			switch(menuSelection) {
			
				case 0:
					if(months.length>0) {
						printThreeColumnsView(months);
					}
					break;
				case 1:
			    // Add an entry
					// Entering Event Details
					
				// initialize the instances
				Scanner scan = new Scanner(System.in);
				Entry newEntry = new Entry();
				
					
				System.out.print("\nSelect a month: ");
				int enteredMonth = scan.nextInt();
				// warnings for improper month?
				newEntry.setMonth(enteredMonth);

				
				System.out.print("\nSelect a day: ");
				int enteredDay = scan.nextInt();
				// warnings for improper date entry?
				newEntry.setDate(enteredDay);
				
				// consume rest of line or next scan skips
				scan.nextLine();
				
				System.out.println("\nWhat is the event?");
				String enteredEvent = scan.nextLine();
				newEntry.setEvent(enteredEvent);
					
				// adjustment month before adding to AL
				int adjustThisMonth = newEntry.getMonth()-1;
				months[adjustThisMonth].add(newEntry);
					
				// print with no strategy
				
				/*for(int i = 0; i < numberOfMonths; i++) {
					for(int j = 0; j < months[i].size(); j++) {
						System.out.println(months[i].get(j).display());
					}
				}*/// end print  
				
				
				// print with strategy
				// define the context at runtime
				WhichDisplay newContext = new WhichDisplay(new DisplayDateEvent());

						
		// 3 Month Display at a Time
				
				printThreeColumnsView(months);
				System.out.println("\nend function print\n\n");
				
				
				
			// Work in Progress: another test print method	
			/*	for(int i = 0; i < 3; i++) {
					// +1 to adjust the months
					System.out.println("Month of " + justPrintTheMonths.display(i+1));
					for(int j = 0; j < months[i].size(); j++) {
						
						
						// null check
						// first month
					
						System.out.println(newContext.executeDisplay(months[i].get(j)));
						System.out.println("\t\t\t\t\t");
						// second month
						System.out.println(newContext.executeDisplay(months[i+1].get(j)));	
						
						
						System.out.println("\t\t\t\t\t");
						// third month
						
						System.out.println(newContext.executeDisplay(months[i+2].get(j)));
						
					
					}
				}*/
							
// Tester print lines for comparisons between different Strategies
// The style of entry printing can be changed at function run time
				
				
				for(int i = 0; i < numberOfMonths; i++) {
					// +1 to adjust the months
					//System.out.println("Month of " + justPrintTheMonths.display(i+1));
					
					// Context defined at line 138-140
					// print with strategy
					// define the context at runtime
					// WhichDisplay newContext = new WhichDisplay(new DisplayDateEvent());
					
					// For loop executes the display for entry in this format: 
					// < Day of Month > : < Event >
					for(int j = 0; j < months[i].size(); j++) {
						System.out.println("The Future Log display is: " + newContext.executeDisplay(months[i].get(j)));
					}
				}// end print
				
				
				
				// Print with a different strategy
				// This strategy is used for Daily Logs
				// Benefit of display format being defined at runtime is flexibility:
				// What if you want to eventually change the Future Log entry format to the Daily Log format
				newContext = new WhichDisplay(new DisplayWeekdayDateEvent());
				
				for(int i = 0; i < numberOfMonths; i++) {
					
					for(int j = 0; j < months[i].size(); j++) {
						System.out.println("The Daily Log display is: " + newContext.executeDisplay(months[i].get(j)));
					}
				}// end print
				
				
				break;
			  case 2:
			    // Remove an entry
				Scanner scanRemove = new Scanner(System.in);  
				Entry removeThisEntry = new Entry();
				
				int monthOfDeleted = 0;
				int dayOfDeleted = 0;
				
				System.out.print("\nSelect a month: ");
				monthOfDeleted = scanRemove.nextInt();
				// warnings for improper month?
				removeThisEntry.setMonth(monthOfDeleted);
						
				System.out.print("\nSelect a day: ");
				dayOfDeleted = scanRemove.nextInt();
				// warnings for improper date entry?
				removeThisEntry.setDate(dayOfDeleted);
					
				// consume rest of line or next scan skips
				scanRemove.nextLine();
				
				// find the index of item to be removed
				// first get the index
				int indexToRemoveCounter = 0;
				// up to the size of AL for that month
				for(int i = 0; i < months[monthOfDeleted-1].size(); i++ ) {
					// if the entered date to be deleted is equal the date of the entry existing in the Future Log for that month
					if(dayOfDeleted == months[monthOfDeleted-1].get(i).getDate()) {
						System.out.println(months[monthOfDeleted-1].get(indexToRemoveCounter));
						months[monthOfDeleted-1].remove(indexToRemoveCounter);
						System.out.print(" has been removed!");
					}
					indexToRemoveCounter++;
				}
				
				
				// get the date to remove
				// index of date == input date
				
				break;
			  case 3:
				// Delay an entry
				
				Scanner scanDelay = new Scanner(System.in);  
				Entry delayThisEntry = new Entry();
					
				int monthOfDelayed = 0;
				int dayOfDelayed = 0;
				int newMonth = 0;
				int newDate = 0;
					
				System.out.print("\nSelect a month: ");
				monthOfDelayed = scanDelay.nextInt();
				// warnings for improper month?
				delayThisEntry.setMonth(monthOfDelayed);
							
				System.out.print("\nSelect a day: ");
				dayOfDelayed = scanDelay.nextInt();
				// warnings for improper date entry?
				delayThisEntry.setDate(dayOfDelayed);
						
				// consume rest of line or next scan skips
				scanDelay.nextLine();
				
				// get the event string from AL and set it
				String placeholderString = months[monthOfDelayed-1].get(dayOfDelayed-1).getEvent();
				delayThisEntry.setEvent(placeholderString);
				
				// remove the entry
				months[monthOfDelayed-1].remove(dayOfDelayed-1);
				
				// Set new Month/Date
				System.out.print("\nSelect a new month: ");
				newMonth = scanDelay.nextInt();
				// warnings for improper month?
				delayThisEntry.setMonth(newMonth);
							
				System.out.print("\nSelect a new day: ");
				newDate = scanDelay.nextInt();
				// warnings for improper date entry?
				delayThisEntry.setDate(newDate);
				
				// consume rest of line or next scan skips
				// scanDelay.nextLine();
				
				// add new entry which is modified entry
				months[newMonth-1].add(delayThisEntry);
				
				break;
			  default:
			    System.out.println("Invalid menu selection");
			}
			
		}//end while
	
	}// end FutureLog()

//three months display at a time
	public static void printThreeColumnsView(ArrayList<Entry>[] months) {
		
		// 3 Month Display at a Time
		
		// Initialize Temp AL for printing
		// Array of Arraylists :: 3 months at  time
		int howManyMonthsView = 3;
		ArrayList<ArrayList<Entry>> printLog = new ArrayList<>(howManyMonthsView);
		
		// Initialize each element of AL with AL
		for(int i = 0; i < howManyMonthsView; i++) {
			printLog.add(new ArrayList<Entry>());
		}
		
		// Add Month 1 contents
		for(int i = 0; i < months[0].size(); i++) {
			printLog.get(i).add(months[0].get(i));
		}
		
		// Add Month 2 contents
		for(int i = 0; i < months[1].size(); i++) {
			printLog.get(i).add(months[1].get(i));
		}
		
		// Add Month 3 contents
		for(int i = 0; i < months[2].size(); i++) {
			printLog.get(i).add(months[2].get(i));
		}
		
		// test entry variables, test printing
		// header
		System.out.println("\n---------------------------------------- Future Log ------------------------------------------------\n");
		System.out.println("January\t\t\t\t\tFebruary\t\t\t\t\tMarch");
		for(int i = 0; i < printLog.size(); i++) {
		
		// Placeholder AL method printing -- Todo: move new entries to right columns	
			for(int j = 0; j < printLog.get(i).size(); j++) {
				
				//if() {
					System.out.print(printLog.get(i).get(j).display() + "\t\t\t");
				//}
			}
			System.out.println("");
			
			
			// Executes the display for entry in this format: 
			// < Day of Month > : < Event >
/*			WhichDisplay printContext = new WhichDisplay(new DisplayDateEvent());
			
			// variables to hold entry values through the for loop
			Entry var1 = new Entry();
			Entry var2 = new Entry();
			Entry var3 = new Entry();
				
			//var1 = printLog.get(i).get(0);
			//var2 = printLog.get(i).get(1);
			//var3 = printLog.get(i).get(2); 
			
			// trying naive method to see if it works // it doesn't T___T
			try{
				var1 = printLog.get(i).get(0);
			}catch(IndexOutOfBoundsException e){
				var1.setDate(0);
				var1.setEvent("");
			}
			
			try{
				var2 = printLog.get(i).get(1);
			}catch(IndexOutOfBoundsException e){
				var2.setDate(0);
				var2.setEvent("");
			}
			
			try{
				var3 = printLog.get(i).get(2);
			}catch(IndexOutOfBoundsException e){
				var3.setDate(0);
				var3.setEvent("");
			}
			
			// print entry format into 3 columns
			System.out.printf("%-40s %-40s %-40s\n", printContext.executeDisplay(var1), printContext.executeDisplay(var2), printContext.executeDisplay(var3));
*/				
			
		}// end for
		
	}// end print function

}
