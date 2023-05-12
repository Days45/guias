/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).

 */
package extrag1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author castr
 */
public class Extrag1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer =new Scanner(System.in);
        ArrayList<Integer>lista=new ArrayList();
        int numerito=0, suma=0;
        do {
            System.out.println("Ingrese un numero: ");
            numerito =leer.nextInt() ; 
            if (numerito==(-99)) {
                break;
            } else {
                lista.add(numerito);
            }
            
        } while (numerito!=(-99));
        for (Integer i : lista) {
           suma += i;
        }
        System.out.println("se ingreso "+lista.size()+" valores");
        System.out.println("la suma: "+suma);
        System.out.println("Promedio: "+(suma/lista.size()));
    }
    
}
