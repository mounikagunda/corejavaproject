package examples;

public class Exam2 
{
	 long l1,l2;
	 static double d1,d2;
	 Exam2(long l1,long l2)
	 {
		 this.l1=l1+l2;
		 this.l2=l1*l2;
		 
	 }
	 Exam2()
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
		 Exam2 exam=new Exam2();
		 i=i+exam.functionOne(2.5,7.5);
		 System.out.println(i);
		 System.out.println(exam.l1);
		System.out.println(exam.l2);
		return 7.5;
	 }
	public static void main(String abc[])
	{
		double d1=functionTwo(2);
		Exam2 exam=new Exam2();
		d2=d1+d1;
		System.out.println(d1);
		System.out.println(exam.l1);
		System.out.println(exam.l2);
		System.out.println(exam);
		
	}
	}



