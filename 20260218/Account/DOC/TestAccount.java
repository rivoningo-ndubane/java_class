// Rivoningo Ndubane
// 55829465

public class TestAccount
{
	public static void main(String args[])
	{
		// Test Default Constructor
		System.out.println("Testing Default Constructor");
		Account a1 = new Account();
		System.out.println(a1);
		
		// Test Parameter Constructor
		System.out.println("\nTesting Parameter Constructor");
		Account a2 = new Account("654321", 50);
		System.out.println(a2);
		
		// Test All Methods
		a1.setAccNumber("665577");
		a1.setBalance(700);
		
		System.out.println("\nNew AccNumber for a1 = " + a1.getAccNumber());
		System.out.println("New Balance for a1 = " + a1.getBalance());
		
		//Print out The updated a1 testing toString()
		System.out.println("\ntoString() Updated");
		System.out.println(a1);
	}
}