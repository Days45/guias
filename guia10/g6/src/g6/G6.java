/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package g6;

import g6.servicios.TiendaServicios;
import java.util.Scanner;

/**
 *
 * @author castr
 */
public class G6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        TiendaServicios ts = new TiendaServicios();
        ts.agregarProducto();
        String r = "no";
        int op;
        do {
            System.out.println("Ingrese una opcion");
            System.out.println("1. Modificar precio ");
            System.out.println("2. Eliminar Producto ");
            System.out.println("3. Mostrar ");
            System.out.println("4. Salir");
            op = leer.nextInt();

            switch (op) {

                case 1:
                    System.out.println("--------------------");
                    ts.modificarPrecioProducto();
                    System.out.println("--------------------");
                    break;
                case 2:
                    System.out.println("--------------------");
                    ts.eliminarProducto();
                    System.out.println("--------------------");
                    break;
                case 3:
                    System.out.println("--------------------");
                    ts.mostrar();
                    System.out.println("--------------------");
                    break;
                case 4:
                    System.out.println("--------------------");
                    System.out.println("quiere salir? (si/no)");
                    r = leer.next();
                    break;
            }

        } while ("no".equals(r));
        
        
        
        
    }
    
}
