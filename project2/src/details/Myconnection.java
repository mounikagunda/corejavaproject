package details;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Myconnection 
{
private static Myconnection mcon=new Myconnection();
public Connection connection;
private Myconnection()
{
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mouni","root","java");
	}
	catch (ClassNotFoundException e) 
	{
	
		
		e.printStackTrace();
	}
	catch (SQLException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public static Myconnection getInstance()
{
	
	return  mcon;

}

}
