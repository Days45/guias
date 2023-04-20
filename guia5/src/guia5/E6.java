/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida que el usuario las va ingresando,
construya una “sopa de letras para niños” de tamaño de 20 x 20 caracteres.
Las palabras se ubicarán todas en orden horizontal en una fila que será seleccionada de manera aleatoria. 
Una vez concluida la ubicación de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9.
Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java substring(), 
Length() y Math.random().


 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author castr
 */
public class E6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //aclaramos matriz y vector
        Scanner leer = new Scanner(System.in);
        char[][] matriz = new char[20][20];
        String[] vector = new String[5];
        boolean[] vector2 = new boolean[20];
        String palabra;
        vacio(matriz);
        llenarV(vector);
        verificacion(vector2);
        cargar(matriz, vector, vector2);
        cambiar(matriz);
        mostrar(matriz);

    }

    public static int verificacion(boolean[] vector2) {
        int posicion;
        posicion = (int) (Math.random() * 20);
        while (vector2[posicion]) {
            posicion = (int) (Math.random() * 20);
        }
        vector2[posicion] = true;
        return posicion;
    }

    public static void cargar(char[][] matriz, String[] vector, boolean[] vector2) {
        String palabra;
        int posicion;
        for (int i = 0; i < 5; i++) {
            posicion = verificacion(vector2);
            palabra = vector[i];
            int rango = (21 - palabra.length());
            int start = (int) (Math.random() * rango);
            int fin = start + palabra.length();
            int A = 0;
            for (int j = start; j < fin; j++) {
                matriz[posicion][j] = palabra.charAt(A);
                A++;
            }
        }
    }

    public static void vacio(char[][] matriz) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                matriz[i][j] = ' ';
            }
        }
    }

    public static void llenarV(String[] vector) {
        Scanner leer = new Scanner(System.in);
        String palabra;
        for (int i = 0; i < 5; i++) {
            do {
                System.out.println("Ingrese palabra");
                palabra = leer.next();
            } while (palabra.length() < 3 || palabra.length() > 5);
            vector[i] = palabra;
        }
    }

    public static void mostrar(char[][] matriz) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(" [" + matriz[i][j] + "] ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void cambiar(char[][] matriz) {
        int n;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (matriz[i][j] == ' ') {
                    n = (int) (Math.random() * 10);
                    matriz[i][j] = (char) (n + '0');
                }

            }
        }
    }
}
