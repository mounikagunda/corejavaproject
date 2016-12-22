// program on codepointbefore 
package strings;

public class Stringex7
{
	 public static void main(String[] args) 
	 {
		  
		   String str = "JAVA";
		   System.out.println("String = " + str);
		       
		   // codepoint before index 1 i.e J
		   int retval = str.codePointBefore(1);
		        
		   // prints character before index1 in string
		   System.out.println("Character(unicode point) = " + retval);
		}
}
