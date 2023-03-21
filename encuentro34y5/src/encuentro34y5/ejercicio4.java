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
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String palabra, letra;
        System.out.println("Ingrese una palabra o frase");
        palabra = leer.nextLine();
        letra=palabra.substring(0, 1);///meda la primera letra
        if (letra.equals("A")|| letra.equals("a")) { /*para ver si es igual a la palabra o caracter que se esta comparando*/
            System.out.println("La primera letra es "+letra);
            System.out.println("Correcto");
            
        }else{
            System.out.println("La primera letra es "+letra);
            System.out.println("Incorrecto");
        }
    }
    
}
