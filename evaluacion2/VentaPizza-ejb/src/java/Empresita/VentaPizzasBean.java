/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresita;

import javax.ejb.Stateless;

/**
 *
 * @author crist
 */
@Stateless
public class VentaPizzasBean implements VentaPizzasBeanLocal {

    @Override
    public String obtenerDatosProducto(int codigoProducto, int datoSolicitado) {
        String[][] productos = new String[12][3];
        productos[0][0] = "1";
        productos[0][1] = "mediana";
        productos[0][2] = "1000";
        productos[1][0] = "2";
        productos[1][1] = "familiar";
        productos[1][2] = "3000";
        productos[2][0] = "3";
        productos[2][1] = "XL";
        productos[2][2] = "5000";
        productos[3][0] = "4";
        productos[3][1] = "salsa tomate";
        productos[3][2] = "1000";
        productos[4][0] = "5";
        productos[4][1] = "crema";
        productos[4][2] = "1000";
        productos[5][0] = "6";
        productos[5][1] = "barbacoa";
        productos[5][2] = "1000";
        productos[6][0] = "7";
        productos[6][1] = "pepperoni";
        productos[6][2] = "500";
        productos[7][0] = "8";
        productos[7][1] = "jamon";
        productos[7][2] = "500";
        productos[8][0] = "9";
        productos[8][1] = "carne";
        productos[8][2] = "500";
        productos[9][0] = "10";
        productos[9][1] = "tomate";
        productos[9][2] = "500";
        productos[10][0] = "11";
        productos[10][1] = "champignon";
        productos[10][2] = "500";
        productos[11][0] = "12";
        productos[11][1] = "aceituna";
        productos[11][2] = "500";

        return productos[codigoProducto][datoSolicitado];
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
