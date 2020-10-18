package day3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Electro")
public class Electric extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String l=request.getParameter("lt");
		String c=request.getParameter("com");
		
		HttpSession hs=request.getSession(true);
		if(l!=null)
		{
			hs.setAttribute("1st-Item", l);
		}
		if(c!=null)
		{
			hs.setAttribute("2nd-Item", c);
		}
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<html>");
		out.print("<header>");
		out.print("<title> Electric Page</title>");
		out.print("</header>");
		out.print("<body>");
		out.print("<form action='HomeApp' method='get'>");
		out.print("<input type='checkbox' name='tl' value='tubelight'>TubeLight");
		out.print("<input type='checkbox' name='bb' value='bulb'>Bulb<br>");
		out.print("<input type='submit' value='Next' ><br>");
		out.print("</form>");
		out.print("</body>");
		out.print("</html>");
		out.flush();
		out.close();
	}

}
