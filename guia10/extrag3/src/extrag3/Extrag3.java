/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
3. Implemente un programa para una Librería haciendo uso de un HashSet para evitar
datos repetidos. 
En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos
sus datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y
se le pregunta al usuario si quiere crear otro Libro o no.


 */
package extrag3;

import extrag3.entidad.Libro;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author castr
 */
public class Extrag3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Libro l = new Libro();
        HashSet<Libro> librito = new HashSet();
        String op = "";

        int val;
        do {
            System.out.println("Ingrese el titulo del libro");
            String titulo = leer.next();
            l.setTitulo(titulo);
            System.out.println("Ingrese el nombre del autor");
            String autor = leer.next();
            l.setAutor(autor);
            System.out.println("Ingrese el numero de ejemplares");
            int ejemplares = leer.nextInt();
            l.setEjemplares(ejemplares);
            System.out.println("Ingrese el numero de ejemplares prestados");
            int prestadosEj = leer.nextInt();
            l.setPrestados(prestadosEj);
            librito.add(new Libro(titulo, autor, ejemplares, prestadosEj));
            System.out.println("¿Quiere crear otro libro? (si/no)");
            op = leer.next();

        } while (!op.equalsIgnoreCase("no"));
        do {

            System.out.println("Ingrese una opcion");
            System.out.println("1. Mostar los datos de los libros");
            System.out.println("2. Prestar");
            System.out.println("3. Devolver");
            System.out.println("salir");
            val = leer.nextInt();
            switch (val) {
                case 1:
                    librito.forEach((nos) -> System.out.println(nos));
                    break;
                case 2:
                    if (l.prestamo(librito)) {
                       System.out.println("Libro prestado"); 
                    }else{
                        System.out.println("No hay ejemplares disponibles para prestar");
                    }
                    
                    break;
                case 3:
                    if (l.devolucion(librito) ) {
                        System.out.println("Libro devuelto");
                    }else{
                        System.out.println("No hay ejemplares prestados");
                    }
                    
                    break;
                case 4:
                    break;
            }
        } while (val != 4);

    }

}
