package examples;

public class Stack 
{
static Stack s=new Stack();
int i;
public String toString()
{
	return "stack class reference";
}
public static void main(String abc[])
{
	Stack s1=new Stack();
	s1.i=10;
	System.out.println(s1.i);
	System.out.println(s1);
}
}
