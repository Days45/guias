/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author castr
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int[][] matriz = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};
        int[][] At = new int[3][3];
        int[][] A = new int[3][3];
        System.out.println("--------------------");
        System.out.println("Matriz original");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("--------------------");

        //A es antisimetrica si solo si At=-A
        //At=trampuesta de A
        Atrampuesta(matriz, At);
        Anegada(matriz, A);
        if (Arrays.deepEquals(At, A)) {
            System.out.println("es antisimetrica");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("[" + -matriz[i][j] + "]");
                }
                System.out.println("");
            }
        } else {
            System.out.println("no es antisimetrica ");
        }
    }

    public static void Atrampuesta(int[][] matriz, int[][] At) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                At[j][i] = matriz[i][j];
            }
        }
    }

    public static void Anegada(int[][] matriz, int[][] A) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = -matriz[i][j];
            }
        }
    }
}
