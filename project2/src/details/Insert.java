package details;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Insert
 */
@WebServlet("/Insert")
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
        connection=Myconnection.getInstance().connection;
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		response.getWriter().append("served at: ").append(request.getContextPath());
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		Employee emp=new Employee ();
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String eid=request.getParameter("eid");
		String ename=request.getParameter("ename");
		String esal=request.getParameter("esal");
		String eloc=request.getParameter("eloc");
		String eexp=request.getParameter("eexp");
		int sal,exp;
		try
		{
			sal=Integer.parseInt(esal);
			exp=Integer.parseInt(eexp);
		}
		catch(Exception e)
		{
			sal=0;
			exp=0;
		}
		 emp.setEid(eid);
		 emp.setEname(ename);
		 emp.setEsal(sal);
		 emp.setEloc(eloc);
		 emp.setEexp(exp);
		 
		 try{
			 PreparedStatement ps=connection.prepareStatement("insert into employee values(?,?,?,?,?)");
			 ps.setString(1, emp.getEid());
			 ps.setString(2,emp.getEname());
			 ps.setInt(3,emp.getEsal());
			 ps.setString(4,emp.getEloc());
			 ps.setInt(5,emp.getEexp());
			 int i=ps.executeUpdate();
			 out.print("Successfully Registered");
		 }
		 catch(SQLException e)
		 {
			 out.print(e);
			 
		 }
		 out.print("<html><body>");
		 out.print("<form action='index.html' "+ ">");
		 out.print("<input type='submit' value='go'>");
		 out.print("</form></body></html>");
		
	}

}
