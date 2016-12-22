package threads;
import java.io.*;
public class Example1 extends Thread

{
public void run()
{
	System.out.println("dispaly");
	for (int i = 0;i<=4;i++)
	{
		System.out.println(i+1);
		try {
			wait(202);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public static void main(String abc[])
{
	Example1 s=new Example1();
	s.start();
	s.run();
}
}
