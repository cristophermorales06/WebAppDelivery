<%-- 
    Document   : obtenerDatosCliente
    Created on : 15-05-2017, 21:01:11
    Author     : crist
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="font-family: arial">


<h1 style="font-size: 200%">Arma tu pizza como quieras, tenemos los ingredientes más frescos y la masa más crujiente.</h1>


<p style="font-size: 140%">Elige tu base:</p>

<form name ="accionPizza" action="VentaPizzaServlet" method="post"> 


<select name="masa">
    <option value="mediana">Mediana</option>
    <option value="familiar">Familiar</option>
    <option value="XL">XL</option>
</select>

<select name="tamano_masa">
    <option value="normal">Normal</option>
    <option value="fina">Fina</option>
</select>

<br>

 <br><select name="salsa">
    <option value="salsa_tomate">SALSA DE TOMATES</option>
    <option value="crema">CREMA</option>
    <option value="barbacoa">BARBACOA</option>
</select><br>

 <input type="radio" name="queso" value="queso" checked> Queso  <br>
 <input type="radio" name="queso" value="sin_queso"> Sin Queso  <br></br>


<p style="font-size: 140%"> Selecciona Ingredientes: </p>
    $500 c/u
  <input type="checkbox" name="pepperoni" value="pepperoni">PEPPERONI <input type="number" name="quantity" min="1" max="2"><br>
  <input type="checkbox" name="jamon" value="jamon">JAMON <br>
  <input type="checkbox" name="carne" value="carne">CARNE <br>
  <input type="checkbox" name="tomate" value="tomate">TOMATE <br>
  <input type="checkbox" name="champignon" value="champignon">CHAMPIGNON <br>
  <input type="checkbox" name="aceitunas" value="aceitunas">ACEITUNAS<br> </br>

  <input type="submit" value="Enviar Pedido">

</form> 
        
    </body>
</html>
