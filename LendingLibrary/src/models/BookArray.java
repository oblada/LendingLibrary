package models;

public class BookArray extends Material {
	
	//private int bookID;
	//private String title;
	private String author;
	private String isbn;
	//private String branch;
	private int noOfPages;
	
	//constructor
	public BookArray(int id, String title, String author, String isbn, String branch, int noOfPages){
		super(id, title, branch);
		this.author = author;
		this.isbn = isbn;
		this.noOfPages = noOfPages;
		
	}
	
	
	
	public String getAuthor (){
		return author;
		}
	
	public String getIsbn(){
		return isbn;
	}
	
	public void senForRepair(){
		System.out.println("Book has been sent for repair.");
	}
	
	public int getLoanPeriod(){
		return 21;
	}
	
	
//	public int getBookID(){
//		return bookID;
//	}
//	

}
