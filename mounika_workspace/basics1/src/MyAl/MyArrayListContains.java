package MyAl;

import java.util.ArrayList;

public class MyArrayListContains
{
public static void main(String abc[])
{
	ArrayList<String> al=new ArrayList<String>();
	al.add("gb");
	al.add(("hjbn"));
	al.add("bvn");
	ArrayList<String> al1=new ArrayList<String>();
	al1.add("gb");
	al1.add("bvn");
	System.out.println("contains all :"+al.containsAll(al1));
	al1.add("jnj");
	
	System.out.println("contains all :"+al.containsAll(al1));
	
}
}
