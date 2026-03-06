// Rivoningo Ndubane
// 55829465

public class Staff extends Employee
{
	private String title;
	
	// Constructors
	public Staff()
	{
		this("", "", "", "");
	}
	public Staff(String id, String name, String email, String title)
	{
		super(id, name, email);
		setTitle(title);
	}
	
	// Set Methods
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	// Get Methods
	public String getTitle()
	{
		return title;
	}
	
	// Compulation
	public String toString()
	{
		return super.toString() +
			   " Title: " + getTitle();
	}
}