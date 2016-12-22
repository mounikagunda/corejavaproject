package MyAl;
import java.util.*;

public class MyArrayAdd
{
public static void main(String abc[])
{
ArrayList<String> al=new ArrayList<String>();
al.add("one");
al.add("two");
al.add("three");
System.out.println("actual arraylist:"+al);
ArrayList<String> al1=new ArrayList<String>();
al1.add("xyx");
al1.add("njnj");
al.addAll(al1);
System.out.println("after adding:" +al);
}
}