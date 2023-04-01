/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7;

import entidad.Rectangulo;

/**
 *
 * @author castr
 */
public class ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangulo r1= new Rectangulo();
        r1.crearRectangulo();
        System.out.println("Superficie: "+r1.superficie(r1.getBase(), r1.getAltura()));
        System.out.println("Perimetro: "+r1.perimetro(r1.getBase(), r1.getAltura()));
        r1.dibujo(r1.getBase(), r1.getAltura());
    }
    
}
