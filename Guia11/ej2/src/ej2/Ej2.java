/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2;

import Servicios.JuegoService;
import entidad.Juego;
import entidad.Jugador;
import entidad.Revolver;
import java.util.ArrayList;

/**
 *
 * @author castr
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Jugador> g = new ArrayList();
        JuegoService js = new JuegoService();
        js.CantidadJugadores(g);
        Revolver r = new Revolver();
        r.llenarRevolver();
        Juego j = new Juego();
        j.llenarJuego(g, r);
        j.ronda();
    }

}
