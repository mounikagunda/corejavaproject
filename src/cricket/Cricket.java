package cricket;

import java.util.Scanner;
class oversException extends Exception
{
	public String toString()
	{
		return "overs most be lessthan 50";
	}
}

public class Cricket<IndTotalscore> 
{
	//private static final int Totalscroe = 0;
	String name;
	float runrate ;
	int overs ,wickets;
	
	//int Totalscore;
	public void Teamone()
	{
		System.out.println("Enter the team name:");
		
		
	}
	public void Teamtwo()
	{
		System.out.println("Enter the team name:");
		
	}
	
	public int Totalscore(float overs, float runrate)
	{
		
	 int Tscore = (int) (overs*runrate);
		//System.out.println("india total score:");
	 
	return  Tscore;
	}
	public void condition(float runrate,int sr)
	{
		
	if(runrate>=6.0)
	{
		wickets = 7;
		

		System.out.println("india total score:"+sr+"/"+wickets);
		}
		else
		{
			wickets=9;
			System.out.println("india total score:"+sr+"/"+wickets);
		}
	}
	
	
	public int Ts1(float overs1, float runrate1)
	{
		
	 int Ts = (int) (overs1*runrate1);
	return  Ts;
	}
	public void condition2(float runrate1,int rate)
	{
		
	if(runrate1>=6.0)
	{
		wickets = 7;
		
		
		System.out.println("Aus total score:"+rate+"/"+wickets);
	}
	else
		{
			wickets=9;
			System.out.println("Aus total score:"+rate+"/"+wickets);
		}
	}
	
	public void result(int sr,int rate)
	{
		int Result;
		if(sr>rate)
		{
			Result=sr-rate;
			System.out.println("INDIA WON BY :"+Result);
		}
		else
		{
			Result=rate-sr;
			System.out.println("AUSTRALIA WON BY :"+Result);
		}
	}
	
	
	public static void main(String[]args) throws oversException
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("welcome to odi 50 overs match");
	System.out.println("Match start between IND vs AUS");
	Cricket c=new Cricket();
	c.Teamone();
	String name=sc.next();
	c.Teamtwo();
	String name2=sc.next();
	System.out.println("enter the overs played by india");
	float overs=sc.nextFloat();
	if(overs<=50)
	{
		System.out.println("Enter the run rate:");
		
			
	}
	else
	{
		throw new oversException(); 
	}
	float runrate=sc.nextInt();
	int sr=	c.Totalscore(overs,runrate);
		c.condition(runrate, sr);
		
	
	
	//2nd innings start
	System.out.println("welcome to secondinning");
	System.out.println("enter the overs played by AUStralia");
	float overs1=sc.nextFloat();
	//float overs=sc.nextFloat();
	//if(overs1>=50)
	
		System.out.println("Enter the run rate:");
		float runrate1=sc.nextInt();
	int rate=c.Ts1(overs1,runrate1);
		c.condition2(runrate1,rate);
		
			
	
	c.result(sr, rate);
	
	}
	
	
	
	
	
	
	}	


