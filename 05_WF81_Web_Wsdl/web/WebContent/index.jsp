<%@page import="si.um.feri.ejb.Racun"%>
<%@page import="si.um.feri.ejb.Kalkulator"%>
<%@page import="javax.naming.InitialContext"%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>WildFly 8.1 Demo: EJB + WEB + WSDL</title>
</head>

<body>
	<h1>WildFly 8.1 Demo: EJB + WEB + WSDL</h1>

	<h2>Zgodovina:</h2>
	
	<%
		InitialContext ctx=new InitialContext();
		Kalkulator ejb=(Kalkulator)ctx.lookup("java:global/05_WF81_Web_Wsdl/05_WildFly81_Web_WsdlEJB/KalkulatorBean!si.um.feri.ejb.Kalkulator");
	%>

	<ul>
		<% for (Racun r : ejb.zgodovina())  { %>
			<li><%=r.getRacun()%> = <%=r.getRezultat()%></li>
		<% } %>
	</ul>

</body>

</html>