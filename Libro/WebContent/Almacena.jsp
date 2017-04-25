<%@  page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
h1 {text-align:center; 
color:#0099ff}

p {div-aling:jutifi; 
color:black;

}
</style>
</head>
<body bgcolor="#ccffb3">

<header> 
		<h1>Libro de sugerencias y reclamos</h1>
		<h1>Delivery  de pizzería</h1>
		<br>
		<br>
		    <p><B>
		       Estimados clientes a pedido de ustedes, hemos creado un libro de sugerencias y reclamos,<br>
		       para los cual nos puede dejar sus peticiones, reclamos o felicitaciones. si gusta puede <br>
		       dejar sus datos y nosotros nos comunicaremos con usted a la brevedad.</B>
		
	</header>
<div style="width:370px;">
<form action="Respuestas.do"method="POST">

Nombre: <input type="text" name="nombre"><br> <br/>
		
		<br> 
Comuna:<select name="comuna">

	<option value="padre-las-casas"> Padre Las Casas </option>
	<option value="temuco"> Temuco </option>
	<option value="otra-comuna"> Otra comuna </option>
</select> <br/><br/>
<br>

Telefono:<input type="text" name="telefono"><br/><br/>
<br>
Mail:<input type="email" name="mail"><br/><br/>

 Suegerencias y Reclamos: <br/><br/>
                <textarea rows="8" cols="50" name="historia" required></textarea><br/><br/>


<div style="text-align:right;">
	<input style="" type="submit" value="Guardar" ><br><br/>
</div>
</form>
</div>
</body>
</html>