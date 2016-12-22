package oops;

public class Aadhar 
{
	private String AadharNo;
	private String AadharName;
	
public void setAadharNo(String AadharNo)
	{
		this.AadharNo=AadharNo;
	}
public void setAadharName(String AadharName)
{
	this.AadharName=AadharName;
}

public String getAadharNo()
{
	return AadharNo;
}
public String getAadharName()
{
	return AadharName;
}
static class Test 
{
	public static void main(String[] args)
	{
		Aadhar a=new Aadhar();
	    a.setAadharNo("125245");
		a.setAadharName("dhatri");
		System.out.println("your AadharNo="+a.getAadharNo());
		System.out.println("your AadharName="+a.getAadharName());
		

}
}
}
