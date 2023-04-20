/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del
1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
idénticas. Crear un programa que permita introducir un cuadrado por
teclado y determine si este cuadrado es mágico o no. El programa
deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author castr
 */
public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        //para que sea matriz magica tiene que ser igual la suma de todos sus lados 
        //entonces la suma de cada columna y cada fila me tiene que dar el mismo valor
        //y la duma de la diagonal principal y secundaria tambien lo mismo que las filas y columnas
        System.out.println("Ingrese el tamaño de la matriz cuadrada");
        int n = leer.nextInt();
        int matriz[][] = new int[n][n];
        int num;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                do {
                    System.out.println("Ingrese un numero en el rango 1-9");
                    num = leer.nextInt();
                } while (num <1  || num > 9);
                matriz[i][j] = num;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" [" + matriz[i][j] + "] ");

            }
            System.out.println("");
        }
        int columnas=0, filas=0, diagonalS=0,diagonalP=0;
        for (int i = 0; i < n; i++) {
            columnas=0;
            filas=0;
            for (int j = 0; j < n; j++) {
                filas = filas + matriz[i][j];
                columnas = columnas + matriz[j][i];
                if (i == j) {
                    diagonalP += matriz[i][j];
                }
                if ((i + j) == (n - 1)) {
                    diagonalS += matriz[i][j];
                }
            }
            System.out.println(" La suma de la fila "+i+": "+filas+"   La suma de la columna "+i+ ": "+columnas);
        }
        System.out.println("suma diagonal principal :" +diagonalP+" y la suma  diagonal secundaria : "+diagonalS );
        if ((diagonalP==filas) && (diagonalP==columnas) && (diagonalP==diagonalS)) {
            System.out.println("Es matriz magica");
        }else{
            System.out.println("No es matriz magica");
        }
        
    }

}
