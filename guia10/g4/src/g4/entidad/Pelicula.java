/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
 */
package g4.entidad;

import java.util.Comparator;

/**
 *
 * @author castr
 */
public class Pelicula {
    private String titulo;
    private String director;
    private Integer horas;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Integer horas) {
        this.titulo = titulo;
        this.director = director;
        this.horas = horas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", horas=" + horas + '}';
    }
    public static Comparator<Pelicula> porHora = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p2.getHoras().compareTo(p1.getHoras());
        }
    };
    public static Comparator<Pelicula> CoporHora = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getHoras().compareTo(p2.getHoras());
        }
    };
    
}
