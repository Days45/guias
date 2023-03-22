/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Crea una aplicación que le pida dos números al usuario y este pueda
elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
una función para cada operación matemática y deben devolver sus
resultados para imprimirlos en el main.
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author castr
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        int num1, num2, opcion, retorno=0;
        System.out.println("Ingrese dos numeros enteros");
        num1=leer.nextInt();
        num2=leer.nextInt();
        do {            
            System.out.println("eliga para hacer una opercion");
            System.out.println("1. suma");
            System.out.println("2. resta");
            System.out.println("3. producto");
            System.out.println("4. division");
            System.out.println("5. salir");
            opcion=leer.nextInt();
            switch(opcion){
                case 1: retorno= suma( num1,  num2);
                    break;
                case 2:retorno= resta( num1,  num2);
                    break;
                case 3:retorno= producto( num1,  num2);
                    break;
                case 4:retorno= cociente( num1,  num2);
                    break;
            }
        } while (opcion!=5);
        System.out.println("Finalizo el programa");
    }
    public static int suma(int num1, int num2) {
        int suma1=num1+num2;
        System.out.println("La suma es: "+suma1);
        return suma1;
    }
    public static int resta(int num1, int num2) {
        int resta1=num1-num2;
        System.out.println("La resta es: "+resta1);
        return resta1;
    }
    public static int producto(int num1, int num2) {
        int producto1=num1*num2;
        System.out.println("El producto es: "+producto1);
        return producto1;
    }
    public static int cociente(int num1, int num2) {
        int division=num1/num2;
        System.out.println("La division es: "+division);
        return division;
    }
}
