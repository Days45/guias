/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Crear una función rellene un vector con números aleatorios, pasándole
un arreglo por parámetro. Después haremos otra función o
procedimiento que imprima el vector.

 */
package guia5;

import java.util.Scanner;

/**
 *Extra3
 * @author castr
 */
public class E3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner luna=new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n=luna.nextInt();
        int[] vector= new int[n];
        llenar(vector);
        imprimir(vector);
    }
     public static int[] llenar(int[] vector){
         for (int i = 0; i < vector.length; i++) {
             vector[i]=(int)(Math.random()*11)+1;
             
         }
         return vector;
     }
      public static void imprimir(int[] vector){
         for (int i = 0; i < vector.length; i++) {
                System.out.print("[" +vector[i]+ "]");
            }
            System.out.println(" ");
         
     }
    
}
