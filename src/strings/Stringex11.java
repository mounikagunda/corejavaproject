//program for contains
package strings;

public class Stringex11
{
	public static void main(String[] args) 
	{
		  
		   String str1 = "java", str2 = "ava";

		   CharSequence cs = "aa";
		    
		   // if string contains the specified sequence of char values
		   boolean rval = str1.contains(cs);
		   System.out.println("Method returns : " + rval);
		    
		   // string does not contain the specified sequence of char value
		   rval = str2.contains("cs");   
		   System.out.println("Methods returns: " + rval);
		   }
}
