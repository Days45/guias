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
public class extra13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        int n;
        System.out.println("Ingrese un numero ");
        n=leer.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j =0; j <= i; j++) {
                System.out.print((j+1));
            }
             System.out.println("");
        }
    }
    
}
  