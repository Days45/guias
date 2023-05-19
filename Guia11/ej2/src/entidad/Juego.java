/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.

10
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package entidad;

import java.util.ArrayList;



/**
 *
 * @author castr
 */
public class Juego {
    private ArrayList<Jugador>g =new ArrayList();
    private Revolver r;
    public void llenarJuego(ArrayList<Jugador>g, Revolver r){
        this.g=g;
        this.r=r;
    }
    public void ronda(){
        boolean banderita=false;
        System.out.println("Posicion del Agua: "+r.getPosicionAgua() );
        
        while (!banderita) {            
            for (Jugador o : g) {
                if (o.disparo(r)) {
                    banderita=true;
                    System.out.println(o.toString());
                    System.out.println("   Posicion actual: "+r.getPosicionActual());
                    break;
                }
 
            }
        }
          
        
    }
}
