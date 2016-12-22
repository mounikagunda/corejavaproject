package packgae1;

import java.io.IOException;




import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class Insert
 */
//@WebServlet("/Insert")
public class Insert extends HttpServlet {
	Connection  connection=null;
	PreparedStatement ps=null;
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Insert() {
        super();
        // TODO Auto-generated constructor stub
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		String employeeId=request.getParameter("employeeId");
		String employeeName=request.getParameter("employeeName");
		String employeeSalary=request.getParameter("employeeSalary");
		String employeeLocation=request.getParameter("employeeLocation");
		String employeeExp=request.getParameter("employeeExp");
		String employeeLoan=request.getParameter("employeeLoan");
		double salary;
		float exp;
		double loan;
		try
		{
		 salary=Double.parseDouble(employeeSalary);
		 loan=Double.parseDouble(employeeLoan);
		 exp=Float.parseFloat(employeeExp);
		}
		catch(Exception e)
		{
			salary=0.0;
			exp=0.0f;
			loan=0.0;
		}
		
		Employee employeeBean=new Employee();
		employeeBean.setEmployeeId(employeeId);
		employeeBean.setEmployeeName(employeeName);
		employeeBean.setEmployeeSalary(salary);
		employeeBean.setEmployeeLocation(employeeLocation);
		employeeBean.setEmployeeExp(exp);
		employeeBean.setEmployeeLoan(loan);
		
		
		DaoOperations dao=new DaoOperations();
		int result=dao.insertData(employeeBean);
		
		RequestDispatcher requestDispact=request.getRequestDispatcher("Success.jsp");
		
		HttpSession session=request.getSession();
		session.setAttribute("employeeId", employeeId);
		
		if(result>0)
		{
			requestDispact.forward(request, response);
		}
		
		
		
		
		
		
	}
	}



