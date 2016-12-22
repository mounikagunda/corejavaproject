// program on cancat 
package strings;

import java.util.Scanner;

public class Stringex4
{
	public static void main(String args[])
	{  
		   //String s1="Sachin ";  
		   //String s2="Tendulkar";  
		   //String s3=s1.concat(s2);  
		   //System.out.println(s3);//Sachin Tendulkar 
		   Scanner sc=new Scanner(System.in);
		   System.out.println("enter string one");
		   String str=sc.next();
		   Scanner sc1=new Scanner(System.in);
		   System.out.println("enter string two");
		   String str1=sc1.next();
		   String s3=str1.concat(str);
		   System.out.println(s3);
    }  
}
