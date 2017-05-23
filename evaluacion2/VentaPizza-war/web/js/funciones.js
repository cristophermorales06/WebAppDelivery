/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function validateForm() {
    
    var x = document.forms["accionPizza"]["masa"].value;
    if (x === "") {
        alert("Debe seleccionar el tamaño de su pizza");
        return false;
    }

    var y = document.forms["accionPizza"]["tamano_masa"].value;
    if (y === "") {
        alert("Debe seleccionar el grosor de su pizza");
        return false;
    }

    var z = document.forms["accionPizza"]["salsa"].value;
    if (z === "") {
        alert("Debe escoger la salsa de su pizza");
        return false;
    }

    
}









