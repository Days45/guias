/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio de n números (n>0).
El valor de n se solicitará al principio del programa y los números serán introducidos por el usuario.
Realice dos versiones del programa, una usando el bucle “while” y otra con el bucle “do - while”.
 */
package encuentro34y5;

import java.util.Scanner;

/**
 *
 * @author castr
 */
public class extra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        int max=0, min=0, num=0, n, cont, suma;
        double promedio;
        cont=0;
        suma=0;
        System.out.println("Ingrese la cantidad de numeros");
        n=leer.nextInt();
        while (cont!=n) {            
            System.out.println("Ingrese un numero");
            num=leer.nextInt();
            if (num>=0) {
                if (cont==0) {
                  max=num;
                   min=num;
                 }
                if (num>max) {
                   max=num;
                } else if (num<min) {
                   min=num;
                }
                  suma=suma+num;
                  cont++;
                }
        }
        promedio= suma/n;
        System.out.println("El maximo ingresado es: "+max);
        System.out.println("El minimo ingresado es: "+min);
        System.out.println("promedio de los numeros ingresados : "+Math.round(( (double)suma/n)*100.0 )/100.0 );


        
    }
    
}
