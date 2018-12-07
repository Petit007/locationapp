<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create location</title>
</head>
<body>
<form action="saveloc" method="POST">
<pre>
id:<input type="text" name="id"/>
code:<input type="text" name="code"/>
name:<input type="text" name="name"/>
type: Urban:<input type="radio"  name="type" value="Urban"/>
      Rural:<input type="radio"  name="type" value="Rural"/>
      
    <input type="submit" value="Submit">

</pre>
</form>
${msg}

<a href="displaylocation">View All</a>
</body>
</html>