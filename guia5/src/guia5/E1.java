/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 Realizar un algoritmo que calcule la suma de todos los elementos de un
vector de tamaño N, con los valores ingresados por el usuario.
 */
package guia5;

import java.util.Scanner;

/**
 *Exta1
 * @author castr
 */
public class E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner yo= new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n=yo.nextInt();
        int[] vector=new int[n];
        System.out.println("Ingrese los valores para el vector");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("En la posicion "+(i+1));
            int num=yo.nextInt();
            vector[i]=num;
        }
        int suma=0;
        for (int i = 0; i < vector.length; i++) {
            suma+=vector[i];
        }
        System.out.println("La suma de los numeros ingresados es: "+suma);
    }
    
}
