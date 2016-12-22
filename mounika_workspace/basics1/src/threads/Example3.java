package threads;

public class Example3
{
public static void main(String abc[])
{
	Example1 e1=new  Example1();
	Example2 e2=new Example2();
	e1.start();
	e2.start();
	e1.sleep(100);
	e1.notify();
}
}
