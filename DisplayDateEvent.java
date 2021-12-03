// concrete class implementing the Display interface
public class DisplayDateEvent implements Display{
	@Override 
	// displays date in the month and the corresponding event
	public String displayTheLog(Entry someEntry) {
		return Integer.toString(someEntry.date) + " : " + someEntry.event;
	}
}
