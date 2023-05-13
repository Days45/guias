/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5p2.servicios;

import guia5p2.entidad.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author castr
 */
public class PaisServicios {

    private Scanner leer;
    private HashSet<Pais> paises;

    public PaisServicios() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.paises = new HashSet();

    }

    public void cargarPais() {
        String Respuesta = " ";
        String pais;
        do {
            System.out.println("Pais:");
            pais = leer.next();
            paises.add(new Pais(pais));
            System.out.println("Desea seguir?");
            Respuesta = leer.next();

        } while (Respuesta.equalsIgnoreCase("si"));

        paises.forEach((lugar) -> System.out.println(lugar));

    }

    

    public void ordenarAlfabeticamente() {
        ArrayList<Pais>p = new ArrayList(paises);
        ArrayList<String> paiS = new ArrayList();
        for (Pais pais : p) {
            paiS.add(pais.getPais());
        }
        Collections.sort(paiS);
        for (String nacione : paiS) {
            System.out.println(nacione);
        }

    }

    public void eliminarPais() {
        System.out.println("que pais quiere eliminar?");
        String rta = leer.next();
        Iterator<Pais> intr = paises.iterator();
        boolean bandera = false;
        while (intr.hasNext()) {
            if (rta.equalsIgnoreCase(intr.next().getPais())) {
                intr.remove();
                bandera = true;

            }
        }
        if (bandera) {
            System.out.println("se encontro");
            System.out.println("------------------");
            ordenarAlfabeticamente();
        } else {
            System.out.println("no se encontro el pais");
        }
    }

}
/**
 * *
 */
