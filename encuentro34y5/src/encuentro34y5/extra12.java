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
public class extra12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        String A, B, C;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                     A=Integer.toString(i); //convierte un numero en un string
                     B=Integer.toString(j);// en estos casos convierte a string i,j,k 
                     C=Integer.toString(k);// y se lo asigna a una variable tipo string
                    if (i==3) {
                        A="E";
                    }
                    if (j==3) {
                        B="E";
                    }
                     if (k==3) {
                        C="E";
                    }
                     System.out.println(A+"-"+B+"-"+C);
                }
            }
        }
    }
    
}
