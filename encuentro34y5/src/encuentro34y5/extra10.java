/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Realice un programa para que el usuario adivine el resultado de una multiplicación entre dos números 
generados aleatoriamente entre 0 y 10.
El programa debe indicar al usuario si su respuesta es o no correcta. En caso que la respuesta sea incorrecta
se debe permitir al usuario ingresar su respuesta nuevamente.
Para realizar este ejercicio investigue como utilizar la función Math.random() de Java.
 */
package encuentro34y5;

import java.util.Scanner;

/**
 *
 * @author castr
 */
public class extra10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num1, num2, producto, numUsuario;
        num1=(int)(Math.random()*11);
        num2=(int)(Math.random()*11);
        producto= num1*num2;
        //prueba
         System.out.println("resultado para prueba: "+producto);
         
        System.out.println("Adivine el resultado de un producto entre dos numeros generados entre 0 y 10");
        numUsuario= leer.nextInt();
        while (producto!=numUsuario) {            
            System.out.println("No acertaste al numero, vuelvea intentar");
            numUsuario= leer.nextInt();
        }
        System.out.println("Adivinaste el resultado!!!!");
        System.out.println(num1+" * "+num2+" = " +numUsuario);
    }
    
}
