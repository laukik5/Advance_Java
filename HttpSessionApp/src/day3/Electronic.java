package day3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Electron")
public class Electronic extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		out.print("<html>");
		out.print("<header>");
		out.print("<title> Electronic Page</title>");
		out.print("</header>");
		out.print("<body>");
		out.print("<form action='Electro' method='get'>");
		out.print("<input type='checkbox' name='lt' value='laptop'>Laptop");
		out.print("<input type='checkbox' name='com' value='computer'>Computer<br>");
		out.print("<input type='submit' value='Next' ><br>");
		out.print("</form>");
		out.print("</body>");
		out.print("</html>");
		out.flush();
		out.close();
		
		}

}
