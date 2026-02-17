// Rivoningo Ndubane
// 55829465

public class Account
{
	// Instance Variables
	private String accNumber;
	private int balance;
	
	// Constructors
	public Account()
	{
		setAccNumber("123456");
		setBalance(0);
	}
	public Account (String aNo, int bal)
	{
		setAccNumber(aNo);
		setBalance(bal); 

	}
	
	// SET METHODS
	public void setAccNumber(String aNo)
	{
		accNumber = aNo;
	}
	
	public void setBalance(int bal)
	{
		balance = bal;
	}
	
	// COMPULATION
	public String toString()
	{
		return "Account Number: " + getAccNumber() + "\nBalance: R" +
		getBalance();
	}
	
	// GET METHODS
	public String getAccNumber()
	{
		return accNumber;
	}
	
	public int getBalance()
	{
		return balance;
	}
	
	public static void main(String args[])
	{
	}
}