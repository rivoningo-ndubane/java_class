import java.util.Scanner;

public class Prog20260211A
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please give your name: ");
		String name = input.nextLine();
		
		System.out.println("Welcome to CMPG211, " + name);
		System.out.println("I hope you are well " + name + " King");

		// Close input to avoid leaks
		input.close();
		
	}
}