public class Student
{
	// Instance Variables
	private String name;
	private String studentNumber;
	
	// Constructors
	public Student() // defualt constructor
	{
		setName("");
		setStudentNumber("00000000");
	}
	
	public Student(String name, String studentNumber)
	{
		setName(name);
		setStudentNumber(studentNumber);
	}
	
	// Public methods
	// SET METHODS
	public void setName(String nm)
	{
		name = nm;
	}
	
	public void setStudentNumber(String sNo)
	{
		studentNumber = sNo;
	}
	
	// COMPULATION
	public String toString()
	{
		return "Name: " + getName() + "\nStudentNumber: " +
		getStudentNumber();
	}
	
	// GET METHODS
	public String getName()
	{
		return name;
	}
	
	public String getStudentNumber()
	{
		return studentNumber;
	}
	
	// MAIN METHOD
	public static void main(String args[])
	{
		Student s1 = new Student("Rivoningo", "43539412");
		System.out.println(s1);
	}
}