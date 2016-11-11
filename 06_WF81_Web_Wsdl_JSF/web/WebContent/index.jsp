<%@page import="si.um.feri.ejb.Racun"%>
<%@page import="si.um.feri.ejb.Kalkulator"%>
<%@page import="javax.naming.InitialContext"%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>WildFly Demo: EJB + JSP + JSF + WSDL</title>
</head>
 
<body>
	<h1>WildFly Demo: EJB + JSP + JSF + WSDL</h1>

	<a href="faces/kalk.xhtml">JSF stran</a>

	<h2>Zgodovina:</h2>
	
	<%
		InitialContext ctx=new InitialContext();
		Kalkulator ejb=(Kalkulator)ctx.lookup("java:global/06_WF81_Web_Wsdl_JSF/06_WF81_Web_Wsdl_JSFEJB/KalkulatorBean!si.um.feri.ejb.Kalkulator");
	%>

	<ul>
		<% for (Racun r : ejb.zgodovina())  { %>
			<li><%=r.getRacun()%> = <%=r.getRezultat()%></li>
		<% } %>
	</ul>

</body>

</html>