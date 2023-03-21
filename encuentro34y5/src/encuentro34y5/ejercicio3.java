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
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String palabra;
        System.out.println("Ingrese una palabra o frase de 8 caracteres");
        palabra = leer.nextLine();
        int longitud = palabra.length();
        if (longitud==8) {
            System.out.println("longitud = " +longitud);
            System.out.println("Correcto");
        }else{
            System.out.println("longitud = " +longitud);
            System.out.println("Incorrecto");
        }
        
    }
    
}
