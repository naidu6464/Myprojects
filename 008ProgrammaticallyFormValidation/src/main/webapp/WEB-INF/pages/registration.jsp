<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
<STYLE>
.error {
	color: red;
}
</STYLE>
</head>
<body>
	<CENTER>
		<H1>Employee Registration</H1>
	</CENTER>
	<hr>
	<hr>
	<form:form action="registration.html" METHOD="POST"
		commandName="employee">
		<table align="center">
			<tr>
				<td>Employee Id</td>
				<td><form:input path="eid" /></td>
				<td><form:errors path="eid" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Employee Name</td>
				<td><form:input path="ename" /></td>
				<td><form:errors path="ename" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Employee Salary</td>
				<td><form:input path="esal" /></td>
				<td><form:errors path="esal" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Employee Company</td>
				<td><form:input path="ecompany" /></td>
				<td><form:errors path="ecompany" cssClass="error" /></td>
			</tr>

			<tr>
				<td></td>
				<td><INPUT TYPE="submit" VALUE="submit"></td>
			</tr>
		</table>

	</form:form>

</body>
</html>