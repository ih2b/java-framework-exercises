<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>  
<%--isELIgnored="false" permet d'interpreter les Expressions Languages, par d�faut les EL sont d�sactiv�es --%> 
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>exemple3</title>
</head>
<body>

Nom : ${nom}<br>
Pr�nom : ${prenom}<br>
Entreprise : ${entreprise}<br>

	<%-- RQ : pour �viter failles XSS --%>
	Entreprise : <spring:message text="${nom}" htmlEscape="true"/> 



<br>
Equivalent � :<br><br>
Nom : <%=request.getAttribute("nom") %><br>
Pr�nom : <%=request.getAttribute("prenom") %><br>
Entreprise : <%=session.getAttribute("entreprise") %><br>
</body>
</html>