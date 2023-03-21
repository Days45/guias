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
public class extra11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner leer= new Scanner(System.in);
        int numero, contador=0, aux;
        System.out.println("Ingrese un numero");
        numero=leer.nextInt();
        aux=numero;
        while (numero>0) {            
            
            numero=numero/10;
            contador++;
        } 
        System.out.println("La cantidad de digitos de "+aux+" es "+contador);
    }
} 