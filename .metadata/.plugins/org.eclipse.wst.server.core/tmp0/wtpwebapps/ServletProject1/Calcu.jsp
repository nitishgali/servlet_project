<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Calculator</title>
</head>
<body>

<% if(request.getParameter("txt1") != null && request.getParameter("txt2") != null && request.getParameter("op") != null) {
	String n1 = request.getParameter("txt1");
    String n2 = request.getParameter("txt2");
    String op = request.getParameter("op"); 
   
    
    if(op.equals("+")){
         out.println((Integer.parseInt(n1) + Integer.parseInt(n2)));
    }
    else if(op.equals("-")){
         out.println(Integer.parseInt(n1) - Integer.parseInt(n2));
    }
    else if(op.equals("*")){
         out.println(Integer.parseInt(n1) * Integer.parseInt(n2));
    }
    else{
        out.println(Integer.parseInt(n1) / Integer.parseInt(n2));
    }
%>	
	
	
	
<%} else {
%>
<form action="Calcu.jsp" method="post">
	Enter num1:
               <input name="txt1" type="text" />
            

                Enter num2:
               <input name="txt2" type="text" />
            
           
               Enter Operator
                
                <select name="op">
                   
                    <option value="+">+</option>
                    <option value="-">-</option>
                    <option value="*">*</option>
                    <option value="/">/</option>
                </select>
            

                <input type="submit" value="submit" />
            
</form>

<%} %>

</body>
</html>