/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import entidad.Jugador;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author castr
 */
public class JuegoService {
    private Scanner leer;

    public JuegoService() {
        this.leer=new Scanner(System.in);
    }
    
    public void CantidadJugadores(ArrayList<Jugador>g){
        System.out.println("¿cuantos jugadores habra? (1-6)");
        int respuesta=leer.nextInt();
        int cont=0;
        String nombre;
        do {          
            cont+=1;
            g.add(new Jugador(cont));
        } while ((respuesta>=1 && respuesta<=6)&& (cont!= respuesta)) ;
    }
    
}
