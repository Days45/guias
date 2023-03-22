/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 Crea una aplicación que a través de una función nos convierta una
cantidad de euros introducida por teclado a otra moneda, estas pueden
ser a dólares, yenes o libras. La función tendrá como parámetros, la
cantidad de euros y la moneda a convertir que será una cadena, este no
devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
i. * 0.86 libras es un 1 €
ii. * 1.28611 $ es un 1 €
iii. * 129.852 yenes es un 1 €

 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author castr
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Euros a convertir");
        float euros=leer.nextFloat();
        System.out.println("Ingrese la moneda");
        System.out.println("Libras, Dolares o Yenes ");
        String moneda=leer.next();
        conversor( euros, moneda);
        
    }
    public static void conversor(float euros, String moneda) {
        moneda=moneda.toLowerCase();
      switch(moneda){
          case "libras":  System.out.println("Su monto ingresado en Euros equivale a " +euros*0.86+" Libras" );
              break;
          case "dolares": System.out.println("Su monto ingresado en Euros equivale a " +euros*1.28611+" $" );
              break;
          case "yenes": System.out.println("Su monto ingresado en Euros equivale a " +euros*129.852+" yenes" );
              break;
          default:
              break;
      }  
    }
}
