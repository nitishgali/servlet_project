package com.enlume.Servlet;
import java.sql.*;
public class connection {
	Connection con;
	Statement st;
	
	public connection()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "1234");
			st = con.createStatement();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public Connection getConnection()
	{
		return con;
	}
	
	public Statement getStatement()
	{
		return st;
	}
	
	void closeConn()
	{
		try
		{
			st.close();
			con.close();
		} catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	
}
