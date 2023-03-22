/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Diseñe una función que pida el nombre y la edad de N personas e
imprima los datos de las personas ingresadas por teclado e indique si
son mayores o menores de edad. Después de cada persona, el programa
debe preguntarle al usuario si quiere seguir mostrando personas y frenar
cuando el usuario ingrese la palabra “No”.

 */
package guia4;

import java.util.Scanner;

/**
 *System.out.println(" ");
 * @author castr
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas");
        int  n=leer.nextInt();      
        edadP(n);
    }
    public static void edadP(int n) {
        Scanner leer = new Scanner(System.in);
        String opcion="";
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el nombre de la persona");
            String nombre = leer.nextLine();
            System.out.println("Ingrese la edad de esa persona");
            int edad = leer.nextInt();
            
            if (edad < 18) {
                System.out.println(nombre + " es menor");
            } else {
                System.out.println(nombre + " es mayor");
            }
            
            System.out.println("Desea Continuar si/no?");
            opcion = leer.next();
            if (opcion.equalsIgnoreCase("NO")) {
                break;
            }
        }
    }

}
