
<%@page import="java.util.Iterator"%>
<%@page import="packgae1.Employee"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body style="background-color:Moccasin">
<div align="center">
<h1>Employee Info</h1>

<form action="EmployeeServlet" method="post">

 <table>
    <tr>
      <td>Enter Employee Id:</td>
      <td><input type="text" name="employeeId" /></td>
    </tr>

    
</table>

<input type="submit" value="Submit">
</form>

</div>

</body>

</html>