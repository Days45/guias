/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author castr
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private int dni;
    private Perro pichicu;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
    }
    
    public Persona(String nombre, String apellido, int edad, int dni, Perro pichicu) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.pichicu = pichicu;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Perro getPichicu() {
        return pichicu;
    }

    public void setPichicu(Perro pichicu) {
        this.pichicu = pichicu;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre= " + nombre + ", apellido= " + apellido + ", edad= " + edad + ", dni= " + dni + ", pichicu= " + pichicu + '}';
    }
    
}
