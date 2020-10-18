package day3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/HomeApp")
public class HomeAppliance extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String t=request.getParameter("tl");
		String b=request.getParameter("bb");
		
		HttpSession hs=request.getSession(false);
		if(t!=null)
		{
			hs.setAttribute("3rd-Item", t);
		}
		if(b!=null)
		{
			hs.setAttribute("4th-Item", b);
		}
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<html>");
		out.print("<header>");
		out.print("<title> Home Appliances Page</title>");
		out.print("</header>");
		out.print("<body>");
		out.print("<form action='bill' method='get'>");
		out.print("<input type='checkbox' name='mix' value='mixer'>Mixer");
		out.print("<input type='checkbox' name='on' value='oven'>Oven<br>");
		out.print("<input type='submit' value='bill' ><br>");
		out.print("</form>");
		out.print("</body>");
		out.print("</html>");
		out.flush();
		out.close();
	}

}
