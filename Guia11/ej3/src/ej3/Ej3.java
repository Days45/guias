/*
 * 
Realizar una baraja de cartas españolas orientada a objetos.  La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:

 */
package ej3;

import Entidad.Baraja;

/**
 *
 * @author castro
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Baraja b = new Baraja();
        b.llenarBaraja();
        b.barajar();
        b.mostrarBaraja();
        
        System.out.println("Después de barajar:");
        //llama al metodo sieguenteCarta 3 veces
        b.siguienteCarta();
        b.siguienteCarta();
        b.siguienteCarta();
        //-
        //cartas disponibles
        b.cartasDisponibles();
        //pedimos al usuario que ingrese cuantas cartas quiere
        b.darCartas();
        Thread.sleep(1000);
        System.out.println("Cartas que salieron");
//        b.cartasMonton();
        Thread.sleep(1000);
        System.out.println("Cartas que quedan en la baraja");
        b.mostrarBaraja();


    }
    
}
