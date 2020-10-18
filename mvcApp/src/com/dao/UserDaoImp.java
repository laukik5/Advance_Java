package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.conn.MyConnection;
import com.dto.User;

public class UserDaoImp implements UserDao{
	private MyConnection myconn;
	
	
	
	public UserDaoImp() {
		
	myconn = new MyConnection();
	}

	@Override
	public int insertUser(User user) {
		int i=0;
		try {
			Connection con=myconn.getConn();
			PreparedStatement ps=con.prepareStatement("insert into user (username,userpassword)  values(?,?)");
			ps.setString(1, user.getUserName());
			ps.setString(2, user.getUserPass());
			i=ps.executeUpdate();
			ps.close();
		}
		catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public boolean login(User user) {
		boolean flag=false;
	
		try {
			Connection con=myconn.getConn();
			PreparedStatement ps=con.prepareStatement("select * from user where username=? and userpassword=?");
			ps.setString(1, user.getUserName());
			ps.setString(2, user.getUserPass());
			ResultSet rs =ps.executeQuery();
			if(rs.next())
			{
				flag=true;
			}
			ps.close();
		}
		catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return flag;

}
}
