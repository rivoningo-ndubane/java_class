// Rivoningo Ndubane
// 55829465

public class Faculty extends Employee
{
	private String rank;
	
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
	
	// Get Methods
	public String getRank()
	{
		return rank;
	}
	
	// Compulation
	public String toString()
	{
		return super.toString() +
			   " Rank: " + getRank();
	}
}