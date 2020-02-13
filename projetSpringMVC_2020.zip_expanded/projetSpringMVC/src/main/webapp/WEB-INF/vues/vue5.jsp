<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>  
<%--isELIgnored="false" permet d'interpreter les Expressions Languages, par défaut les EL sont désactivées --%> 
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>exemple5</title>
</head>
<body>

Pays : <spring:message text="${pays}" htmlEscape="true"/><br>

</body>
</html>