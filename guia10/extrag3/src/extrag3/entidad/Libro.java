/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Para ello, se debe crear una clase llamada Libro que guarde la
información de cada uno de los libros de una Biblioteca. La clase Libro debe guardar
el título del libro, autor, número de ejemplares y número de ejemplares prestados.
También se creará en el main un HashSet de tipo Libro que guardará todos los libros
creados.
 */
package extrag3.entidad;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author castr
 */
public class Libro {

    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;
    //La clase Librería contendrá además los siguientes métodos:
    //• Constructor por defecto.
    public Libro() {
    }
    //• Constructor con parámetros.
    public Libro(String titulo, String autor, int ejemplares, int prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }
    //• Métodos Setters/getters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getPrestados() {
        return prestados;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }
        /**
     * •Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo busca en el conjunto. 
     * Si está en el conjunto, se llama con ese objeto Libro al método. El método se incrementa de a uno, como un carrito 
     * de compras, el atributo ejemplares prestados, del libro que ingresó el usuario. 
     * Esto sucederá cada vez que se realice un préstamo del libro. No se podrán prestar libros de los que no 
     * queden ejemplares disponibles para prestar. 
     * Devuelve true si se ha podido realizar la operación y false en caso contrario.*
     */
    public boolean prestamo(HashSet<Libro> librito){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el titulo del libro que quiere prestar");
        String prestar=leer.next();
        for (Libro libro : librito) {
            if (prestar.equalsIgnoreCase(titulo)) {
                if (prestados<ejemplares) {
                    prestados++;
                    return true;
                }
            }
        }
        
        return false;
    }
    /**
     * • Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se lo busca en el conjunto.
     * Si está en el conjunto, se llama con ese objeto al método. 
     * El método decrementa de a uno, como un carrito de compras, el atributo ejemplares prestados, del libro seleccionado por el usuario. 
     * Esto sucederá cada vez que se produzca la devolución de un libro. 
     * No se podrán devolver libros donde que no tengan ejemplares prestados. 
     * Devuelve true si se ha podido realizar la operación y false en caso contrario.*
     */
    public boolean devolucion(HashSet<Libro> librito){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el titulo del libro que quiere devolver");
        String devolver=leer.next();
        for (Libro i : librito) {
            if (devolver.equalsIgnoreCase(titulo)) {
                if (prestados>0) {
                    prestados--;
                    return true;
                }
            }
        }
        
        return false;
    }
    //• Método toString para mostrar los datos de los libros.

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", ejemplares=" + ejemplares + ", prestados=" + prestados + '}';
    }
    
}
