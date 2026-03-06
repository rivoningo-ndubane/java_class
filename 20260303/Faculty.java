// Rivoningo Ndubane
// 55829465

public class Faculty extends Person
{
	private String rank;
	private String office;
	
	// Constructors
	public Faculty()
	{
		this("", "", "", "");
	}
	public Faculty(String id, String name, String email, String rank)
	{
		super(id, name, email);
		setRank(rank);
	}
	
	// Set Methods
	public void setRank(String rank)
	{
		this.rank = rank;
	}
	public void setOffice(String office)
	{
		this.office = office;
	}
	
	// Get Methods
	public String getRank()
	{
		return rank;
	}
	public String getOffice()
	{
		return office;
	}
	
	// Compulation
	public String toString()
	{
		return super.toString() +
			   "\nRank: " + getRank() +
			   "\nOffice: " + getOffice();
	}
}