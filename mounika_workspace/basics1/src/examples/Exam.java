package examples;

public class Exam 
{
 long l1,l2;
 static double d1,d2;
 Exam(long l1,long l2)
 {
	 this.l1=l1+l2;
	 this.l2=l1*l2;
	 
 }
 Exam()
 {
	 this((long)d1,(long)d2);
	 d1=l1;
	 d2=l2;
 }
 public int functionOne(double d1,double d2)
 {
	 int k=(int)d1+(int)d2;
	 return k;
	 
 }
 public static double functionTwo(int i)
 {
	 Exam exam=new Exam();
	 i=i+exam.functionOne(d1, d2);
	 System.out.println(i);
	 System.out.println(exam.l1);
	System.out.println(exam.l2);
	return 7.5;
 }
public static void main(String abc[])
{
	Exam exam=new Exam();
	double d1=functionTwo(2);
	System.out.println(d1);
	System.out.println(exam.l1);
	System.out.println(exam.l2);
	System.out.println(exam);
	
}
}
