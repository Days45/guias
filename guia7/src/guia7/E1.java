/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7;

import entidad.Cancion;

/**
 *
 * @author castr
 */
public class E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cancion c1 = new Cancion();
        Cancion c2= new Cancion("Duality", "Set It Off");
        c1.setTitulo("Why Worry");
        c1.setAutor("Set It Off");
        System.out.println(c1);
        System.out.println(c2);
    }
    
}
