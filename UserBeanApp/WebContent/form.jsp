<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="show.jsp" method="post">
		<table>
	<tr>
		<td>Roll no<input type="text" name="rn" placeholder="Enter roll no"></td>
	</tr>
	<tr>
		<td>Name<input type="text" name="name" placeholder="Enter name"></td>
	</tr>
	<tr>
		<td>Marks<input type="text" name="mark" placeholder="Enter marks"></td>
	</tr>
	<tr>
		<td>Branch<input type="text" name="branch" placeholder="Enter branch"></td>
	</tr>
	<tr>
		<td><input type="hidden" name="name1" value="loki"></td>
	</tr>
	<tr>
		<td><input type="hidden" name="name2" value="thor"></td>
	</tr>
	<tr>
		<td><input type="submit"  value="submit"></td>
	</tr>
		</table>
	</form>
</body>
</html>