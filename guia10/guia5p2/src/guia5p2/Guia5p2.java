/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5p2;

import guia5p2.servicios.PaisServicios;

/**
 *
 * @author castr
 */
public class Guia5p2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PaisServicios ps= new PaisServicios();
        ps.cargarPais();
        ps.eliminarPais();
    }
    
}
