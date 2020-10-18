<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="serv.TestBean" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% 
		TestBean std = (TestBean)session.getAttribute("tb");
	%>
	<%=std.getRollno()%><br>
	<%=std.getName()%><br>
	<%=std.getMarks()%><br>
	<%=std.getBranch()%><br>	
</body>
</html>