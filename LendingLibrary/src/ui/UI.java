package ui;
import models.Book;

public class UI {
	public void printHeader(){
	System.out.println("BookID  Titel               Author");

	}
	public void printBook (Book book){
		
		//change integer to String
		//String bookIDString = String.valueOf(book.getBookID());
//		
//		System.out.println(fixlengthString(bookIDString,6) + " " + fixlengthString(book.getTitle(),20) + " " 
//				+ fixlengthString(book.getAuthor(),20));
		
		System.out.println(fixlengthString(book.getBookID(),6 )+ " " + fixlengthString(book.getTitle(),20) + " " 
				+ fixlengthString(book.getAuthor(),20));
	}
	
	private String fixlengthString (String start, int length){
		//ToDO: Fix string padding problem
		if (start.length() >= length){
			return start.substring(0,length);
		}
		else {
			while (start.length() < length){
			start += " ";
		}
		return start;
	}

}
	private String fixlengthString(int start, int length){
		String startString = String.valueOf(start);
		return fixlengthString(startString,length);
	}
	
}
