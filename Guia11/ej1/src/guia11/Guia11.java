/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11;

import Servicios.PersonaService;
import entidad.Perro;
import entidad.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author castro
 */
public class Guia11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Aqui esta el 1 normal y el 1 extra unidos
        Scanner leer = new Scanner(System.in);
        PersonaService ps = new PersonaService();
        ArrayList<Persona> PersonasConPerros = new ArrayList();
        ArrayList<Perro> listP = new ArrayList();
        ArrayList<Persona> listaH = new ArrayList();

        Perro perro1 = new Perro("sami", "caniche", 5, 8);
        Perro perro2 = new Perro("afrika", "caniche", 5, 10);
        Perro perro3 = new Perro("osa", "UnOsoXd", 4, 15);
        Perro perro4 = new Perro("kimu", "caniche", 3, 7);

        listP.add(perro4);
        listP.add(perro3);
        listP.add(perro2);
        listP.add(perro1);
        ps.crearPersona(listaH);

        for (Persona aux : listaH) {
            for (Perro i : listP) {
                System.out.println(i.toString());
            }
            boolean informe = false;
            while (!informe) {
                System.out.println(aux.getNombre() + ", ¿que pichicu quiere adoptar?");
                String pichuName = leer.next();

                for (int i = 0; i < listP.size(); i++) {

                    if (pichuName.equalsIgnoreCase(listP.get(i).getNombre())) {
                        aux.setPichicu(listP.get(i));
                        System.out.println(aux.getNombre() + " tenes a " + listP.get(i).getNombre());
                        listP.remove(i);
                        informe = true;
                        PersonasConPerros.add(aux);
                        break;
                    }

                }
            }

            if (!informe) {
                System.out.println("El perro escogido por " + aux.getNombre() + "no existe o ya fue adoptado por otra persona");
            }
        }
        System.out.println("Personas con perros adoptados:");
        for (Persona Perso : PersonasConPerros) {
            System.out.println(Perso.toString());
        }

    }

}
