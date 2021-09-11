<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>JSP DEMO</title>
</head>
<body>

	<!-- SCRIPTLET -->




	<%
	for (int i = 0; i <= 10; i++)

		//System.out.println(i);
		out.println(i + "<br>");
	%>


	<%!ArrayList<String> arrayList = new ArrayList<String>();%>

	<%
		arrayList.add("vivek");
		%>

	<%
	for (String arrayList : arrayList) {
		
	%>
	
	<h1><%=arrayList%></h1>

	<%
	}
	%>

</body>
</html>