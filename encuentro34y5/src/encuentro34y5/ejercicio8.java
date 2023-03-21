/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *

 */
package encuentro34y5;

import java.util.Scanner;

/**
 *
 * @author castr
 */
public class ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int largo;
        System.out.println("Ingrese el largo del cuadrado");
        largo=leer.nextInt();
        for (int i = 0; i < largo; i++) { //ira desde 0 hasta el tres
            for (int j = 0; j < largo; j++) {//""
                if (i==0 || i==(largo-1)|| j==0 || j==(largo-1)) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
             System.out.println('\n');
 
        }
        
    }
    
}
