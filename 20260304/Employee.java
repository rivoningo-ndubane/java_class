// Rivoningo Ndubane
// 55829465

public class Employee extends Person
{
	private String office;
	
	// Constructors
	public Employee()
	{
		this("", "", "");
	}
	public Employee(String id, String name, String email)
	{
		super(id, name, email);
	}
	
	// Set Methods
	public void setOffice(String office)
	{
		this.office = office;
	}
	
	// Get Methods
	public String getOffice()
	{
		return office;
	}
	
	// Compulation
	public String toString()
	{
		return super.toString() +
			   " Office: " + getOffice();
	}
}