/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Menu.entidad.NIF;
import Menu.servicios.NIFService;

/**
 *
 * @author castr
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NIFService Nf = new NIFService();
        NIF n1= Nf.crearNif();
        Nf.mostrar(n1);
    }
    
}
