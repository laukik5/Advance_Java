<%@page import="com.service.UserService" %>
<%@page import="com.service.UserServiceImp" %>
<jsp:useBean id="user" class="com.dto.User" scope="session"></jsp:useBean>
<jsp:setProperty property="*" name="user"/>
<% 
	UserService us=new UserServiceImp();

	boolean ans = us.login(user);
	if(ans){
		response.sendRedirect("Home.jsp");
	}
	else{
		response.sendRedirect("Login.jsp?error_msg=wrong credentials");
	}
%>
