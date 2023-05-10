/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g6.servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author castr
 */
public class TiendaServicios {
    private Scanner leer;
    private HashMap<String,Integer>tienda;

    public TiendaServicios() {
        this.leer=new Scanner(System.in);
        this.tienda=new HashMap();
    }
    
    public void agregarProducto(){
        String r="";
        do {            
            System.out.println("Ingrese un producto: ");
            String llave=leer.next();
            System.out.println("INgrese el precio del producto anterior: ");
            int precio=leer.nextInt();
            tienda.put(llave, precio);
            System.out.println("desea salir? (si/no)");
            r=leer.next();
        } while (r.equalsIgnoreCase("no"));
    }
    public void modificarPrecioProducto(){
        System.out.println("¿Que producto desea modificar?");
        String modificarPrecio=leer.next();
        boolean bandera= false;
        for (Map.Entry<String, Integer> entry : tienda.entrySet()) {
            if (entry.getKey().equals(modificarPrecio)) {
                bandera=true;
                System.out.println("Ingrese un nuevo precio: ");
                int valorNuevo=leer.nextInt();
                entry.setValue(valorNuevo);
            }   
        }
        if (!bandera) {
            System.out.println("no existe ese producto");
        }
    }
    public void eliminarProducto(){
         System.out.println("¿Que producto quiere eliminar?");
         String erase = leer.next();
          boolean bandera= false;
         for (String aux : tienda.keySet()) {
             
             if (aux.equals(erase)) {
                 bandera=true;
                 this.tienda.remove(aux);
             }
        }
         if (!bandera) {
            System.out.println("no existe ese producto");
        }
         
    }
    public void mostrar(){
        for (Map.Entry<String, Integer> entry : tienda.entrySet()) {
            System.out.println("Producto: "+entry.getKey());
            System.out.println("Precio: "+entry.getValue());
        }
    }
}
