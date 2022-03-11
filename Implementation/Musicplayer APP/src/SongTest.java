package com.omkar;

import static org.junit.Assert.*;

import org.junit.Test;

public class SongTest {
	Song ceo = new Song("rio",3.4);
	 

	@Test
	public void testGetTitle() {
		String expected = "rio";
		String actual = ceo.getTitle();
		assertEquals(expected,actual);
		//fail("Not yet implemented");
	}

}
