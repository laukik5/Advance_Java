package day2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class RegisterReq extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		
		String name=req.getParameter("un");
		String pass=req.getParameter("pw");
		String gen=req.getParameter("gender");
		String lan[]=req.getParameterValues("languages");
		String add=req.getParameter("address");
		String city=req.getParameter("city");
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.print("<h1>UserName : "+name+"</h1>");
		out.print("<h1>PassWord : "+pass+"</h1>");
		out.print("<h1>Gender : "+gen+"</h1>");
		out.print("<h1>Address : "+add+"</h1>");
		out.print("<h1>City : "+city+"</h1>");
		out.print("<h1>Languages : </h1>");
		for(String s:lan)
		{
			out.print("<h1>"+s+"</h1>");
		}
		out.flush();
		out.close();
		
		
	}

}
