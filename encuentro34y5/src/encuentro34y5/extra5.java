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
public class extra5 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
 
        System.out.println("Socio A");
        System.out.println("Socio B");
        System.out.println("Socio C");
        System.out.println("Seleccione una opcion");
        String letra =leer.nextLine() ;
        letra= letra.toUpperCase();
        double costo, importe;
        System.out.println("Ingrese el costo del tratamineto");
        costo=leer.nextDouble();
         switch(letra){
            case "A":
                importe=costo * (0.50);
                System.out.println("El importe es "+Math.round(importe));
                break;
            case "B":
                importe=costo * (0.65);
                System.out.println("El importe es "+Math.round(importe));
                break;
            case "C":
                importe = costo ;
                System.out.println("El importe es "+importe);
                break;
            default:
                break;
        }
        
       
    }
    
}
