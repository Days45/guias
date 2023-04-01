/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7;

import entidad.Rectángulo;
import java.util.Scanner;

/**
 *
 * @author castr
 */
public class E6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        Rectángulo rectangulo1= new Rectángulo(4,6);
        rectangulo1.calcular_area();
        Rectángulo rectangulo2= new Rectángulo();
        rectangulo2.setLado1(7);
        rectangulo2.setLado2(8);
        rectangulo2.calcular_area();
        
        
        
        
    }
    
}
