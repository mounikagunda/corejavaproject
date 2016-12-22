//program on compareToIgnoreCase
package strings;

public class Stringex10 
{
	public static void main(String[] args) 
	{
		  
		   String str1 = "dhatri", str2 = "DHatrii";

		   // comparing str1 and str2 the  case ignored
		   int retval = str1.compareToIgnoreCase(str2);

		   // prints the return value of the comparison
		   if (retval > 0) 
		   {
		   System.out.println("str1 is greater than str2");
		   }
		        
		   else if (retval == 0) 
		   {
		   System.out.println("str1 is equal to str2");
		   }
		        
		   else 
		   {
		   System.out.println("str1 is less than str2");
		   }
		   }
}
