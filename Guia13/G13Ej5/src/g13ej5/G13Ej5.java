/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g13ej5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author castr
 */
public class G13Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Random random = new Random();
        int numeroAdivinar = random.nextInt(500) + 1; // Generar número aleatorio entre 1 y 500
        int intentos = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("Intenta adivinar el número entre 1 y 500.");
        System.out.println("num: "+numeroAdivinar);
       while (true) {
            System.out.print("Ingrese un número: ");
            String entrada = scanner.nextLine();
            
            try {
                int numeroUsuario = Integer.parseInt(entrada);
                intentos++;
                
                if (numeroUsuario < 1 || numeroUsuario > 500) {
                    System.out.println("Error: Ingrese un número dentro del rango válido (entre 1 y 500).");
                } else if (numeroUsuario == numeroAdivinar) {
                    System.out.println("¡Felicitaciones! ¡Has adivinado el número!");
                    System.out.println("Número de intentos: " + intentos);
                    break;
                } else if (numeroUsuario < numeroAdivinar) {
                    System.out.println("El número a adivinar es mayor.");
                } else {
                    System.out.println("El número a adivinar es menor.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número válido.");
                intentos++;
            }
        }
        
        scanner.close();
    }
        
        
 }
    

