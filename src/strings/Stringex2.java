package strings;

import java.util.Scanner;

public class Stringex2
{
	public static void main(String abc[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter a string value");
		String str=input.next();
		char ch[]=new char[str.length()];
		for(int i=0;i<=str.length()-1;i++)
		{
		System.out.println(str.charAt(i));
		}
		
	}

}
