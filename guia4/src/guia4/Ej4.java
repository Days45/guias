/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author castr
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num=leer.nextInt();
        boolean retorno=primo( num);
        System.out.println(retorno);
    }
    public static boolean primo(int num) {
        int cont=0;
        for (int i = 1; i <= num; i++) {
            if (num % i ==0) {
                cont++;
            }
            if (cont>2) {
                break;
            }
 
        }
        return cont<=2;
    }
}
