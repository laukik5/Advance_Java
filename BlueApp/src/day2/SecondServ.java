package day2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/second")
public class SecondServ extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname=req.getParameter("un");
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.print("<h1 style="+"color :red"+";>Welcome to MyApp</h1>");
		out.print(uname);
		out.flush();
		out.close();
	}
	}
	
	
