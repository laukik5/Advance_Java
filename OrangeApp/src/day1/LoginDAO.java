package day1;


import java.text.*;
import java.util.*;
import java.sql.*;
public class LoginDAO {
	static Connection con=null;
	static ResultSet rs=null;
	
	LoginDB login(LoginDB db)
	{
		Statement st=null;
		String username=db.getUsername();
		String password=db.getPassword();
		
		String insertQuery="insert into loginDetails"+"("+username+","+password+")";
		System.out.println("Username : "+username);
		System.out.println("Password : "+password);
		System.out.println("Query : "+insertQuery);
		return db;
		
		
	}
}
