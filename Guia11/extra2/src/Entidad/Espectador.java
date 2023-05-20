/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Por último, del espectador, nos interesa saber su
nombre, edad y el dinero que tiene disponible.
 */
package Entidad;

/**
 *
 * @author castr
 */
public class Espectador {
    private String nombre;
    private Integer edad;
    private Double plata;

    public Espectador() {
    }

    public Espectador(String nombre, Integer edad, Double plata) {
        this.nombre = nombre;
        this.edad = edad;
        this.plata = plata;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getPlata() {
        return plata;
    }

    public void setPlata(Double plata) {
        this.plata = plata;
    }

    @Override
    public String toString() {
        return "Espectador{" + "nombre= " + nombre + ", edad= " + edad + ", plata= " + plata + '}';
    }
    
}
