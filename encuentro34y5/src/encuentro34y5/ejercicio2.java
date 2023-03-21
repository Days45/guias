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
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String palabra;
        System.out.println("Ingrese una frase");
        palabra= leer.nextLine();
        if (palabra.equals("eureka") || palabra.equals("EUREKA")) {
            System.out.println("La frase ingresada "+palabra+" es correcta");
        }else{
            System.out.println("La frase ingresada "+palabra+" es incorrecta");
        }
    }
    
}
