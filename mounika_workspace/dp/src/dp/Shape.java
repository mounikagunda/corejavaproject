package dp;
interface Shape 
{
public void draw();
}
class Rectangle implements Shape
{
	public  void draw()
	{
		System.out.println("rectangle shape drawn");
		
	}
}
class Triangle implements Shape
{
	public void draw()
	{
		System.out.println("triangle shape drawn");
		
	}
}
class ShapeImp
{
	public static Shape getType(String draw)
	{
		if(draw==null)
		{
			return null;
		}
		else if(draw.equals("rectangle"))
		{
			return new Rectangle();
			
		}
		else if(draw.equals("triangle"))
		{
			return new Triangle();
		}
		return null;
	}
}
class Test1
{
	public static void main(String abc[])
	{
		System.out.println("1.Rectangle 2.Triangle");
		int choice = 0;
		switch(choice)
		{
		case 1:Shape s=ShapeImp.getType("rectangle");
		s.draw();
		break;
		
		
		case 2:Shape s1=ShapeImp.getType("Triangle");
		s1.draw();
		break;
		}
}
}