// program on copyValueOf

  
   // character array
   //char[] charArr = { 'C', 'O', 'M', 'P', 'I', 'L', 'E', ' ',
   //'O', 'N', 'L', 'I', 'N', 'E' };

   /* returns a String that contains the characters of the character
   array with offset as 8 and length as 6 */
   //String str = String.copyValueOf(charArr, 8, 6 );

   // prints the substring with length as 6 
  // System.out.println(str);o/p:ONLINE
  
package strings;

public class Stringex13 
{
	public static void main(String[] args) 
	{
		  
		   // character array
		   char[] charArr = { 'J', 'A', 'V', 'A' ,'s'};

		   // returns a String that contains the characters of the character array
		   String str = String.copyValueOf(charArr);

		   
		   System.out.println(str);
		   }
}
