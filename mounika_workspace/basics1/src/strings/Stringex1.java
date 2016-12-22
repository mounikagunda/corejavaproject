package strings;

import java.util.Scanner;

public class Stringex1
{
	public static void main(String abc[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter a string value");
		String str=input.next();
		for(int i=0;i<=str.length()-1;i++)
		{
			System.out.println(str.charAt(i));
		}
		
	}

}
