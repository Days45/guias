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

    public void iniciar_juego() {
        Scanner leer = new Scanner(System.in);
        int aci1 = 0, aci2 = 0, ronda = 2, nAci1 = 0, nAci2 = 0, sum1 = 0, sum2 = 0;

        do {
            //si es par el jugador 2 tiene que adivinar
            if (ronda % 2 == 0) {
                System.out.println("Ingrese los intentos del jugador 2");
                intentos = leer.nextInt();
                System.out.println("Ingrese el numero que tiene que adivinar el jugador 2");
                this.numAdivinar = leer.nextInt();
            } else { //si impar le toca al jugador 1 adivinar
                System.out.println("Ingrese los intentos del jugador 1");
                intentos = leer.nextInt();

                System.out.println("Ingrese el numero que tiene que adivinar el jugador 1");
                this.numAdivinar = leer.nextInt();
            }
            //
            while (numAdivinar != ingreso && intentos > 0) {
                System.out.println("Ingrese un numero");
                this.ingreso = leer.nextInt();
                //pista
                if (ingreso > numAdivinar) {
                    System.out.println("Mas bajo!!!!!!!!");
                } else if (ingreso < numAdivinar) {
                    System.out.println("Mas alto!!!!!!!!");
                }
                //resto intentos
                intentos = intentos - 1;
                //muestro los intentos
                System.out.println("Te quedan " + intentos + " intentos");
                //cuentos los aciertos y no aciertos
                if (ingreso == numAdivinar && ronda % 2 == 0) {
                    aci1 += 1;
                } else if (ingreso == numAdivinar && ronda % 2 != 0) {
                    aci2 += 1;
                } else if (ingreso != numAdivinar && ronda % 2 != 0) {
                    nAci2 += 1;
                } else if (ingreso != numAdivinar && ronda % 2 == 0) {
                    nAci1 += 1;
                }
                //los sumo
                sum1 = aci1 + nAci1;
                sum2 = aci2 + nAci2;
            }
            
            if (numAdivinar == ingreso) {
                System.out.println("Adivino perro :v");
            } else {
                System.out.println("No adivino :(");
            }
            //muestro la cantidad dde intentos que necesito el jugador hasta acertar 
            if (ingreso == numAdivinar && ronda % 2 == 0) {
                System.out.println("Cantidad de intentos necesarios que tuvo hasta adivinar");
                System.out.println("Jugador 2: " + sum1);
            } else if (ingreso == numAdivinar && ronda % 2 != 0) {
                System.out.println("Cantidad de intentos necesarios que tuvo hasta adivinar");
                System.out.println("Jugador 1: " + sum2);
            }
            //resto la ronda
            ronda = ronda - 1;

        } while (ronda > 0);
        System.out.println("El puntaje de veces ganadas por cada jugador es:");
        System.out.println("Jugador 1: " + aci2);
        System.out.println("Jugador 2: " + aci1);



    }

}
