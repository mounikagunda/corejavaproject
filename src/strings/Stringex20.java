// program on matches 
package strings;

public class Stringex20 
{
	 public static void main(String[] args) {
		  
		   String str1 = "java", str2 = "dhatri";
		    
		   boolean rval = str1.matches(str2);
		   // method gets different values so it returns false
		   System.out.println("Value returned = " + rval);

		   rval = str2.matches("dhatri");
		   // method gets same values so it returns true
		   System.out.println("Value returned = " + rval);    

		   rval = str1.matches("avaa");
		   // method gets different values so it returns false
		   System.out.println("Value returned = " + rval);
		   }
}
