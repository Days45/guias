/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
. Crear una clase llamada Alumno que mantenga información sobre las notas de distintos 
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer 
con sus 3 notas. 
 */
package g3.entidad;

import java.util.ArrayList;

/**
 *
 * @author castr
 */
public class Alumno {
    private String nombre;
    ArrayList<Integer> notas ;

    public Alumno() {
    }

    public Alumno(String nombre, ArrayList<Integer> notas) {
       this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }
    
    
    
}
