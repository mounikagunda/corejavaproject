// program on endsWith
package strings;

public class Stringex14 
{
	public static void main(String[] args) {
		  
		   String str = "dhatriinfo";
		   System.out.println(str);

		   // the end string to be checked
		   String endstr1 = "info";
		   String endstr2 = "xyz";

		   // checks that string str ends with given substring
		   boolean rval1 = str.endsWith(endstr1);
		   boolean rval2 = str.endsWith(endstr2);

		   // prints true if the string ends with given substring
		   System.out.println("ends with " + endstr1 + " is " + rval1);
		   System.out.println("ends with " + endstr2 + " is " + rval2);
		   }
}
