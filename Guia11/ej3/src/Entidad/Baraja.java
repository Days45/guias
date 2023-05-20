/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author castr
 */
public class Baraja {

    private ArrayList<Carta> naipe;
    private ArrayList<Carta> descarteNaipe;
    private Scanner leer;

    public Baraja() {
        this.naipe = new ArrayList<>();
        this.descarteNaipe = new ArrayList<>();
        this.leer = new Scanner(System.in);
    }

    public void llenarBaraja() {
        String[] palo = {" espadas", " bastos", " oros", " copas"};
        for (String i : palo) {
            for (int j = 1; j < 13; j++) {
                if (j != 8 && j != 9) {
                    naipe.add(new Carta(j, i));
                }
            }
        }
    }

    //• barajar(): cambia de posición todas las cartas aleatoriamente.
    public void barajar() {
        Collections.shuffle(naipe);
    }
    //• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
    //se haya llegado al final, se indica al usuario que no hay más cartas.

    public void siguienteCarta() {
        if (naipe.size() == 0) {
            System.out.println("No hay más cartas en la baraja.");
        } else {
            Carta carta = naipe.remove(0);
            descarteNaipe.add(carta);
            
        }
    }

    //• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    public void cartasDisponibles() {
        System.out.println("Cartas disponlibles: " + naipe.size());
    }
//    • darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
//cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
//debemos indicárselo al usuario.

    public void darCartas() {
        System.out.println("¿Cuantas cartas quiere? :)");
        int cantidad = leer.nextInt();
        if (naipe.size() < cantidad) {
            System.out.println("No hay suficientes cartas en la baraja");
        } else {
            for (int i = 0; i < cantidad; i++) {
                descarteNaipe.add(naipe.get(i));
                System.out.println(naipe.get(i));
                naipe.remove(i);
            }
        }
    }

//• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
//indicárselo al usuario
    public void cartasMonton() {
        if (descarteNaipe.size() > 0) {
            for (Carta carta : naipe) {
                System.out.println(carta);

            }
        } else {
            System.out.println("No ha salido ninguna carta");
        }
    }
//    • mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
//luego se llama al método, este no mostrara esa primera carta.

    public void mostrarBaraja() {
        for (Carta carta : naipe) {
            System.out.println(carta);
        }
    }
}
