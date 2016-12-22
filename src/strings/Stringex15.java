//program on equals
package strings;

public class Stringex15 
{
	 public static void main(String[] args) {
		  
		   String str1 = "dhatri info solutions";
		   String str2 = "dhatri info solutions";
		   String str3 = "dhatri info";

		   // checking for equality
		   boolean r1 = str2.equals(str1);
		   boolean r2 = str2.equals(str3);

		   // prints the return value
		   System.out.println("str2 is equal to str1 = " + r1);
		   System.out.println("str2 is equal to str3 = " + r2);        
		   }
}
