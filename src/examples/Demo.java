package examples;

public class Demo {
	Demo()
	{
		System.out.println("default constructor");
	}
	Demo(int i)
	{
		System.out.println("one argument constructor"+i);
	}
	Demo(int i,int j)
	{
		System.out.println("two argument constructor="+i+j);
		
	}
	public static void main(String abc[])
	{
		Demo t=new Demo();
	}
	
	
}
