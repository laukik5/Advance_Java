
    <%@ page import="serv.TestBean" %>
    
    <%
    	TestBean tb=new TestBean();
    
    String p1 = request.getParameter("rn");
	int rolln = Integer.parseInt(p1);
    	
    	String name=request.getParameter("name");
    	   	
    	String p3 = request.getParameter("mark");
    	float tmark = Float.parseFloat(p3);
    	
    	String branch=request.getParameter("branch");
    	
    	tb.setRollno(rolln);
    	tb.setBranch(branch);
    	tb.setMarks(tmark);
    	tb.setName(name);
    	
    	session.setAttribute("TestBean", tb);
    	response.sendRedirect("show_1.jsp");
    %>
