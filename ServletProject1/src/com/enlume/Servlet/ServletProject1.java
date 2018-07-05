package com.enlume.Servlet;

import java.io.IOException;


import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import java.io.PrintWriter;
import java.sql.*;



public class ServletProject1 extends GenericServlet {
	String usname,pwd,email,phno;
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
	
		connection c = new connection();
		Connection con = c.getConnection();
		Statement st = c.getStatement();
		
		usname = req.getParameter("username");
		email = req.getParameter("email");
		phno = req.getParameter("phno");
		pwd = req.getParameter("pwd");
		
		//out.print(usname);
		
		try {
			PreparedStatement ps = con.prepareStatement("INSERT INTO users VALUES(?,?,?,?)");
			ps.setString(1, usname);
			ps.setString(2, pwd);
			ps.setString(3, email);
			ps.setString(4, phno);
			
			int n = ps.executeUpdate();
			
			if(n > 0)
			{
				out.println("Added successfully");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}
		
		
	}

