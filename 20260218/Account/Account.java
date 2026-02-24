// Rivoningo Ndubane
// 55829465

/**
This class manages information on bank accounts.
@author R Ndubane
@version 20260218
*/

public class Account
{
	// Instance Variables
	private String accNumber;
	private int balance;
	
	// Constructors
	
	/**
	Default constructor sets instance variables to default values:
	accNumber = "123456"
	balance = 0
	*/
	public Account()
	{
		this("123456", 0);
	}
	
	/**
	Constructor receives parameters and assigns them to instance
	variables:
	@param accNumber This is the number of the account
	@param balance This is the starting balance of the account
	*/
	public Account (String aNo, int bal)
	{
		setAccNumber(aNo);
		setBalance(bal); 

	}
	
	// SET METHODS
	public void setAccNumber(String accNumber)
	{
		this.accNumber = accNumber;
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
	
	/**
	Returns the value of accNumber.
	@return Value of accNumber
	*/
	public String getAccNumber()
	{
		return accNumber;
	}
	
	/**
	Returns the value of balance.
	@return Value of balance
	*/
	public int getBalance()
	{
		return balance;
	}
	
	public static void main(String args[])
	{
	}
}
