package strings;

public class Stringex16 
{
	public static void main(String[] args) {
		  
		   Integer i = new Integer(50);
		   Long l = new Long(50);
		   Float f = new Float(50);
		   Integer i1 = new Integer(0);
		    
		   // hash codes of different objects with same value are always same
		   System.out.println("Hash code of i is " + i.hashCode());
		   System.out.println("Hash code of i is " + l.hashCode());
		  
		   // hash code for float value is different for Integer and Long
		   System.out.println("Hash code of f is " +f.hashCode());    
		        
		   System.out.println("Hash code of i1 is "+ i1.hashCode());

		   String str = "dhatri info solutions";
		    
		   System.out.println("Hash code of string is " + str.hashCode());
		   }
}
