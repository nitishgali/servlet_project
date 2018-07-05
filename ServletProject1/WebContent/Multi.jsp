<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Multiplication Table</title>
</head>
<body>

<% if(request.getParameter("value") != null) {
	int tab = Integer.parseInt(request.getParameter("value"));
%>	
	
	<table>
		<%
		for(int i = 1; i <= 10; i++) {
		%>		
		<tr>
			<td><%=tab%> * <%=i%> = <%=tab*i%></td>
		</tr>
		
		<%} %>
	
	</table>
	
	
	
<%} else {
%>
<form action="Multi.jsp" method="post">
	<input type="text" name="value" placeholder="enter any number"/></td>
	<input type="submit" value="Get Table">
</form>

<%} %>

</body>
</html>