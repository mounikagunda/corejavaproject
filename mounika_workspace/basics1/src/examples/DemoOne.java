package examples;

public class DemoOne 
{
	DemoOne()
	{
	this(2);
	System.out.println("default constructor");

}
DemoOne(int i)
{
	this(2,3);
	System.out.println("one argument constructor"+i);
	
}
DemoOne(int i,int j)
{
	System.out.println("two argument constructor"+(i+j));
	
}
public static void main(String abc[])

{
	DemoOne d= new DemoOne();
	
	
}
}