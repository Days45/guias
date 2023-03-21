/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro34y5;

import java.util.Scanner;

/**
 *
 * @author castr
 */
public class extra9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int i=0, resta, divisor, dividendo, resi=0;
        double cociente=0;
        System.out.println("Ingrese el divisor");
        divisor=leer.nextInt();
        System.out.println("Ingrese el dividendo");
        dividendo=leer.nextInt();
        resta=dividendo;
        while (resta-divisor>=0) {            
            i++;
            resta=resta-divisor;
            System.out.println((resta+divisor)+ " - "+divisor+ " = "+resta+"  resta sucesiva "+i );
        }
        if (resta<divisor) {
            resi=resta;
        }
        
        System.out.println( "La division entre "+ dividendo+ "/"+ divisor+ " = "+ resta);
        System.out.println("Residuo = "+resi);
        System.out.println("cociente = "+dividendo/divisor);
        
    }
    
}
