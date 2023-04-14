/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import main.entidad.Cafetera;
import main.servicios.CafeteraServicio;

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
        CafeteraServicio Cs= new CafeteraServicio();
        Cafetera cafe= new Cafetera(1000,400);
        Cs.llenarCafetera(cafe);
        System.out.println(cafe.getCantidadActual());
        Cs.servirTaza(cafe);
        System.out.println(cafe.getCantidadActual());
        Cs.llenarCafetera(cafe);
        System.out.println(cafe.getCantidadActual());
        Cs.vaciarCafetera(cafe);
        System.out.println(cafe.getCantidadActual());
        
        
    }
    
}
