package library.Entities;

import java.util.List;

import library.interfaces.entities.EMemberState;
import library.interfaces.entities.ILoan;
import library.interfaces.entities.IMember;

public class Member implements IMember {

	private String firstName;
	private String LastName;
	private String ContactPhone;
	private String emailAddress;
	
	
	
	public Member(String FN, String LN, String CP, String eA )
	{
		firstName=FN;
		LastName=LN;
		ContactPhone=CP;
		emailAddress=eA;
		
	}

	
	public boolean hasOverDueLoans() {
		if(firstName.equals("FName1"))
		return true;
		else
			return false;
	}

	
	public boolean hasReachedLoanLimit() {
		if(firstName.equals("FName3"))
			return true;
			else
				return false;
	}

	
	public boolean hasFinesPayable() {
		if(firstName.equals("FName2")||firstName.equals("FName4"))
		return true;
		else 
			return false;
	}

	
	public boolean hasReachedFineLimit() {
		if(firstName.equals("FName2"))
		return true;
		else 
			return false;
	}

	
	public float getFineAmount() {
		if(firstName.equals("FName2"))
		return 50;
		else if(firstName.equals("FName4"))
			return 15;
		else
			return 0;
	}

	
	public void addFine(float fine) {
		// TODO Auto-generated method stub
		
	}

	
	public void payFine(float payment) {
		// TODO Auto-generated method stub
		
	}

	
	public void addLoan(ILoan loan) {
		// TODO Auto-generated method stub
		
	}

	
	public List<ILoan> getLoans() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void removeLoan(ILoan loan) {
		// TODO Auto-generated method stub
		
	}

	
	public EMemberState getState() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String getFirstName() {
		// TODO Auto-generated method stub
		return firstName;
	}

	
	public String getLastName() {
		// TODO Auto-generated method stub
		return LastName;
	}

	
	public String getContactPhone() {
		
		return ContactPhone;
	}

	
	public String getEmailAddress() {
		// TODO Auto-generated method stub
		return emailAddress;
	}

	
	public int getID() {
		// TODO Auto-generated method stub
		return 0;
	}
}
