package models;
public class BookCatalog {

	private BookArray[] bookCollection = new BookArray[100];
	private int nextPosition = 0;


	public BookArray [] getBookCollection(){
		return bookCollection;
	}
	
	public int getNumberOfBooks(){
		return nextPosition;
	}
	

	public void addBook(BookArray newBook){
		bookCollection[nextPosition]= newBook;
		nextPosition++;

	}

	public BookArray findBook (String title) throws BookNotFoundException {
		for (int counter = 0; counter < nextPosition; counter++ ){
			if (bookCollection [counter].getTitle().equalsIgnoreCase(title.trim()) ){
				return bookCollection[counter];
			}
		}
	throw new BookNotFoundException();
	}
}
