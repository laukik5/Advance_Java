package day2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RequestServlet")
public class RequestPara extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("txt/html");
		String str=req.getParameter("un");
		PrintWriter out=resp.getWriter();
		out.print("<h1>Welcome  "+str+"<h1>");
		out.flush();
		out.close();
		
	}
	
}
