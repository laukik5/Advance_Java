<%@page import="com.service.UserService"  %>
<%@page import="com.service.UserServiceImp"  %>

<jsp:useBean id="user" class="com.dto.User" scope="page"></jsp:useBean>
<jsp:setProperty property="*" name="user"/>
<%
	UserService us = new UserServiceImp();
	us.registerUser(user);
	response.sendRedirect("Login.jsp");
%>