/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Escriba un programa que lea números enteros. 
Si el número es múltiplo de cinco debe detener la lectura y mostrar la cantidad de números leídos,
la cantidad de números pares y la cantidad de números impares.
Al igual que en el ejercicio anterior los números negativos no deben sumarse. 
Nota: recordar el uso de la sentencia break.
 */
package encuentro34y5;

import java.util.Scanner;

/**
 *
 * @author castr
 */
public class extra8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num, pares=0, impares=0, cont=0;
        System.out.println("ingrese un numero");
        num=leer.nextInt();
        while (num%5!=0) {            
            if (num>0) {
                if (num%2==0) {
                    pares++;
                }else{
                    impares++;
                }
            }
            System.out.println("ingrese un numero");
            num=leer.nextInt();
        }
         System.out.println("Total de numeros ingresados = " +(pares+impares));
          System.out.println("Total de numeros pares = " +pares);
          System.out.println("Total de numeros impares = " +impares);
    }
    
}
