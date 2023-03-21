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
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero");
        numero= leer.nextInt();
        if (numero%2==0) {
            System.out.println("El numero ingresado " +numero+ " es par");
        }else{
            System.out.println("El numero ingresado " +numero+ " es impar");
        }
        
        
    }
    
}
