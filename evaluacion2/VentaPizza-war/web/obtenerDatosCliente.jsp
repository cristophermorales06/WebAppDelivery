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
        <link href="css/newcss.css" rel="stylesheet" type="text/css"/>
        <script src="js/funciones.js" type="text/javascript"></script>
    </head>

    <body style="font-family: arial">


        <h1 id="encabezado" style="font-size: 200%">Arma tu pizza como quieras, tenemos los ingredientes más frescos y la masa más crujiente.</h1>
        <div id="formula">

            <center><p style="font-size: 140%">Elige tu base:</p></center><br><br>
            <div id="cuadro"></div>
            <form name ="accionPizza"  method="post" action="BoletaPizzaServlet" onsubmit="return validateForm()"> 

                <p>Tamaño:</p><br>
                <select name="masa">
                    <option value=""></option>
                    <option value="mediana" >Mediana</option>
                    <option value="familiar">Familiar</option>
                    <option value="XL">XL</option>
                </select>
                <br><br>
                <p>Tipo de masa:</p><br>
                <select name="tamano_masa">
                    <option value=""></option>
                    <option value="normal">Normal</option>
                    <option value="fina">Fina</option>
                </select>

                <br>
                <br>
                <p>Salsa:</p><br>
                <select name="salsa">
                    <option value=""></option>
                    <option value="salsa de tomate">SALSA DE TOMATES</option>
                    <option value="crema">CREMA</option>
                    <option value="barbacoa">BARBACOA</option>
                </select>

                <br><br>

                <input type="radio" name="queso" value="queso" checked> Queso  <br>
                <input type="radio" name="queso" value="sin_queso"> Sin Queso  <br><br>


                <p id="selecciona" style="font-size: 140%"> Selecciona Ingredientes: </p><br><br>
                $500 c/u <br><br>
                <input type="checkbox" name="pepperoni" value="pepperoni">PEPPERONI <br>
                <input type="checkbox" name="jamon" value="jamon">JAMON <br>
                <input type="checkbox" name="carne" value="carne">CARNE <br>
                <input type="checkbox" name="tomate" value="tomate">TOMATE <br>
                <input type="checkbox" name="champignon" value="champignon">CHAMPIGNON <br>
                <input type="checkbox" name="aceitunas" value="aceitunas">ACEITUNAS<br> <br>

                <input type="submit" value="Enviar Pedido" id="botonEnviar">

            </form> </div>
        <footer id="pie">
            Delivery pizza Fono: 452348470 Celular: +56 958863373
        </footer>
    </body>
</html>
