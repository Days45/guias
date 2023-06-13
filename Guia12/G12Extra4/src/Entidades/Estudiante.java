/*
 Estudiante (Clase hija de Persona)

Atributos adicionales:
curso (string)
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author castr
 */
public class Estudiante extends Persona {

    protected ArrayList<String> curso;

    public Estudiante() {

    }

    public Estudiante(ArrayList<String> curso, String nombre, String Apellido, Integer id, String civil) {
        super(nombre, Apellido, id, civil);
        this.curso = curso;
    }

    public Estudiante(String nombre, String Apellido, Integer id, String civil) {
        super(nombre, Apellido, id, civil);
        curso = new ArrayList<>();
    }

    public Estudiante(ArrayList<String> curso) {
        this.curso = curso;
    }

    public ArrayList<String> getCurso() {
        return curso;
    }

    public void setCurso(ArrayList<String> curso) {
        this.curso = curso;
    }
    public void agregarCurso(String curso) {
        this.curso.add(curso);
    }

    public boolean estaMatriculadoEnCurso(String curso) {
        return this.curso.contains(curso);
    }
    @Override
    public String toString() {
        return super.toString()+ ", curso = " + curso ;
    }

}
