/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g13ej2;

import Entidad.MiClase;

/**
 *
 * @author castr
 */
public class G13Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MiClase m=new MiClase(5);
        //caso de prueba valido
        m.nose(0, 10);
        System.out.println("Valor en el índice 0: " + m.getNumber(0));
        //caso de prueba no valido
        m.nose(6, 20);
    }
    
}
