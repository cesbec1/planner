
public class Entry {

	int month;
	int date;
	String event;
	
	// constructor
	Entry(int someMonth, int someDate, String someEvent){
		this.month = someMonth;
		this.date = someDate;
		this.event = someEvent;
	}
	
	Entry(){
		
	}
	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	
	// method
	public String display() {
		return Integer.toString(date) + " : " + event;
	}
}
