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
public class extra14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        int familia, hijos, edades, totalHijos=0, totalE=0;
        double media;
        System.out.println("Ingrese la cantidad de familias");
        
        familia=leer.nextInt();
        System.out.println("/////////////////////////");
        for (int i = 0; i < familia; i++) {
            System.out.println("Ingrese la cantidad de hijos de la familia "+(i+1));
            
            
            hijos=leer.nextInt();
            System.out.println("////////////////////////");
            totalHijos+=hijos;
            for (int j = 0; j < hijos; j++) {
                System.out.println("Ingrese la edad del hijo "+(j+1));
                
                edades=leer.nextInt();
                System.out.println("////////////////////////");
                totalE+=edades;
            }
        }
        media=Math.round( ( (double)totalE/totalHijos)*100.0 )/100.0 ;
        System.out.println("La edad media de los hijos de todas las familias es = " +media);
        
    }
    
}
