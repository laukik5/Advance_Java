<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="reg.jsp" method="post" >
		<table align="center" style="background-color: gray;font-size: 25px" >
			<thead>
				<tr>
					<th colspan="2" >Registration Page</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>User Name</td>
					<td><input type="text" name="userName"  /> </td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="userPass"  /> </td>
				</tr>
				<tr>
					<td><a href="Login.jsp" >Back</a> </td>
					<td><input type="submit" value="Register"  /> </td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>