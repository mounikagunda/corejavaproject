package oops;

public class First1 
{
	int x,y;
	public void functionOne(int x,int y)
	{
		this.x=x+y;
		this.y=this.x+this.x;
		
	}
	
}
class Third extends First1
{
	int x,y;
	public void functionTwo(int x,int y)
	{
		this.x=x+y;
		this.y=x*y;
		
	}
}
class Second extends Third
{
	int x;
	public void display()
	{
		System.out.println("x value="+x);
		System.out.println("y value="+y);
	}
	public static void main(String abc[])
	{
		Second sc=new Second();
		sc.functionOne(2, 3);
		sc.display();
		Third t= new Third();
		t.functionTwo(5, 7);

		System.out.println("x value="+sc.x);
		System.out.println(sc.y);
		System.out.println(t.x);
		System.out.println(t.y);
		
	}
}
