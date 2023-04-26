/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package je2.service;

import java.util.Scanner;
import je2.entidad.Ahorcado;

/**
 *
 * @author castr
 */
public class AhorcadoService {

    Scanner leer = new Scanner(System.in);

    /*1. Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
    Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector. 
    Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la palabra en un índice del vector. 
    Y también, guarda la cantidad de jugadas máximas y el valor que ingresó el usuario.
     */
    public void crearJuego(Ahorcado Ah) {
        System.out.println("Ingrese la palabra a adivinar");
        String palabraAdivinar = leer.next();
        char[] palabra = new char[palabraAdivinar.length()];
        for (int i = 0; i < palabra.length; i++) {
            palabra[i] = palabraAdivinar.charAt(i);
        }
        Ah.setVector(palabra);
        System.out.println("Ingrese los intentos");
        Ah.setJuegos(leer.nextInt());

    }

    /*2.Método longitud(): muestra la longitud de la palabra que se debe encontrar. 
    Nota: buscar como se usa el vector.length. */
    public void longitud(Ahorcado Ah) {
        System.out.println(Ah.getVector().length);
    }

    /*3. Método buscar(letra):  este método recibe una letra dada por el usuario y busca si la letra ingresada es 
    parte de la palabra o no. También informará si la letra estaba o no.*/
    public boolean buscar(char letra, Ahorcado Ah) {
        boolean bandera = false;
        char[] vect = Ah.getVector();
        for (int i = 0; i < Ah.getVector().length; i++) {
            if (vect[i] == letra) {
                vect[i] = letra;
                bandera = true;
                break;
            }
        }
        if (bandera) {
            System.out.println("Mensaje: La letra pertenece a la palabra");
        } else {
            System.out.println("Mensaje: La letra no pertenece a la palabra");
        }
        return bandera;
    }

    /*4.Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre cuantas letras han 
    sido encontradas y cuántas le faltan. Este método además deberá devolver true si la letra estaba y false si
    la letra no estaba, ya que, cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.*/

    public boolean encontradas(char letra, Ahorcado Ah) {
        boolean encontrada = buscar(letra, Ah);
        char[]vect = Ah.getVector();
        if (encontrada) {
            for (int i = 0; i < Ah.getVector().length; i++) {
                if (vect[i]==letra) {
                    Ah.setEncontradas(Ah.getEncontradas() + 1);
                    System.out.println("Letra: "+letra);
                    break;
                }
            }
        } else {
            Ah.setJuegos(Ah.getJuegos()-1);
            System.out.println("Letra: "+letra);
            intentos(Ah);
        }
        int faltantes = Ah.getVector().length - Ah.getEncontradas();
        System.out.println("Número de letras (encontradas, faltantes): (" + Ah.getEncontradas() + ", " + faltantes + ")");
        return encontrada;
    }

    /*5. Método intentos(): para mostrar cuántas oportunidades le queda al jugador.*/
    public void intentos(Ahorcado Ah) {
        System.out.println("Numero de intentos restantes: " + Ah.getJuegos());
    }

    /*6.Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados e informará
    cuando el usuario descubra toda la palabra o se quede sin intentos. Este método se llamará en el main. */
    public void juego() {
        Ahorcado Ah = new Ahorcado();
        crearJuego(Ah);
        do {
            System.out.println("Ingrese una letra");
            char letra = leer.next().charAt(0);
            longitud(Ah);
            encontradas(letra, Ah);
            intentos(Ah);
        } while (Ah.getJuegos() > 0 && Ah.getEncontradas() < Ah.getVector().length);

        if (Ah.getEncontradas() == Ah.getVector().length) {
            System.out.println("Has ganado!");
            for (int i = 0; i < Ah.getVector().length; i++) {
                System.out.print(Ah.getVector()[i]);
            }
        } else {
            System.out.println("Perdiste");
        }
    }
}
