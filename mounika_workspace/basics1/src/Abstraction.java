
public class Abstraction
{
int a,b;
public int sum(int a,int b)
{
	this.a=a;
	this.b=b;
	return this.a+this.b;
	
}
public int subtraction(int a,int b)
{
	return a-b;
	
}
public abstract int multiplicate(int a,int b);
public abstract int division(int a,int c);
}
class Car extends Abstraction
{
	public  int multiplicate(int a,int b);
	{
		return a+b;
	}
	public int division(int a,int b)
	{
		return a/b;
	}
	}
class Test
{
	public static void main(String abc[])
	{
		Car c=new Car();
		System.out.println(c.sum(2, 5));
		System.out.println(c.subtraction(7,5));
		System.out.println(c.multiplicate(5,7));
		System.out.println(c.division(7,8));
	}

	}
