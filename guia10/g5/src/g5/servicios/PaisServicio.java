/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g5.servicios;

import g5.entidad.Pais;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author castr
 */
public class PaisServicio {

    private Scanner leer;
    private TreeSet<Pais> paises;

    public PaisServicio() {
        this.leer = new Scanner(System.in);
        this.paises = new TreeSet<>();
    }

    public void cargarPais() {
        String respuesta = "";
        do {
            System.out.println("Ingrese un pais");
            paises.add(new Pais(leer.next()));
            System.out.println("¿Quiere guardar otro pais? (no/si)");
            respuesta = leer.next();
        } while (!respuesta.equalsIgnoreCase("no"));
        paises.forEach((lugar) -> System.out.println(lugar));
    }

    public void ordenarAs() {
        TreeSet<Pais> intsReverse = (TreeSet<Pais>) paises.descendingSet(); //manera inversa
        System.out.println("en que orden quiere hacerlo Ascendente o Descendente. (A/D)");
        String letra = leer.next();
        if (letra.equalsIgnoreCase("a")) {
            System.out.println("Ascendente: ");
            for (Pais paise : paises) {
                System.out.print("["+paise+"]");
            }
        }else{
            System.out.println("Descendente: ");
            for (Pais aux : intsReverse) {
                System.out.print("["+aux+"]");
            }
        }
    }

    public void eliminarPais() {
        boolean bandera = false;
        Iterator<Pais> iterar = paises.iterator();
        System.out.println("¿Que pais desea buscar?");
        String buscar = leer.next();
        while (iterar.hasNext()) {
            if (iterar.next().getPais().equals(buscar)) {
                iterar.remove();
                bandera = true;
                ordenarAs();
            }
        }

        if (!bandera) {
            System.out.println("No se encuentra el pais " + buscar + " ingresado");

        }

    }

}
