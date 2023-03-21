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
public class extra2 {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int A=5, B=3, C=2, D=9; 
        int aux;
        System.out.println("Valores iniciales A = "+A+", B = "+B+", C = "+C+", D = "+D);
        //B=C
        aux=B;
        B=C;
        //C=A
        C=A;
        //A=D
        A=D;
        //D=B
        D=aux;
        System.out.println("Valores Finales A = "+A+", B = "+B+", C = "+C+", D = "+D);
    }
    
}
