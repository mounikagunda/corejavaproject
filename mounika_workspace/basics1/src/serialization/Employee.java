package serialization;
import java.io.*;
class Employee implements Serializable
{
int eid;
String ename;
double estring;
double esalary;
public static void serialization() throws Exception
{
	Employee employee=new Employee();
	employee.eid=100;
	employee.ename="dhatri";
	employee.esalary=2500.00;
	FileOutputStream fos=new FileOutputStream(new File("D:/serial.txt"));
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(employee);
	System.out.println("serialization done");
}
public static void deserialization() throws Exception
{
	FileInputStream fis=new FileInputStream("D:/serial.txt");
	
	ObjectInputStream ois=new ObjectInputStream(fis);
	Object obj=ois.readObject();
	Employee emp=(Employee)obj;
	System.out.println("after deserializaton");
	System.out.println("id="+emp.eid);
	System.out.println("name="+emp.ename);
	System.out.println("salary="+emp.esalary);
}
	public static void main(String abc[])
	{
		//serialization();
		try {
			deserialization();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
