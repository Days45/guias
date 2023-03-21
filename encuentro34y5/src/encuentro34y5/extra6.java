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
public class extra6 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int n, estaturaM=0, estaturaNM=0;
        System.out.println("Ingrese la cantidad de personas");
        n=leer.nextInt();
        double   sumaNM=0, sumaM=0, SumaAlturas=0, PromedioGeneral=0, PromedioMenor=0;
     
      
        for(int i=0;i<n;i++){
            System.out.println("Ingrese la altura de la persona " +(i+1));
            double altura=leer.nextDouble();
            if(altura<1.60){
                sumaM+=altura;
                estaturaM++;
                
            }else{
                sumaNM+=altura;
                estaturaNM++;
            }
        SumaAlturas=sumaM+sumaNM;
        PromedioGeneral=SumaAlturas/n;
        PromedioMenor=sumaM/estaturaM;
        }
        
        System.out.println("El promedio de estaturas que se encuentran por debajo de 1.60 mts es: "+Math.round(PromedioMenor*100.0)/100.0);
        System.out.println("El promedio de estaturas en general es: "+Math.round(PromedioGeneral*100.0)/100.0);
        
        
        
    }
}
