/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Recorrer un vector de N enteros contabilizando cuántos números son de
1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).

 */
package guia5;

import java.util.Scanner;

/**
 *System.out.println("");
 * @author castr
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        int[] vector = new int[n];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 15000)+1;
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.print(" ["+vector[i]+"] ");
        }
        System.out.println(" ");
        String numeroD;
        int a=0,b=0,c=0,d=0,e=0;
        for (int i = 0; i < vector.length; i++) {
            numeroD=String.valueOf(vector[i]);
            switch(numeroD.length()){
                case 1: a=a+1;
                    break;    
                case 2: b=b+1;
                    break;
                case 3: c=c+1;
                    break;  
                case 4: d=d+1;
                    break;
                case 5: e=e+1;
                    break;  
            }

        }
        System.out.println(" ");
        System.out.println("1 digito:"+a+", 2 digitos:"+b+", 3 digitos:"+c+", 4 digitos:"+d+", 5 digitos:"+e);

    }
    
}
