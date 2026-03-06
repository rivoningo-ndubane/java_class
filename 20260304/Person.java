// Rivoningo Ndubane
// 55829465

public class Person
{
	private String id;
	private String name;
	private String email;
	
	// Constructors
	public Person()
	{
		this("", "", "");
	}
	public Person(String id, String name, String email)
	{
		setId(id);
		setName(name);
		setEmail(email);
	}
	
	// Set Methods
	public void setId(String id)
	{
		this.id = id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	// Get Methods
	public String getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public String getEmail()
	{
		return email;
	}
	
	// Compulation
	public String toString()
	{
		return "ID: " + getId() +
			   " Name: " + getName() +
			   " Email: " + getEmail();
	}
}