package com.ss;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Statement;

public class DataBaseOperations 
{
	Connection connection;
	java.sql.Statement statementRef;
	PreparedStatement statement;
	ResultSet resultSet;
	
	public DataBaseOperations()
	{
		connection=MyConnection.getInstance().connection;
	}
	
	public int insertData(Employee employee)
	{
		int result=0;
		
		String query="insert into employee values("+ employee.getEmployeeId()+','+"'"+employee.getEmployeeName()+"',"+employee.getEmployeeSlary()+ ")";
		try {
			statementRef=connection.createStatement();
			result=statementRef.executeUpdate(query);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	public int insertDataUsingPrepared(Employee employee)
	{
		int result=0;
		
		String query="insert into employee values(?,?,?)";
		
		try {
			statement=connection.prepareStatement(query);
			
			statement.setInt(1, employee.getEmployeeId());
			statement.setString(2, employee.getEmployeeName());
			statement.setDouble(3, employee.getEmployeeSlary());
			
			result=statement.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return result;
		
		
	}
	
	
	public ArrayList<Employee> search()
	{
		ArrayList<Employee> listOfEmployee=new ArrayList<Employee>();
		
		Employee employeeRef=null;
		
		String query="select * from employee";
		
		try {
			statement=connection.prepareStatement(query);
			resultSet=statement.executeQuery();
			
			while(resultSet.next())
			{
				employeeRef=new Employee();
				employeeRef.setEmployeeId(resultSet.getInt(1));
				employeeRef.setEmployeeName(resultSet.getString(2));
				employeeRef.setEmployeeSlary(resultSet.getDouble(3));
				
				
				listOfEmployee.add(employeeRef);
			}
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return listOfEmployee;
	}
	
	public ArrayList<Employee> search(int employeeId)
	{
		ArrayList<Employee> listOfEmployee=new ArrayList<Employee>();
		
		Employee employeeRef=null;
		
		String query="select * from employee where E_id=?";
		
		try {
			statement=connection.prepareStatement(query);
			
			statement.setInt(1, employeeId);
			
			resultSet=statement.executeQuery();
			
			while(resultSet.next())
			{
				employeeRef=new Employee();
				employeeRef.setEmployeeId(resultSet.getInt(1));
				employeeRef.setEmployeeName(resultSet.getString(2));
				employeeRef.setEmployeeSlary(resultSet.getDouble(3));
				
				
				listOfEmployee.add(employeeRef);
			}
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return listOfEmployee;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
