package ui;


import java.math.BigDecimal;
import java.text.NumberFormat;

import models.BookArray;
import models.BookCatalog;
import models.Customer;
import models.DVD;
import models.Loan;
import models.LoanAlreadyExistsException;
import models.LoanRegistry;
import models.Material;
import utilities.GenderTYpe;


public class MainBookArray  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//BookArray[] bookCatalog = new BookArray[10];

		//		Date today = new Date();
		//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//		GregorianCalendar gCal = new GregorianCalendar(2017,0,1);
		//		gCal.add(GregorianCalendar.WEEK_OF_YEAR, 13);
		//
		//		today = gCal.getTime();
		//		System.out.println("Today is: " + sdf.format(today));
		//		
		double d = 1;
//		Locale swiss = new Locale ("fr", "ch");
//		NumberFormat nf = NumberFormat.getCurrencyInstance(swiss);
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(5);
		nf.setMinimumFractionDigits(5);
		
		
		
		BigDecimal price = new BigDecimal ("0.1");
		BigDecimal addValue = new BigDecimal("0.1");
		for (int i=0; i<10; i++){
		price =	price.add(addValue);
			System.out.println(price);
		}
		
		BookCatalog bookCatalog = new BookCatalog();

		BookArray bookarray1 = new BookArray (1,"Java for beginners", "Pari Man","123489", "Branch", 400);
		BookArray bookarray2 = new BookArray (2, "Java2 for others","Willy Wonka", "123566", "Branch",100);
		
		DVD dvd1 = new DVD (3, "DVD About Java", "Anytown Branch", "Stephen Spilberg", "99887", 120);
		DVD dvd2 = new DVD (3, "DVD About Java", "Anytown Branch", "Stephen Spilberg", "99887", 120);
		
		
		System.out.println(dvd1.getTitle());
		bookarray1.relocate("My city branch");
		//dvd1.licenced();
		

		//		bookCatalog[0] = bookarray1;
		//		bookCatalog[1] = bookarray2;

		bookCatalog.addBook(bookarray1);
		bookCatalog.addBook(bookarray2);

		UIArray ui = new UIArray();
		ui.printHeader();

		ui.printBookCatalog(bookCatalog.getBookCollection());

//		try {
//		BookArray foundBook = bookCatalog.findBook("Java2 For others");
//		}
//		catch (BookNotFoundException e)
//		{
//			System.out.println("The book wasn't found");
//		}
//		System.out.println("We found: " + foundBook.getTitle());
//		
		Customer customer = new Customer ("Mr", "Michael", "Smith", "Walloby24B 14589", "9878322", "a@b.com", 1, GenderTYpe.MALE);
		System.out.println(customer.getExpiryDate());
		System.out.println(customer.getMailingName());
		
//		System.out.println(dvd1.lend(customer));
//		dvd1.licenced();
//		System.out.println(dvd1.lend(customer));
//		System.out.println(dvd1.lend(customer));
//		
//		System.out.println(bookarray1.lend(customer));
//		System.out.println(bookarray1.lend(customer));
//
//		
//		System.out.println(bookarray1.getLoanPeriod());
//		System.out.println(dvd1.getLoanPeriod());
		
		
		System.out.println(customer);
		System.out.println(dvd1);
		
		System.out.println(dvd1.equals(dvd2));
		
		
		
		//			
		//			for (int counter = 0; counter < bookCatalog.length; counter++){
		//				if (bookCatalog[counter] != null)
		//				ui.printBookArray(bookCatalog[counter]);
		//}


		//			ui.printBookArray(bookarray1);
		//			ui.printBookArray(bookarray2);


		Loan firstLoan = new Loan(1, customer, bookarray1);
		System.out.println(firstLoan.getBook());
		System.out.println(firstLoan);
		
		
		LoanRegistry registry = new LoanRegistry();
		
		try{
		registry.addLoan(firstLoan);
		}
		catch (LoanAlreadyExistsException e){
	
	System.out.println("addLoan worked");

	}
		try{
			registry.addLoan(firstLoan);
			}
			catch (LoanAlreadyExistsException e){
		
		System.out.println("addLoan failed");

		}
		
		try{
			registry.addLoan(firstLoan);
			}
			catch (LoanAlreadyExistsException e){
		
		System.out.println("addLoan worked");

		}
			try{
				registry.addLoan(firstLoan);
				}
				catch (LoanAlreadyExistsException e){
			
			System.out.println("addLoan failed");

			}
			System.out.println(registry.isBookOnLoan(bookarray1.getId()));
			firstLoan.endLoan();
			System.out.println(registry.isBookOnLoan(bookarray1.getId()));

	}

}
