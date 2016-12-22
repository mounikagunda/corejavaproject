package strings;

public class Task 
{
static int i,j;
float f1,f2;
Task(float f1,float f2)
{
	i=(int) (f1+f2);
	j=(int) (f1-f2);
	this.f1=this.i+j;
	this.f2=f2+this.f1;
}
Task(float f1)
{
	f1=i+j;
	Task(float f1,float f2);
	System.out.println(f1);
}
}
class Task2 extends Task
{
	static int i,j;
	Task2()
	{
		System.out.println("dhatri");
	}	
	
	public functionOne(float f1)
	{
		Task2.f1=f1+Task.i;
		Task2.f2=Task.i+Task2.f1;
		return (int)(Task2.f1+Task2.f1);
	}
	public static void main(String abc[])
	{
		Task2 t2=new Task2();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two float values");
		int i=t.functionOne(float f1);
		t.functionOne(f1);
		System.out.println(Task1.f1);
		System.out.println(TAsk1.f2);
		System.out.println(t2.f1);
		System.out.println(t2.f2)
		}
}