/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4;

import g4.servicios.PeliculaServicio;
import java.util.Scanner;

/**
 *
 * @author castr
 */
public class G4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PeliculaServicio ps = new PeliculaServicio();
        Scanner leer = new Scanner(System.in);
        String r= "no";
        int op;
        ps.crearPelicula();
        do {            
            System.out.println("Ingrese una opcion");
            System.out.println("1. mostrar todo");
            System.out.println("2. mostrar peliculas que superen 1 hora");
            System.out.println("3. ordenar y mostrar la lista de mayor a menor");
            System.out.println("4. ordenar y mostrar la lista de menor a mayor");
            System.out.println("5. ordenar y mostrar la lista por titulo");
            System.out.println("6. ordenar y mostrar la lista por director");
            System.out.println("7. Salir");
            op=leer.nextInt();
            
            switch (op) {
                
                case 1:System.out.println("--------------------");
                    ps.mostrar();
                    System.out.println("--------------------");
                    break;
                case 2: System.out.println("--------------------");
                    ps.mostrarPeliculasM();
                    System.out.println("--------------------");
                    break;
                case 3:System.out.println("--------------------");
                    ps.ordenarDes();
                    System.out.println("--------------------");
                    break;
                case 4:System.out.println("--------------------");
                    ps.ordenarAs();
                    System.out.println("--------------------");
                    break;
                case 5:System.out.println("--------------------");
                    ps.ordenarTitulo();
                    System.out.println("--------------------");
                    break;
                case 6:System.out.println("--------------------");
                    ps.ordenarDirector();
                    System.out.println("--------------------");
                    break;
                case 7:
                    System.out.println("quiere salir? (si/no)");
                    r = leer.next();
                    break;
            }

        } while ("no".equals(r));
        
        
       
        
        
        
        
    }

}
