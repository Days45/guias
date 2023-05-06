/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4.servicios;

import g4.entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author castr
 */
public class PeliculaServicio {
    private Scanner leer = new Scanner(System.in);
    private ArrayList<Pelicula> peli = new ArrayList();
/**En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.**/
    public void crearPelicula() {
        String respuesta="";
        do {
            System.out.println("Titulo:");
            String titulo=leer.next();
            System.out.println("Director:");
            String director=leer.next();
            System.out.println("Horas:");
            int tiempoDuracion= leer.nextInt();
            peli.add(new Pelicula(titulo, director, tiempoDuracion));
            System.out.println("Quiere crear otra pelicula?");
            respuesta=leer.next();
        } while (!respuesta.equalsIgnoreCase("no"));
        
    }
/**Después de ese bucle realizaremos las siguientes acciones:
 * 
 * Mostrar en pantalla todas las películas.
**/
    public void mostrar(){
        for (Pelicula aux : peli) {
            System.out.println(aux.toString());
        }
    }
   // Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    public void mostrarPeliculasM(){
        System.out.println("Listado de pelis mayores de una hora");
        for (Pelicula aux : peli) {
            if (aux.getHoras()>1) {
                System.out.println(aux);
            }
        }
    }
    //Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.
    public void ordenarDes() {
        peli.sort(Pelicula.porHora);
        System.out.println("Pelis Ordenadas Desendentemente");
        mostrar();
    }
    //Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo enpantalla.
    public void ordenarAs(){
        peli.sort(Pelicula.CoporHora);
        System.out.println("Pelis Ordenadas Ascendentemente");
        mostrar();
    }
    //Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
    public void ordenarTitulo(){
        ArrayList<String> movi = new ArrayList<>();
        for (Pelicula aux : peli) {
            movi.add(aux.getTitulo());
        }
        Collections.sort(movi);
        System.out.println("Peliculas Ordenadas por titulo");
        for (String axi : movi) {
            System.out.println(axi);
        }
    }
    //Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
    public void ordenarDirector(){
         ArrayList<String> dire = new ArrayList<>();
        for (Pelicula aux : peli) {
            dire.add(aux.getDirector());
        }
        Collections.sort(dire);
        System.out.println("Peliculas Ordenadas por titulo");
        for (String axi : dire) {
            System.out.println(axi);
        }  
    }
}
