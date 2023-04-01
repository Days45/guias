/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores jugar un juego de adivinanza de números.
El primer jugador elige un número y el segundo jugador intenta adivinarlo.
El segundo jugador tiene un número limitado de intentos y recibe una pista de "más alto" o "más bajo" después de cada intento.
El juego termina cuando el segundo jugador adivina el número o se queda sin intentos. 
Registra el número de intentos necesarios para adivinar el número y el número de veces que cada jugador ha ganado.
 */
package entidad;

import java.util.Scanner;



/**
 *
 * @author castr
 */
public class Juego {
    private int intentos;
    private int ingreso;
    private int numAdivinar;

    public Juego() {
    }

    public Juego(int intentos, int ingreso, int numAdivinar) {
        this.intentos = intentos;
        this.ingreso = ingreso;
        this.numAdivinar = numAdivinar;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }
    public void iniciar_juego(){
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese los intentos");
        intentos=leer.nextInt();
        System.out.println("-----------------------------------------");
        System.out.println("Ingrese el numero a adivinar");
        this.numAdivinar=leer.nextInt();
        System.out.println("-----------------------------------------");
        do {        
            
            System.out.println("Ingrese un numero");
            this.ingreso=leer.nextInt();
            
            if (ingreso>numAdivinar) {
                System.out.println("-----------------------------------------");
                System.out.println("Mas bajo!!!!!!!!");
                System.out.println("-----------------------------------------");
            }else if (ingreso<numAdivinar) {
                System.out.println("-----------------------------------------");
                System.out.println("Mas alto!!!!!!!!");
                System.out.println("-----------------------------------------");
            }
            intentos=intentos-1;
            System.out.println("Te quedan "+intentos+" intentos");
            System.out.println("-----------------------------------------");
        } while (numAdivinar!=ingreso && intentos>0);
        if (numAdivinar==ingreso) {
            System.out.println("-----------------------------------------");
            System.out.println("Adivinaste :D");
        }else{
            System.out.println("-----------------------------------------");
            System.out.println("Fallaste!! :'(");
        }
        
    }

    
}
