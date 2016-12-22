package examples;

public class Example 
{
	private int x;
	Example()
	{
		this(10);
		this.execute();
	}
	Example(int x)
	{
		this.x=x;
		
	}
void execute()
{
	System.out.println("x="+x);
}
}
