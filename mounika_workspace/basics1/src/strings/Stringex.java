package strings;

public class Stringex 
{
	public static void main(String abc[])
	{
		String s1=new String("dhatri");
		String s2="dhatri";
		String s3=new String("dhatri");
		String s4="dhatri";
		if(s1.equals(s4))
		{
			System.out.println("content same");
		}
		else
			System.out.println("diff content");
		if(s1==s2)
		{
			System.out.println("same ref");
			
		}
		else
			System.out.println("diff ref");
		if(s2==s4)
		{
			System.out.println("same ref");
		}
		else
			System.out.println("diff ref");
		s1=new String("info");
		s1="dhatri";
	}

}
