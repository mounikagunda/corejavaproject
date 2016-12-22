package MyAl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Myiterator
{
	
	 public static void main(String a[])
	    {
	        ArrayList<String> arrl = new ArrayList<String>();
	        //adding elements to the end
	        arrl.add("First");
	        arrl.add("Second");
	        arrl.add("Third");
	        arrl.add("Random");
	        Iterator<String> itr = arrl.iterator();
	        while(itr.hasNext()){
	            System.out.println(itr.next());
	        }
	    }
	
}
