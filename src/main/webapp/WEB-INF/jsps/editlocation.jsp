<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>edit location</title>
</head>
<body>
<form action="updatelocation" method="POST">
<pre>
id:<input type="text" name="id" value="${location.id}" readonly="readonly"/>
code:<input type="text" name="code" value="${location.code}"/>
name:<input type="text" name="name" value="${location.name}"/>
type: Urban:<input type="radio"  name="type" value="URBAN"${location.type="Urban"?"checked":" "}/>
      Rural:<input type="radio"  name="type" value="RURAL" ${location.type="Rural"?"checked":" "} />
      
    <input type="submit" value="Submit">

</pre>
</form>
</body>
</html>