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
    private HashSet<String> paises;

    public PaisServicios() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.paises = new HashSet();

    }

    public Pais cargarPais() {
        String Respuesta = " ";
        String pais;
        do {
            System.out.println("Pais:");
            pais = leer.next();
            paises.add(pais);
            System.out.println("Desea seguir?");
            Respuesta = leer.next();
            
        } while (Respuesta.equalsIgnoreCase("si"));
        
        return new Pais(pais);

    }
        public void mostrar(){
         for (String Pais: paises) {
             System.out.println(Pais.toString());
        }
    }


    public void ordenarAlfabeticamente() {
        ArrayList<String> paiS = new ArrayList(paises);
        Collections.sort(paiS);
        for (String nacione : paiS) {
            System.out.println(nacione.toString());
        }

    }

    public void eliminarPais() {
        System.out.println("que pais quiere eliminar?");
        String rta = leer.next();
        Iterator<String> intr = paises.iterator();
        boolean bandera = false;
        while (intr.hasNext()) {
            if (rta.equalsIgnoreCase(intr.next())) {
                intr.remove();
                bandera = true;
                
            }
        }
        if (bandera) {
            System.out.println("no se encontro");
             ordenarAlfabeticamente();
        }
        else{
            System.out.println("no se encontro el pais");
        }
    }

}
/****/
