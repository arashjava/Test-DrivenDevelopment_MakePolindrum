package palindrum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testPolindrum {
	
	Polindrum pol= new Polindrum();
	
	@Test		// test reverse function
	void testReverse() {
		String string= "12";
		assertEquals("21", pol.reverse(string));
	}
	
	@Test		// test if it is not polindrum
	void testNotPolindrum() {
		String string= "12";
		assertFalse(pol.isPolindrum(string));
	}
	
	@Test		// test if it is polindrum
	void testPolindrum() {
		String string= "121";
		assertTrue(pol.isPolindrum(string));
	}
	
	@Test		// test make it polindrum with adding the number to its reverse number
	void testMakePolidrum() {
		String string= "1424";
		assertEquals("5665", pol.makePolindrum(string));
	}
}
