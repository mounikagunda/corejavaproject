import java.util.*;

public class Example
{
public static void main(String abc[])
{
	ArrayList al=new ArrayList();
	al.add("dhatri");
	al.add(1000.0);
	ArrayList<String>al1=new ArrayList<String>();
	al1.add("1000");
	al1.add("dhatri");
	ArrayList<Integer>al2=new ArrayList<Integer>();
	al1.add("1000");
	al1.add("100");
	Employee emp=new Employee();
	emp.setId(1);
	emp.setName("gf");
	ArrayList<Employee>al3=new ArrayList<Employee>();
	al3.add(emp);
	Iterator it=al3.iterator();
	while(it.hasNext())
	{
		Employee ep=(Employee)it.next();
		System.out.println(emp.getId());
		System.out.println(emp.getName());
	}
}
}
