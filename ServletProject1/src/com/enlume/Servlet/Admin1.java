package com.enlume.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Admin1
 */
@WebServlet("/Admin1")
public class Admin1 extends HttpServlet {

 
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
	
		connection c = new connection();
		Connection con = c.getConnection();
		Statement st = c.getStatement();
		
	int	usname = Integer.parseInt(req.getParameter("username"));
	String pwd	 = req.getParameter("pwd");
    int price = Integer.parseInt(req.getParameter("price"));
	String	image = req.getParameter("image");
	String	desc = 	req.getParameter("desc");
	int	review 	=Integer.parseInt(req.getParameter("review"));
	int	stars	=Integer.parseInt(req.getParameter("stars"));
	int	cate 	=Integer.parseInt(req.getParameter("cate"));
		//out.print(usname);
		
		try {
			PreparedStatement ps = con.prepareStatement("INSERT INTO products VALUES(?,?,?,?,?,?,?,?)");
			ps.setInt(1, usname);
			ps.setString(2, pwd);
			ps.setInt(3, price);
			ps.setString(4, image);
			ps.setString(5, desc);
			ps.setInt(6, review);
			ps.setInt(7, stars);
			ps.setInt(8, cate);
			
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

	
}
