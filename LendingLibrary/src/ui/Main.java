package ui;
import models.Customer;
import utilities.GenderTYpe;

public class Main {

	public static void main(String[] args) {
		
		//Create a object of a class
		Customer willy = new Customer("Mr", "Willy", "Wonka", 
				"Chockaldgatan", "000000", "willy@wonka.com",  322, GenderTYpe.MALE);
		//Customer joanne = new Customer("Miss","Joanne", "Smith");
		
		
//		willy.setName("Mr", "Willy", "Wonka");
//		joanne.setName("Miss","Joanne", "Smith");
		System.out.println(willy.getFirstName());
		//System.out.println(joanne.getSurname());
		System.out.println(willy.getMailingName());
		System.out.println(willy.getGender());
		
		
		if (willy.getGender() == GenderTYpe.MALE){
			System.out.println("He is male");
		}
		
		
//		String myName = getMyName ();
//		displayMyName (getFirstName(myName));
//		displayMyName (getSurname(myName));
//		
	}

//	public static String getMyName (){
//		return "Pari Man";
//	}
//	
//	public static void displayMyName(String myName){
//		
//		System.out.println(myName);
//		
//	}
//	
	
	
}
