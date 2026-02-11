import java.util.Scanner;

public class Prog20260211A
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please give your name: ");
		String name = input.nextLine();
		
		System.out.print("Welcome to CMPG211, " + name);
		System.out.printf("\nI hope you are well %-2s King", name);
		
	}
}