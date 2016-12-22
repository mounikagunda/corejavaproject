package oops;

public class DemoOne2 
{
	private int x;
	static float f1,f2;
	static boolean flag;
	public float functionOne(float f1,float f2)
	{
		DemoOne2.f1=f1+f2;
		DemoOne2.f2=DemoOne2.f1+f2;
		return DemoOne2.f2+f1;
	}
	public int functionOne(float f1)
	{
		DemoOne2.f1=f1+f2;
		f1=DemoOne2.f1+f1;
		return(int)f1;
	}
	public static DemoOne2 functionOne(int x)
	{
		DemoOne2 done=new DemoOne2();
		done.x=done.functionOne(x+1.0f);
		f1=done.functionOne((float)x,f1);
		return done;
	}
	

}
class DemoTwo extends DemoOne2
{
	public float functionOne(float f1,float f2)
	{
		DemoOne2.f1=f1+DemoOne.f1;
		DemoOne2.f2=f1;
		return DemoOne2.f1+DemoOne2.f2;
	}
	
	public static void main(String abc[])
	{
		DemoTwo dtwo=new DemoTwo();
		float d1=dtwo.functionOne(2.0f);
		float d2=dtwo.functionOne(d1,d1+d1);
		System.out.println(d1);
		System.out.println(d2);
		DemoOne2 done=new DemoTwo();
		float f1=done.functionOne(2.0f);
		float f2=done.functionOne(f1, f1+f1);
		System.out.println(f1);
		System.out.println(f2);
	}
}