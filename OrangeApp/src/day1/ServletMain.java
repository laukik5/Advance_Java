package day1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/serve")
public class ServletMain extends HttpServlet{

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Initi called ---+++----");
		super.init();
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/plain");
		PrintWriter out  = resp.getWriter();
		out.print("Hello Servlet");
		System.out.println("Service called--------");
		out.flush();
		out.close();
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("service called ------Destroy");
		super.destroy();
	}

}
