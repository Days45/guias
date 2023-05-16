/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extrag4.servicios;

import extrag4.entidad.CodigoPostal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author castr
 */
public class CodigoPostalServicios {

    private HashMap<Integer, String> ciudades;
    private Scanner leer;
    private Scanner cadenas;

    public CodigoPostalServicios() {
        this.ciudades = new HashMap();
        this.leer = new Scanner(System.in);
        this.cadenas = new Scanner(System.in);
    }
    //• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.

    public void ingresoCiudad() {
        CodigoPostal c = new CodigoPostal();
        System.out.println("Ingrese un codigo postal");
        c.setPostal(leer.nextInt());
        System.out.println("Ingrese la ciudad correspondiente");
        c.setNombre(cadenas.nextLine());
        ciudades.put(c.getPostal(), c.getNombre());
    }
//• Muestra por pantalla los datos introducidos

    public void mostrarIntroducidos() {
        for (Map.Entry<Integer, String> entry : ciudades.entrySet()) {
            System.out.println("Postal: " + entry.getKey() + " Ciudad: " + entry.getValue());
        }
    }
//• Pide un código postal y muestra la ciudad asociada si existe sino avisa al usuario.

    public void exitenciaCiudad() {
        
        System.out.println("Ingrese un codigo postal para ver si ya esta ingresada: ");
        int codigo = leer.nextInt();
        boolean bandera = false;
        for (Map.Entry<Integer, String> entry : ciudades.entrySet()) {
            if (entry.getKey().equals(codigo)) {
                bandera = true;
                System.out.println("El codigo ingresado " + codigo + " existe y su ciudad asociada es " + entry.getValue());

            }
        }
        if (!bandera) {
            System.out.println("El codigo ingresado no existe ");
        }

    }
//• Muestra por pantalla los datos
//• Agregar una ciudad con su código postal correspondiente más al HashMap.
//• Elimina 3 ciudades existentes dentro del HashMap

    public void eliminarCiudades() {
        CodigoPostal c = new CodigoPostal();
        boolean bandera = false;
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el codigo de la ciudad que quiere eliminar");
            int erase = leer.nextInt();
            if (ciudades.containsKey(erase)) {
                ciudades.remove(erase);
                System.out.println(" La Ciudad " + c.getNombre() + "se elimino con existo");
                bandera = true;
            }
        }

        if (!bandera) {
            System.out.println("La ciudad ingresada no existe");
        }

    }

}
