package packgae1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

public class DaoOperations

{
	Connection connection=null;
	PreparedStatement preparedStatement=null;
	ResultSet resultSet=null;
	public DaoOperations() {
		connection = MyConnection.getInstance().connection;
	}

	public int insertData(Employee employeeBean) {
		int result = 0;
		String query = "insert into employee values(?,?,?,?,?,?)";

		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, employeeBean.getEmployeeId());
			preparedStatement.setString(2, employeeBean.getEmployeeName());
			preparedStatement.setDouble(3, employeeBean.getEmployeeSalary());
			preparedStatement.setString(4, employeeBean.getEmployeeLocation());
			preparedStatement.setFloat(5, employeeBean.getEmployeeExp());
			preparedStatement.setDouble(6,employeeBean.getEmployeeLoan());
			result = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;

	}
	
	public ArrayList<Employee> search()
	{
		ArrayList<Employee> employeeList=new ArrayList<Employee>();
		
		String query="select * from employee ";
		
		try {
			preparedStatement=connection.prepareStatement(query);
			//preparedStatement.setString(1, searchElement);
			
			resultSet=preparedStatement.executeQuery();
			
			Employee empBean=null;
			while(resultSet.next())
			{
				empBean=new Employee();
				empBean.setEmployeeId(resultSet.getString(1));
				empBean.setEmployeeName(resultSet.getString(2));
				empBean.setEmployeeSalary(resultSet.getDouble(3));
				empBean.setEmployeeLocation(resultSet.getString(4));
				empBean.setEmployeeExp(resultSet.getFloat(5));
				empBean.setEmployeeLoan(resultSet.getDouble(6));
				
				employeeList.add(empBean);
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return employeeList;
	}
	public ArrayList<Employee> search(String searchElement)
	{
		ArrayList<Employee> employeeList=new ArrayList<Employee>();
		
		String query="select employeeId,employeeName,employeeSalary,employeeLocation,employeeExp ,employeeLoan from employee where employeeId=?";
		
		try {
			preparedStatement=connection.prepareStatement(query);
			preparedStatement.setString(1, searchElement);
			
			resultSet=preparedStatement.executeQuery();
			
			Employee empBean=null;
			while(resultSet.next())
			{
				empBean=new Employee();
				empBean.setEmployeeId(resultSet.getString(1));
				empBean.setEmployeeName(resultSet.getString(2));
				empBean.setEmployeeSalary(resultSet.getDouble(3));
				empBean.setEmployeeLocation(resultSet.getString(4));
				empBean.setEmployeeExp(resultSet.getFloat(5));
				empBean.setEmployeeLoan(resultSet.getDouble(6));
				employeeList.add(empBean);
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return employeeList;
	}
	
public  ArrayList<Employee> loan(String temid)
{

ArrayList<Employee> al=new ArrayList<Employee>();
Employee db=null;		

String query="select * from employee where EmployeeId=?";
try 
{
	preparedStatement=connection.prepareStatement(query);
	preparedStatement.setString(1, temid);
	resultSet=preparedStatement.executeQuery();

	while(resultSet.next())
	{
		db=new Employee();
		db.setEmployeeId(resultSet.getString(1));
		db.setEmployeeName(resultSet.getString(2));
		db.setEmployeeSalary(resultSet.getDouble(3));
		
		db.setEmployeeLocation(resultSet.getString(4));
		db.setEmployeeExp(resultSet.getFloat(5));
		db.setEmployeeLoan(resultSet.getDouble(6));
		
		al.add(db);
	}
}
catch (SQLException e) 
{
	// TODO Auto-generated catch block
	e.printStackTrace();
}

Iterator<Employee> it=al.iterator();
Employee ee=null;


while(it.hasNext())
{
	
ee=(Employee)it.next();
if(db.getEmployeeExp()<=2 && db.getEmployeeExp()>1)
{
	double insal=db.getEmployeeSalary()/2;
	ee.setEmployeeLoan(insal);
	//double emi=((db.getEmployeeLoan()*0.14+db.getEmployeeLoan())/9);
	//ee.setEmpemi(emi);
}
else if(db.getEmployeeExp()>2 && db.getEmployeeExp()<5)
{
	
	double insal=(3*ee.getEmployeeSalary()/4);
	ee.setEmployeeLoan(insal);
	//double emi=((db.getEmployeeLoan()*0.14+db.getEmployeeLoan())/9);
	//ee.setEmpemi(emi);
}
try 
{
	String query1="update employee set EmployeeLoan=? where EmployeeId=?";
	preparedStatement=connection.prepareStatement(query1);
	preparedStatement.setDouble(1, ee.getEmployeeLoan());
	
	preparedStatement.setString(2, temid);
	int x=preparedStatement.executeUpdate();
	
}
catch (SQLException e) 
{
e.printStackTrace();
}
}


return null;

}
}