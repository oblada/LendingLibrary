package ui;
import models.Book;

public class MainBook {

	public static void main(String[] args) {
		Book book1 = new Book (1,"Java", "Pari Man","123489" );
		Book book2 = new Book (2, "Java2","Willy Wonka", "123566");
		
		UI ui = new UI();
		ui.printHeader();
		ui.printBook(book1);
		ui.printBook(book2);

	}

}
