/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de
cada cantante y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
cambios.

 */
package extrag2;

import extrag2.entidad.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author castr
 */
public class Extrag2 {

    /**
     * @param args the command line arguments
     */
    CantanteFamoso cf = new CantanteFamoso();

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<CantanteFamoso> lista = new ArrayList();
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            crearCantante(lista);
        }

        System.out.println("Lista: ");
        forean(lista);
        int op;
        String opcion = "no";
        do {
            System.out.println("Seleccione: ");
            System.out.println("1. Agregar cantante");
            System.out.println("2. Mostrar cantantes");
            System.out.println("3. Eliminar cantante");
            System.out.println("4. Salir");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    crearCantante(lista);
                    break;
                case 2:
                    listac(lista);
                    break;
                case 3:
                    eliminar(lista);
                    break;
                case 4:
                    System.out.println("Desea salir? (si/no)");
                    opcion = leer.next();
                    break;
            }
        } while (opcion.equalsIgnoreCase("no"));

    }

    public static void crearCantante(ArrayList lista) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cantante: ");
        String nombre = leer.next();
        System.out.println("Disco mas vendido:");
        String disco = leer.next();
        lista.add(new CantanteFamoso(nombre, disco));
    }

    public static void forean(ArrayList lista) {
        lista.forEach((lugar) -> System.out.println(lugar));
    }

    public static void listac(ArrayList<CantanteFamoso> lista) {
        for (CantanteFamoso i : lista) {
            System.out.print(i.getNombre());
            
        }
        System.out.println("");
    }

    public static void eliminar(ArrayList lista) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre a eliminar: ");
        String nombreAux = leer.next();
        Iterator<CantanteFamoso> it = lista.iterator();
        while (it.hasNext()) {
            if (it.next().getNombre().equalsIgnoreCase(nombreAux)) {
                it.remove();
            }

        }
    }

}
