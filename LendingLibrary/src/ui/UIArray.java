package ui;
import models.BookArray;

public class UIArray {
	
	public void printHeader(){
	System.out.println("BookID  Titel               Author");

	}
	public void printBookArray (BookArray bookarray){
		
		//change integer to String
		//String bookIDString = String.valueOf(book.getBookID());
//		
//		System.out.println(fixlengthString(bookIDString,6) + " " + fixlengthString(book.getTitle(),20) + " " 
//				+ fixlengthString(book.getAuthor(),20));
		
		System.out.println(fixlengthString(bookarray.getId(),6 )+ " " + fixlengthString(bookarray.getTitle(),20) + " " 
				+ fixlengthString(bookarray.getAuthor(),20));
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
	
	public void printBookCatalog(BookArray[] bookCatalog){
		for (int counter = 0; counter < bookCatalog.length; counter++){
			if (bookCatalog[counter] != null)
			printBookArray(bookCatalog[counter]);
		}
		
	}
	

}
