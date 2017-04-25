<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Libro sugerencias y reclamos</title>
<style type="text/css">
h1 {text-align:center; 
color:#0099ff}

}
</style>
</head>
<body>
<h1>La siguiente persona a dado su opinion:</h1>

<h2><%= request.getAttribute("nombre") %> </h2>
<ul>
	<li><%= request.getAttribute("comuna") %></li>
	<li><%= request.getAttribute("telefono") %></li>
	<li><%= request.getAttribute("mail") %></li>
    <li><%= request.getAttribute("SugYRecl") %></li>
</ul>

<p><%= request.getAttribute("SugYRecl") %></p>

</body>
</html>