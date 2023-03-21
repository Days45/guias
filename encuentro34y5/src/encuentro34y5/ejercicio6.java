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
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             Scanner leer = new Scanner(System.in);
             int num1, num2, suma, resta, producto, division;
             System.out.println("Ingrese dos numeros enteros positivos");
             num1= leer.nextInt();
             num2= leer.nextInt();
             int opcion;
             String letra="n";
             
          while(letra.equalsIgnoreCase("n")){
             System.out.println("Seleccione una opcion");
             System.out.println("1. Sumar");
             System.out.println("2. Restar");
             System.out.println("3. Multiplicar");
             System.out.println("4. Dividir");
             System.out.println("5. Salir");
             
             opcion=leer.nextInt();
             if (opcion>0 && opcion<5){
                 switch (opcion){
                 case 1: 
                     suma=num1+num2;
                     System.out.println("La suma entre "+num1+ " + "+num2+" = "+suma);
                     break;
                 case 2:
                     resta=num1-num2;
                     System.out.println("La resta entre "+num1+ " - "+num2+" = "+resta);
                     break;
                 case 3:
                     producto=num1*num2;
                     System.out.println("El producto entre "+num1+ " * "+num2+" = "+producto);
                     break;
                 case 4:
                     division=num1/num2;
                     System.out.println("La division entre "+num1+ " / "+num2+" = "+division);
                     break;
                 } 
               
             }else if (opcion==5) {
                  System.out.println("¿Está seguro de que desea salir? s/n");
                  letra=leer.next();
                  if ("n".equalsIgnoreCase(letra)) {
                      break;
                 }
              }
             
          }
            
             
        }
    
    
}
