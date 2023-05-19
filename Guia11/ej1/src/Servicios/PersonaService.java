/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import entidad.Perro;
import entidad.Persona;
import java.util.ArrayList;

import java.util.Scanner;

/**
 *
 * @author castr
 */
public class PersonaService {
    private Scanner leer;
    
    public PersonaService() {
        this.leer = new Scanner(System.in);

    }

    public void crearPersona(ArrayList<Persona> listaH) {
        String rp = "";
        do {
            Persona p = new Persona();
            System.out.println("Ingrese el nombre de la persona");
            String nombre = leer.next();
            System.out.println("Ingrese el apellido ");
            String apellido = leer.next();
            System.out.println("Ingrese el dni");
            int Dni = (leer.nextInt());
            System.out.println("Ingrese la edad");
            int Edad = (leer.nextInt());
            listaH.add(new Persona(nombre, apellido, Edad, Dni));
            System.out.println("¿quiere agregar mas personas?(si/no)");
            rp = leer.next();
        } while (!rp.equalsIgnoreCase("no"));
    }

    public void crearPerro(ArrayList<Perro>listP) {
        String rp = "";
        do {
            System.out.println("Ingrese el nombre del perro");
            String nombre = leer.next();
            System.out.println("Ingrese la raza");
            String raza = leer.next();
            System.out.println("Ingrese el tamaño");
            int tama = (leer.nextInt());
            System.out.println("Ingrese la edad");
            int edad = (leer.nextInt());
            listP.add(new Perro(nombre, raza, edad, tama));
            System.out.println("¿quiere agregar mas perros?(si/no)");
            rp = leer.next();
        } while (!rp.equalsIgnoreCase("no"));

    }

}
