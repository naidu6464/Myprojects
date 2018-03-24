<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
	<CENTER>
		<H3>Thanks for Registration. Your details....</H3><hr>
	</CENTER>
	<hr>
	<hr>
	
			<table align="center">
				<tr>
					<td>Employee Id</td>
					<td>${ employee.eid }  </td>
				</tr>
				<tr>
					<td>Employee Name</td>
					<td>${ employee.ename }</td>
				</tr>
				<tr>
					<td>Employee Salary</td>
					<td>${ employee.esal }</td>
				</tr>
				<tr>
					<td>Employee Company</td>
					<td>${ employee.ecompany }</td>
				</tr>

				<tr>
					<td></td>
					
				</tr>
			</table>
			
		
	
</body>
</body>

</html>