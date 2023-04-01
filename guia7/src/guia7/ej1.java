/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7;

import entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author castr
 */
public class ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer =new Scanner(System.in);
        Libro l1=new Libro();
        l1.cargar();
        l1.mostrar();
    }
    
}
