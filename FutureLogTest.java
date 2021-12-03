import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FutureLogTest {

	@Test
	// Unit tests DisplayDateStrategy prints only the date and event of Entry object
	// omits the month information
	void someTest() {
		DisplayDateEvent someJunit = new DisplayDateEvent();
		
		Entry tester = new Entry();
		tester.setMonth(1);
		tester.setDate(2);
		tester.setEvent("Flight to Hawaii");
		
		String somethingTested = someJunit.displayTheLog(tester);
		assertEquals("2 : Flight to Hawaii", somethingTested);
	}
	
	@Test
	void anotherTest() {
		// Unit tests DisplayWeekdayDateStrategy prints weekday, date and event of Entry object
		// Check if weekday calculation is correct for this year's NYE
		DisplayWeekdayDateEvent anotherJunit = new DisplayWeekdayDateEvent();
		
		Entry tester2 = new Entry();
		tester2.setMonth(12);
		tester2.setDate(25);
		tester2.setEvent("NYE");
		
		String anotherTested = anotherJunit.displayTheLog(tester2);
		assertEquals("FRI 31 : NYE", anotherTested);
		
	}

}
