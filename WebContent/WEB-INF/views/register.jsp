<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
</head>
<body>	
	<h2>Register Page</h2>
	<hr>
	<form action="student_reg" method="post">
		<table>
			<tr>
				<td>sname: </td>
				<td><input type="text" name="sname" /></td>
			</tr>
			<tr>
				<td>password: </td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td><input type="reset" value="reset" /></td>
				<td><input type="submit" value="submit" /></td>
			</tr>
		</table>
	</form>
</body>
</html>