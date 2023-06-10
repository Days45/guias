/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g12ej4;

import Entidad.Circulo;
import Entidad.Rectangulo;

/**
 *
 * @author castr
 */
public class G12EJ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo c= new Circulo(4d, 2.5d);
        Rectangulo r= new Rectangulo(16.4d, 5.7d);
        System.out.println("El área del círculo es: " + Math.round(c.calcularArea()*100.0)/100.0);
        System.out.println("El perímetro del círculo es: " + Math.round(c.calcularPerimetro()*100.0)/100.0);
        
        System.out.println("El área del rectángulo es: " + Math.round(r.calcularArea()*100.0)/100.0);
        System.out.println("El perímetro del rectángulo es: " + Math.round(r.calcularPerimetro()*100.0)/100.0);
    }
    
}
