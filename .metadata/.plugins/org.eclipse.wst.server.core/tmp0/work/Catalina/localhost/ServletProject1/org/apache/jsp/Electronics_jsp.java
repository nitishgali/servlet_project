/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.88
 * Generated at: 2018-06-27 18:37:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.enlume.Servlet.connection;
import java.sql.*;
import com.enlume.Servlet.*;

public final class Electronics_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("    <title>ela website</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"bootstrap/css/style.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("  \n");
      out.write("    ");

    connection db = new connection();
    
    Connection con = db.getConnection();
    
      out.write("\n");
      out.write("  \n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("  <nav class=\"navbar navbar-default\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("      </button>\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">ELA Application</a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("        <li class=\"active\"><a href=\"#\">Home <span class=\"sr-only\">(current)</span></a></li>\n");
      out.write("        <li><a href=\"#\">Services</a></li>\n");
      out.write("        <li class=\"dropdown\">\n");
      out.write("          <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">More<span class=\"caret\"></span></a>\n");
      out.write("          <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("            <li><a href=\"#\">Sell on ELA</a></li>\n");
      out.write("            <li><a href=\"#\">24x7 CustomerCare Support</a></li>\n");
      out.write("            <li><a href=\"#\">Advertize</a></li>\n");
      out.write("            <li class=\"divider\"></li>\n");
      out.write("            <li><a href=\"#\">Registered Office Address</a></li>\n");
      out.write("            <li class=\"divider\"></li>\n");
      out.write("            <li><a href=\"#\">Press</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("      <form class=\"navbar-form navbar-left\" role=\"search\">\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("          <input type=\"text\" class=\"form-control\" placeholder=\"Search\">\n");
      out.write("        </div>\n");
      out.write("        <button type=\"submit\" class=\"btn btn-default\">Submit</button>\n");
      out.write("      </form>\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("        <li><a href=\"Registration.html\">Your Cart</a></li>\n");
      out.write("        <li class=\"dropdown\">\n");
      out.write("          <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">Join us <span class=\"caret\"></span></a>\n");
      out.write("          <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("            <li><a href=\"Registration.html\">Register</a></li>\n");
      out.write("            <li><a href=\"Login.html\">Login</a></li>\n");
      out.write("            <li><a href=\"#\">Today's Deals</a></li>\n");
      out.write("            <li class=\"divider\"></li>\n");
      out.write("            <li><a href=\"#\">Your Account Info</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("      </div>\n");
      out.write("      </div>\n");
      out.write("      </nav>\n");
      out.write("       <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("        <!-- Wrapper for slides -->\n");
      out.write("        <div class=\"carousel-inner\">\n");
      out.write("         <div class=\"item active\">\n");
      out.write("                <img src=\"images/img2.jpg\">\n");
      out.write("            </div>\n");
      out.write("            <!-- End Item -->\n");
      out.write("            <div class=\"item\">\n");
      out.write("                <img src=\"images/abc1.jpg\">\n");
      out.write("        \n");
      out.write("            </div>\n");
      out.write("            <!-- End Item -->\n");
      out.write("            <div class=\"item\">\n");
      out.write("                <img src=\"images/abc.jpg\">\n");
      out.write("            </div>\n");
      out.write("            <!-- End Item -->\n");
      out.write("        </div>\n");
      out.write("        <!-- End Carousel Inner -->\n");
      out.write("        <ul id=\"myCarousel\" class=\"nav nav-pills nav-justified\">\n");
      out.write("            <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"><a href=\"#\">About<small>ELA Application</small></a></li>\n");
      out.write("            <li data-target=\"#myCarousel\" data-slide-to=\"1\"><a href=\"#\">Careers<small>ELA Application</small></a></li>\n");
      out.write("            <li data-target=\"#myCarousel\" data-slide-to=\"2\"><a href=\"#\">Mail us<small>ELA Application</small></a></li>\n");
      out.write("            <li data-target=\"#myCarousel\" data-slide-to=\"3\"><a href=\"#\">Offers<small>ELA Application</small></a></li>\n");
      out.write("        </ul>\n");
      out.write("        <hr />\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-sm-4 col-md-3\">\n");
      out.write("        <h3>Categories</h3>\n");
      out.write("        <div class=\"list-group\">\n");
      out.write("       <a href=\"Apparel.jsp\" class=\"list-group-item\">Apparel & Accessories</a>\n");
      out.write("          <a href=\"category.html\" class=\"list-group-item\">Baby Products</a>\n");
      out.write("          <a href=\"Electronics.jsp\" class=\"list-group-item\">Electronics</a>\n");
      out.write("          <a href=\"Furniture.jsp\" class=\"list-group-item\">Furniture</a>\n");
      out.write("          <a href=\"category.html\" class=\"list-group-item\">Luggage & Bags</a>\n");
      out.write("          <a href=\"category.html\" class=\"list-group-item\">Shoes</a>\n");
      out.write("          <a href=\"category.html\" class=\"list-group-item\">Watches</a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-sm-8 col-md-9\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("       ");

 		
 		try {
 			Statement st = db.getStatement();
 			
 			ResultSet rs = st.executeQuery("SELECT * FROM products");
 			
 			while(rs.next()) {
 		
      out.write("\t\n");
      out.write("       ");
 if(rs.getInt("Category")==3)
       { 
      out.write("\n");
      out.write("\t\t <div class=\"col-sm-6 col-md-4\">\n");
      out.write("\t\t <div class=\"thumbnail\">\n");
      out.write("\t\t <img src=\"");
      out.print(rs.getString("image") );
      out.write("\" alt=\"\">\n");
      out.write("\t\t <div class=\"add-to-cart\">\n");
      out.write("\t\t <a href=\"#\" class=\"glyphicon glyphicon-plus-sign\"\n");
      out.write("\t\tdata-toggle=\"tooltip\" data-placement=\"top\" title=\"Add to cart\"></a>\n");
      out.write("\t\t </div>\n");
      out.write("\t\t <div class=\"caption\">\n");
      out.write("\t\t <h4 class=\"pull-right\">");
      out.print(rs.getDouble("price") );
      out.write("</h4>\n");
      out.write("\t\t <h4><a href=\"product.html\">");
      out.print(rs.getString("prodName") );
      out.write("</a>\n");
      out.write("\t\t </h4>\n");
      out.write("\t\t <p>");
      out.print(rs.getString("description") );
      out.write("</p>\n");
      out.write("\t\t <div class=\"ratings\">\n");
      out.write("\t\t <p class=\"pull-right\"><a href=\"product.\n");
      out.write("\t\thtml#comments\">");
      out.print(rs.getInt("reviewCount") );
      out.write(" reviews</a></p>\n");
      out.write("\t\t <p>\n");
      out.write("\t\t ");
for(int i = 1; i <= rs.getInt("stars"); i++) { 
      out.write("\n");
      out.write("\t\t <span class=\"glyphicon glyphicon-star\"></span>\n");
      out.write("\t\t ");
} 
      out.write("\n");
      out.write("\t\t </p>\n");
      out.write("\t\t </div>\n");
      out.write("\t\t </div>\n");
      out.write("\t\t </div>\n");
      out.write("\t\t </div> \n");
      out.write("\t\t \n");
      out.write("\t\t \n");
      out.write("\t\t ");

       }
 			}
 			
 		} catch(Exception e) {
 			e.printStackTrace();
 		}
		 
      out.write("\n");
      out.write("\t\t  </div>\n");
      out.write(" </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("       <div class=\"container\">\n");
      out.write("    <hr />\n");
      out.write("    <!-- Footer -->\n");
      out.write("    <footer>\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-12\">\n");
      out.write("          <p>Copyright &copy; <a href=\"ecommerce.html\">Ecommerce Website</a> 2018</p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </footer>\n");
      out.write("  </div>\n");
      out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("    <script src=\"bootstrap/js/bootstrap.min.js\">\n");
      out.write("$(document).ready( function() {\n");
      out.write("    $('#myCarousel').carousel({\n");
      out.write("\t\tinterval:   4000\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\tvar clickEvent = false;\n");
      out.write("\t$('#myCarousel').on('click', '.nav a', function() {\n");
      out.write("\t\t\tclickEvent = true;\n");
      out.write("\t\t\t$('.nav li').removeClass('active');\n");
      out.write("\t\t\t$(this).parent().addClass('active');\t\t\n");
      out.write("\t}).on('slid.bs.carousel', function(e) {\n");
      out.write("\t\tif(!clickEvent) {\n");
      out.write("\t\t\tvar count = $('.nav').children().length -1;\n");
      out.write("\t\t\tvar current = $('.nav li.active');\n");
      out.write("\t\t\tcurrent.removeClass('active').next().addClass('active');\n");
      out.write("\t\t\tvar id = parseInt(current.data('slide-to'));\n");
      out.write("\t\t\tif(count == id) {\n");
      out.write("\t\t\t\t$('.nav li').first().addClass('active');\t\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t\tclickEvent = false;\n");
      out.write("\t});\n");
      out.write("});\n");
      out.write("  </script>\n");
      out.write("  </body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
