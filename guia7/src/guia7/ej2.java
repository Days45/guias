/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7;

import entidad.Circuferencia;

/**
 *
 * @author castr
 */
public class ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circuferencia c1 = new Circuferencia(0);
        Circuferencia c2= new Circuferencia(0);
        c1.crearCircunferencia();
        System.out.println("Area: "+Math.round(c1.area()*100.0)/100.0);
        System.out.println("Perimetro: "+Math.round(c1.perimetro()*100.0)/100.0);
    }
    
}
