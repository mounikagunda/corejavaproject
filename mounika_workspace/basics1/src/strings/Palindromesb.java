// palindrome using stringbuffer
package strings;
import java.util.Scanner;

public class Palindromesb 
{
	public static void main(String[] args)
	{
	 
	 Scanner in = new Scanner(System.in);
	 System.out.println("Enter a string");
	 String str=in.nextLine();
	 
	 StringBuffer strone=new StringBuffer(str);
	 StringBuffer strtwo=new StringBuffer(strone);
	 
	  strone.reverse();
	 
	  System.out.println("orginal string  "+strtwo);
	  System.out.println("after reverse  "+strone);
	 
	 if(String.valueOf(strone).compareTo(String.valueOf(strtwo))==0)
	   System.out.println("palindrome");
	    else
	    System.out.println("not palindrome");
	 
	    }
}
