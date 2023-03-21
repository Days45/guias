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
public class extra1 {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int minutos;
        System.out.println("Ingrese la cantidad de minutos");
        minutos=leer.nextInt();
       int horas, dias;
       dias= minutos/1440;
       horas=(minutos/60)-(dias*24);
       System.out.println(minutos+" minutos equivalen a "+dias+" Dias y "+horas+" horas");
       
    }
    
}
