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
public class E5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner pepita = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de filas");
        int n = pepita.nextInt();
        System.out.println("Ingrese la cantidad de columnas");
        int m = pepita.nextInt();
        int[][] matriz = new int[n][m];
        int suma = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = (int) (Math.random() * 11) + 1;
                suma += matriz[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("[" +matriz[i][j]+"]");
            }
            System.out.println(" ");
        }
        
        System.out.println("La suma de todos sus elementos es: " + suma);
    }

}