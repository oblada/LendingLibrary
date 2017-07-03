package models.test;

import static org.junit.Assert.*;

import org.junit.Test;

import models.BookArray;

public class BookTest {

	@Test
	public void test2EqualBooks() {
		BookArray book1 = new BookArray(100, "", "", "", "", 1);
		BookArray book2 = new BookArray(100, "", "", "", "", 1);
		
		assertTrue(book1.equals(book2));
		
		
	}
	
	
	
	
	@Test
	public void test2NonEqualBooks() {
		BookArray book1 = new BookArray(100, "", "", "", "", 1);
		BookArray book2 = new BookArray(101, "", "", "", "", 1);
		
		assertFalse(book1.equals(book2));
		
		
	}

}
