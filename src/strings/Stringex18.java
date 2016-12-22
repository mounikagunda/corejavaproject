package strings;

public class Stringex18 
{
	public static void main(String[] args)
	{
		  
		   String str1 = "This is java";
		   
		   // returns canonical representation of the str1
		   String str2 = str1.intern();
		   
		   // prints str2
		   System.out.println(str2);
		    
		   // check if str1 and str2 are equal or not
		   System.out.println("Is str1 equal to str2 is " + (str1 == str2));
	}
}
