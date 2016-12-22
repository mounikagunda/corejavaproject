//program on replace method
package strings;
import java.util.Scanner;


public class Stringex3 
{
	

		   public static void main(String args[])
		   {
		      //String Str = new String("Welcome to Tutorialspoint.com");
			   Scanner sc=new Scanner(System.in);//it will end when the white space occured
			   System.out.println("enter a String");
			   String str=sc.next();

		      System.out.print("Return Value :" );
		      System.out.println(str.replace('o', 'T'));

		      System.out.print("Return Value :" );
		      System.out.println(str.replace('l', 'D'));
		   }
		
}
