package MyAl;

import java.awt.List;
import java.util.ArrayList;

public class Sublist 
{
	public static void main(String a[])
	{
        ArrayList<String> arrl = new ArrayList<String>();
        //adding elements to the end
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        arrl.add("Click");
        System.out.println("Actual ArrayList:"+arrl);
        java.util.List<String> list = arrl.subList(2, 4);
        System.out.println("Sub List: "+list);

}
}