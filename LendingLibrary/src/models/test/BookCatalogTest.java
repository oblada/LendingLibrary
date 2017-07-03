package models.test;

import static org.junit.Assert.*;

import org.junit.Test;

import models.BookArray;
import models.BookCatalog;
import models.BookNotFoundException;

public class BookCatalogTest {
	
	private BookCatalog bc;
	private BookArray book1;
	
	
	//Constructor i JUnit, to save some lines that common for all methods
	public BookCatalogTest(){
		bc = new BookCatalog();
		book1 = new BookArray(1, "Java for beginners", "", "", "", 0);
		bc.addBook(book1);
		//Constructor in JUnit runs every time we run the test, here 4 times for we have 4 methods
		//System.out.println("Constructor in run");
	}
	
	
	

	@Test
	public void testAddBook() {

		int initialNumber = bc.getNumberOfBooks();
		
		BookArray book = new BookArray(1, "", "", "", "", 0);
		bc.addBook(book);
		
		assertTrue(initialNumber == bc.getNumberOfBooks() -1);
		
			
	}
	
	
	@Test
	public void testFindABook() {

		
		try{
		BookArray foundBook = bc.findBook("Java for beginners");
		}
		catch (BookNotFoundException e){
			fail ("Book not found");
		}
	}

	
	@Test
	public void testFindABookIgnoringCase() {

		try{
		BookArray foundBook = bc.findBook("java for beginners");
		}
		catch (BookNotFoundException e){
			fail ("Book not found");
		}
	}
	
	
	@Test
	public void testFindABookWithExtraSpaces() {

		try{
		BookArray foundBook = bc.findBook("java for beginners");
		}
		catch (BookNotFoundException e){
			fail ("Book not found");
		}
	}
	
	
	@Test(expected = BookNotFoundException.class)
	public void testFindABookThatDosentExist() throws BookNotFoundException {

		
		
		
		BookArray foundBook = bc.findBook("More Java for beginners");
	}
	
	
	
}
