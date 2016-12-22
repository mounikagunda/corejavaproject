import java.util.*;

public class Cricket
{
	public static void main(String[] args)
	{
		int score1,score2;
		String te2;
		
	
		Scanner s=new Scanner(System.in);
		System.out.println("welcome to the one day international 50 overs match");
        System.out.println("enter the first team name");
        String te1 = s.nextLine();
        
        System.out.println("enter the second team name");
        te2=s.nextLine();
        System.out.println("match starts b/w india v/s australia");
	}
        
       
       Object overs1() throws Exception
        {
        	 
        	String te1;
			System.out.println("enter the overs played by team:"+te1);
            Scanner s;
			Object o1 = s.nextInt();
            if(o1>50)
        	{
        		throw new OversException();
        	}
        	return o1;
        }
        int calculatingScore1()
        {
        String te1 = null;
		System.out.println("Enter the Runrate for :"+te1);
        Scanner s = null;
		float rr1=s.nextFloat();
        int rr = 0;
		int o1 = 0;
		int score1=rr*o1;
        return score1;
        }
        Object overs2() throws Exception
        {
        	 
        	String te2;
			System.out.println("enter the overs played by team:"+te2);
           Scanner s;
		Object o2=s.nextInt();
            if(o2>50)
        	{
        		throw new OversException();
        	}
        	return o2;
        }
        int calculatingScore2()
        {
        String te2 = null;
		System.out.println("Enter the Runrate for :"+te2);
        Scanner s = null;
		float rr2=s.nextFloat();
        int rr = 0;
		int o2 = 0;
		int score2=rr*o2;
        return score2;
        
	
}
}