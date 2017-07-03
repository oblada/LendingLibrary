package models;
import java.util.Date;
import java.util.GregorianCalendar;

import utilities.GenderTYpe;

public class Customer {

	private String title;
	private String firstName;
	private String surname;
	private String Address;
	private String phoneNumber;
	private String Email;
	private int cutomerNumber;
	private GenderTYpe gender ;
	private boolean isValid;
	private Date expiryDate;
	
	
	//constructor
	public Customer (String title, String firstName, String surename, String Address, 
			String phoneNumber, String Email, int cutomerNumber, GenderTYpe gender){
		//System.out.println("New customer created");
		setName (title, firstName, surename);
		this.Address = Address;
		this.phoneNumber = phoneNumber;
		this.Email = Email;
		this.cutomerNumber = cutomerNumber;
		this.gender = gender;
		this.isValid = true;
		
		GregorianCalendar gCal = new GregorianCalendar();
		gCal.add(GregorianCalendar.YEAR, 1);
		this.expiryDate = gCal.getTime();
		
		}
	
		
	public String getFirstName (){
		 return firstName;
	}
	
	public String getSurname (){ 
		return surname;
	}
	
	
	private void setName (String title, String firstName, String surname){
		this.title = title;
		this.firstName = firstName;
		this.surname = surname;
		
	}	
	
	public String getMailingName(){
		String mailingName;
		mailingName = title + " " + firstName.substring(0, 1) 
		+ " " + surname;
		return mailingName;
	}
	
	public GenderTYpe getGender(){
		return gender;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}


	@Override
	public String toString() {
		return getMailingName();
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Address == null) ? 0 : Address.hashCode());
		result = prime * result + ((Email == null) ? 0 : Email.hashCode());
		result = prime * result + cutomerNumber;
		result = prime * result + ((expiryDate == null) ? 0 : expiryDate.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + (isValid ? 1231 : 1237);
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Customer other = (Customer) obj;
		if (Address == null) {
			if (other.Address != null)
				return false;
		} else if (!Address.equals(other.Address))
			return false;
		if (Email == null) {
			if (other.Email != null)
				return false;
		} else if (!Email.equals(other.Email))
			return false;
		if (cutomerNumber != other.cutomerNumber)
			return false;
		if (expiryDate == null) {
			if (other.expiryDate != null)
				return false;
		} else if (!expiryDate.equals(other.expiryDate))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (gender != other.gender)
			return false;
		if (isValid != other.isValid)
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	
	
}
