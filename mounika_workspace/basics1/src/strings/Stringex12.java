// program on contentequals using String buffer
package strings;

public class Stringex12
{
	public static void main(String[] args) {
		 
		   String str1 = "dhatri info";
		   String str2 = "dhatri info";
		  
		   StringBuffer strbuf = new StringBuffer(str1);
		   System.out.println("Method returns:" + str2.contentEquals(strbuf));
		   str2 = str1.toUpperCase();
		   System.out.println("Method returns:" + str2.contentEquals(strbuf));
		   }
}
