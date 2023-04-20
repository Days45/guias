/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Escriba un programa que averigüe si dos vectores de N enteros son
iguales (la comparación deberá detenerse en cuanto se detecte alguna
diferencia entre los elementos)
 */
package guia5;

import java.util.Scanner;

/**
 *Extra2
 * @author castr
 */
public class E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //amargo es mi leer
        Scanner amargo = new Scanner(System.in);
        System.out.println("Ingrese el tamaño para los vectores");
        int n = amargo.nextInt();
        int[] vector1 = new int[n];
        int[] vector2 = new int[n];
        boolean bandera=true;
        if (vector1.length == vector2.length) {
            
            for (int i = 0; i < vector1.length; i++) {
                System.out.println("Ingrese para el vector1 en la posicion " + (i + 1));
                vector1[i] = amargo.nextInt();
                System.out.println("Ingrese para el vector2 en la posicion " + (i + 1));
                vector2[i] = amargo.nextInt();
            }
            System.out.println("////////vector1///////////");
            
            for (int i = 0; i < vector1.length; i++) {
                System.out.print("[" +vector1[i]+ "]");
            }
            
            System.out.println(" ");
            System.out.println("////////vector2///////////");
            
            for (int i = 0; i < vector1.length; i++) {
                System.out.print("[" +vector2[i]+ "]");
            }
            
            System.out.println(" ");
            System.out.println("///////////////////");
            
            for (int i = 0; i < vector1.length; i++) {
                if (vector1[i]!=vector2[i]) {
                    bandera=false;
                    System.out.println("No son iguales");
                    break;
                }
            }
            
            if (bandera) {
                
                System.out.println("Son iguales");
            }
        }


    }
    
}
