package day2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String uname=req.getParameter("un");
		String upass=req.getParameter("pw");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","password");
			PreparedStatement ps=con.prepareStatement("select * from logindetails where username=? and password=?");
			ps.setString(1, uname);
			ps.setString(2, upass);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				resp.sendRedirect("Index.html");
			}
			else {
				resp.sendRedirect("login.html");
			}
			PrintWriter out=resp.getWriter();
			con.close();
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
			
}
