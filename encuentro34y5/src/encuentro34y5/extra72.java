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
public class extra72 {

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
        do {            
             System.out.println("Ingrese un numero");
            num=leer.nextInt();
           
            if (num>0) {
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
            
            
        } while (cont!=n);
         promedio= suma/n;
        System.out.println("El maximo ingresado es: "+max);
        System.out.println("El minimo ingresado es: "+min);
        System.out.println("promedio de los numeros ingresados : "+(Double)promedio);
    }
    
}
