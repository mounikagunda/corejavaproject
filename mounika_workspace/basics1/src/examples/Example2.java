package examples;

public class Example2 
{
int[] i=new int[3];
static int j;
public void insertion()
{
	for(int k=0;k<=2;k++)
	{
		i[k]=k;
		j=k+i[k];
	}
	int i=2;
	while(i>=0)
	{
		i=i+i;
	}i--;
	do
	{
     System.out.println("do while");
     //i++;
    }while(i<=0);
	
}
public static void main(String abc[])
{
	Example2 exam=new Example2();
	exam.insertion();
	if(j<exam.i[0])
	{
		System.out.println(j+"value is letter");
		
	}
	if(j>exam.i[1])
	{
		System.out.println("j is greater");
		
	}
	else
	{
		System.out.println("j is lesser");
	}
	if(exam.i[0]>j)
	{
		System.out.println(exam.i[0]+"is greater");
		
	}
	else if(exam.i[1]>j)
	{
		System.out.println(exam.i[1]+"is greater");
		
	}
	else
	{
		System.out.println(j+"is greater");
		
	}
}
}
