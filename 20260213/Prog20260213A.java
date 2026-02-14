import java.util.Scanner;

public class Prog20260213A
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter an integer value: ");
		int val1 = input.nextInt();
		
		System.out.println("The value is: " + val1);
		
		System.out.print("Please enter another integer value: ");
		int val2 = Integer.parseInt(input.next());
		
		System.out.println("Two times " + val2 + " is: " + val2*2);
		System.out.println("The square of " + val1 + " is: " + Math.pow(val1, 2));
		
		// close the input
		input.close();
	}
}