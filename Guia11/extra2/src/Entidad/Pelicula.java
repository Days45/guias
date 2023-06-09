/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Luego, de las películas nos interesa saber
el título, duración, edad mínima y director. 
 */
package Entidad;

/**
 *
 * @author castr
 */
public class Pelicula {
    private String titulo;
    private double duracion;
    private Integer edadM;
    private String director;

    public Pelicula() {
    }

    public Pelicula(String titulo, double duracion, Integer edadM, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadM = edadM;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public int getEdadM() {
        return edadM;
    }

    public void setEdadM(Integer edadM) {
        this.edadM = edadM;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo= " + titulo + ", duracion= " + duracion + ", edadM= " + edadM + ", director= " + director + '}';
    }
    
}
