// Rivoningo Ndubane
// 55829465

public class RectangularThing
{
	private String color;
	private int length;
	private int width;
	
	public RectangularThing()
	{
		this("", 0, 0);
	}
	public RectangularThing(String color, int length, int width)
	{
		setColor(color);
		setLength(length);
		setWidth(width);
	}
	
	// SET METHODS
	public void setColor(String color)
	{
		this.color = color;
	}
	public void setLength(int length)
	{
		this.length = length;
	}
	public void setWidth(int width)
	{
		this.width = width;
	}
	
	// GET METHODS
	public String getColor()
	{
		return this.color;
	}
	
	public int getLength()
	{
		return this.length;
	}
	
	public int getWidth()
	{
		return this.width;
	}
	
	// COMPUTATION
	public String toString()
	{
		return "Color: " + getColor() + "\nLength: " + getLength() + "\nWidth: " + getWidth();
	}
	
	// MAIN
	public static void main(String args[])
	{
	}
}