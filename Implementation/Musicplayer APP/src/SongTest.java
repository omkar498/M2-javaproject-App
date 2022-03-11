package com.omkar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SongTest {
	Song ceo = new Song("rio",3.4);
	

	@Test
	void testGetTitle() {
		String expected = "rio";
		String actual = ceo.getTitle();
		assertEquals(expected,actual);
		
		//fail("Not yet implemented");
	}

	@Test
	void testGetDuration() {
		double expected = 3.4;
		double actual = ceo.getDuration();
		assertEquals(expected,actual);
		//fail("Not yet implemented");
	}

}
