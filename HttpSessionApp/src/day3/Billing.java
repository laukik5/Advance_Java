package day3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/bill")
public class Billing extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<>();
		HttpSession hs=request.getSession(false);
		
		String l=(String)hs.getAttribute("1st-Item");
		if(l!=null)
		{
			al.add(l);
		}
		String c=(String)hs.getAttribute("2nd-Item");
		if(c!=null)
		{
			al.add(c);
		}
		String t=(String)hs.getAttribute("3rd-Item");
		if(t!=null)
		{
			al.add(t);
		}
		String b=(String)hs.getAttribute("4th-Item");
		if(b!=null)
		{
			al.add(b);
		}
		String m=request.getParameter("mix");
		if(m!=null)
		{
			al.add(m);
		}
		String o=request.getParameter("on");
		if(o!=null)
		{
			al.add(o);
		}
		PrintWriter out=response.getWriter();
		out.print("<html>");
		out.print("<header>");
		out.print("<title>Bill");
		out.print("</title>");
		out.print("</header>");
		out.print("<body>");
		out.print("<h1>Items : </h1>");
		for(String s:al)
		{
			out.print("<h2>"+s+"</h2>");
		}
		
		out.print("</body>");
		out.print("</html>");
	}

}
