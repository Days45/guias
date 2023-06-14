/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g13ej3;

import java.util.Scanner;

/**
 *
 * @author castr
 */
public class G13Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        try {
            System.out.println("Ingrese un número: ");
            String nume1 = leer.next();
            
            System.out.println("Ingrese un segundo número: ");
            String nume2 = leer.next();
            
            int num1 = Integer.parseInt(nume1);
            int num2 = Integer.parseInt(nume2);
            
            if (num2 == 0) {
                throw new ArithmeticException("No se puede dividir entre cero.");
            }
            
            double resultado = (double) num1 / num2;
            System.out.println("El resultado de la división es: " + resultado);
        } catch (NumberFormatException e) {
            System.out.println("Error: Ingrese números enteros válidos.");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        leer.close();
    }
}
    

