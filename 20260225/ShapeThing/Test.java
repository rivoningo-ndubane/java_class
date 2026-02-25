// Rivoningo Ndubane
// 55829465

public class Test
{	
	// MAIN
	public static void main(String args[])
	{
		System.out.println("-----Testing Thing-----");
		
		// Test default Constructor
		Thing t1 = new Thing();
		System.out.println("Testing Default Constructor");
		System.out.println(t1);
		
		// Test parameter Constructor
		System.out.println("\nTesting Param Constructor");
		Thing t2 = new Thing("Red");
		System.out.println(t2);
		
		// Test Methods
		System.out.println("\nTesting Methods");
		t1.setColor("Black");
		System.out.println(t1);
		System.out.println("\nLooks like now im " + t1.getColor() + "!");
		
		//----------------------------------------------------------------------------
		System.out.println("\n-----Testing RoundThing-----");
		
		// Test default Constructor
		RoundThing r1 = new RoundThing();
		System.out.println("Testing Default Constructor");
		System.out.println(r1);
		
		// Test parameter Constructor
		System.out.println("\nTesting Param Constructor");
		RoundThing r2 = new RoundThing("Red", 2);
		System.out.println(r2);
		
		// Test Methods
		System.out.println("\nTesting Methods");
		r1.setColor("Black");
		r1.setRadius(8);
		
		// toString uses all get methods
		System.out.println(r1);
		
		System.out.println("\nLooks like now im " + r1.getColor() +
		"! and i have a radius of " + r1.getRadius());
		
		//----------------------------------------------------------------------------
		System.out.println("\n-----Testing SquareThing-----");
		
		// Test default Constructor
		SquareThing s1 = new SquareThing();
		System.out.println("Testing Default Constructor");
		System.out.println(s1);
		
		// Test parameter Constructor
		System.out.println("\nTesting Param Constructor");
		SquareThing s2 = new SquareThing("Red", 2);
		System.out.println(s2);
		
		// Test Methods
		System.out.println("\nTesting Methods");
		s1.setColor("Black");
		s1.setLength(8);
		
		// toString uses all get methods
		System.out.println(s1);
		
		System.out.println("\nLooks like now im " + s1.getColor() +
		"! and i have a length of " + s1.getLength());
		
		//----------------------------------------------------------------------------
		System.out.println("\n-----Testing RectangularThing-----");
		
		// Test default Constructor
		RectangularThing rec1 = new RectangularThing();
		System.out.println("Testing Default Constructor");
		System.out.println(rec1);
		
		// Test parameter Constructor
		System.out.println("\nTesting Param Constructor");
		RectangularThing rec2 = new RectangularThing("Red", 2, 2);
		System.out.println(rec2);
		
		// Test Methods
		System.out.println("\nTesting Methods");
		rec1.setColor("Black");
		rec1.setLength(8);
		rec1.setWidth(12);
		
		// toString uses all get methods
		System.out.println(rec1);
		
		System.out.println("\nLooks like now im " + rec1.getColor() +
		"! and i have a length of " + rec1.getLength() +
		" and a width of " + rec1.getWidth());
		
		//----------------------------------------------------------------------------
	}
	
}