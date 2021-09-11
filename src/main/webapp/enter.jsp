<%@page import="java.util.concurrent.CopyOnWriteArrayList"%>
<%@page import="java.time.format.TextStyle"%>
<%@page import="org.apache.catalina.connector.Request"%>

<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<%!String name = "" ;%>
	
<% 

Cookie[] cookie = request.getCookies();

for(Cookie cookies : cookie){
	
	if(cookies.getName().equals("txtname")){
		name = cookies.getValue();
		
	}
	
	
	
}


%>

<h3>Name is : <%= name %></h3>

</body>
</html>