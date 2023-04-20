/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import java.util.Scanner;

/**
 * 
 * @author castr
 */
public class E7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese el numero");
        int n=leer.nextInt();
        int[] sucesion= new int[n];
        sucesion[0]=1;
        sucesion[1]=1;
        for (int i = 2; i < sucesion.length; i++) {
            sucesion[i]=sucesion[i-1]+sucesion[i-2];
        }
        for (int i : sucesion) {
            System.out.print(i+", ");
        }
    }
    
}
