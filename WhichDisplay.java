// Context class
public class WhichDisplay {
	private Display aDisplay;
	
	//  method that takes a Display Strategy method as a parameter
	// and stores it
	public WhichDisplay(Display someDisplay) {
		this.aDisplay = someDisplay;
	}
	
	// Method to take in parameters of the Entry class, and apply the strategy to the output format
	public String executeDisplay(Entry someEntry) {
		return aDisplay.displayTheLog(someEntry);
	}
}
