package oops;
import java.io.*;
public class Buff
{
public static void main(String[] args)throws IOException
{
	BufferedReader oref=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter the id");
    String rid=oref.readLine();
    System.out.println("enter the name");
    String name=oref.readLine();
    System.out.println("enter the salary");
    String rsal=oref.readLine();double sal=Double.parseDouble(rsal);
    System.out.println("id="+rid);
    System.out.println("name="+name);
    System.out.println("salary="+sal);
    


}
}
