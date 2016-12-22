
public class Singleton 
{
private static Singleton singleobj=new Singleton();
private  Singleton()
{
	
}
public static Singleton getInstance()
{
	return singleobj;
}
public void display()
{
	System.out.println("dingleton class");
}
}
class Sn1

{
	public static void main(String abc[])
	{
		
		Singleton.getInstance().display();
	}
}