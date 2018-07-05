package com.enlume.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import java.sql.*;



public class LoginServlet extends GenericServlet {
	 String usname,pwd,email,phno;
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}

	
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
    res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		connection con = new connection();
		Connection co = con.getConnection();
		Statement st = con.getStatement();
		
    usname = req.getParameter("username1");
    pwd = req.getParameter("pwd1");
    try
    { 
    	String sql = "SELECT * FROM users";
    	ResultSet rs = st.executeQuery(sql);
    	while(rs.next())
    	{
    		if(rs.getString(1).equals(usname) && rs.getString(2).equals(pwd))
    		{
    			out.println("valid user");
    			break;
    		}
    	}
    }
    catch(Exception e)
    {
    	e.printStackTrace();
    }
		
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}

}
