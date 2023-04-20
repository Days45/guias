/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7;

import entidad.Coche;
import java.util.Scanner;

/**
 *
 * @author castr
 */
public class NE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Coche c1 = new Coche();
        System.out.println("Ingrese una marca");
        c1.setMarca(leer.next());
        System.out.println("Ingrese el modelo");
        c1.setModelo(leer.next());
        System.out.println("Ingrese el precio del coche");
        c1.setPrecio(leer.nextInt());
        Coche c2=new Coche("prueba", "modelito", 40000);
        Coche c3=new Coche("prueba2", "modelito2", 40500);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }

}
