/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresita;

import javax.ejb.Local;

/**
 *
 * @author crist
 */
@Local
public interface VentaPizzasBeanLocal {

    String obtenerDatosProducto(int codigoProducto, int datoSolicitado);
    
}
