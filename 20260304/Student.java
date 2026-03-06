// Rivoningo Ndubane
// 55829465

public class Student extends Person
{
	private String status;
	
	// Constructors
	public Student()
	{
		this("", "", "");
	}
	public Student(String id, String name, String email)
	{
		super(id, name, email);
	}
	
	// Set Methods
	public void setStatus(String status)
	{
		this.status = status;
	}
	
	// Get Methods
	public String getStatus()
	{
		return status;
	}
	
	// Compulation
	public String toString()
	{
		return super.toString() +
			   " Status: " + getStatus();
	}
}