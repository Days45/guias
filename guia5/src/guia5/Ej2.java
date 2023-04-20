/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Realizar un algoritmo que llene un vector de tamaño N con valores
aleatorios y le pida al usuario un número a buscar en el vector. El
programa mostrará dónde se encuentra el numero y si se encuentra
repetido
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author castr
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        int n;
        System.out.println("Ingrese el tamaño del vector");
        n=leer.nextInt();
        int[]vector= new int[n];
        //rellenar vector
        for (int i = 0; i < vector.length; i++) {
            vector[i]=(int)(Math.random()*11)+1;
        }
        //
        System.out.println("Ingrese el numero a buscar");
        int numP=leer.nextInt();
        boolean encontrado=false;
       
        for (int i = 0; i < vector.length; i++) {
            if (numP==vector[i]) {
                encontrado=true;
            }
        }
        if (encontrado) {
        System.out.println("en esta posicion");
            for (int i = 0; i < vector.length; i++) {
                if (numP==vector[i]) {
                    System.out.print((i +1)+ " ");
                }
            }
        System.out.println("");

        }else{
            System.out.println("El numero no se encuentra en el vector");
        }
        //imprimir
        for (int i = 0; i <vector.length ; i++) {
            System.out.print("[" +vector[i]+ "]");
          
        }
        System.out.println("");
    }
    
}
