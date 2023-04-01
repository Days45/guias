/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7;

import entidad.Puntos;

/**
 *
 * @author castr
 */
public class E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Puntos p1= new Puntos();
        p1.crearPuntos();
        System.out.println("La distancia es " +Math.round(p1.calculo()*100.0)/100.0);
    }
    
}
