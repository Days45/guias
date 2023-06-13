/*
 Persona (Clase padre)

Atributos:
nombre (string)
apellidos (string)
identificacion (int)
estado_civil (string)
 */
package Entidades;

/**
 *
 * @author castr
 */
public class Persona {
    protected String nombre;
    protected String Apellido;
    protected Integer id;
    protected String civil;

    public Persona() {
    }

    public Persona(String nombre, String Apellido, Integer id, String civil) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.id = id;
        this.civil = civil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCivil() {
        return civil;
    }

    public void setCivil(String civil) {
        this.civil = civil;
    }

    @Override
    public String toString() {
        return "nombre= " + nombre + ", Apellido= " + Apellido + ", id= " + id + ", civil= " + civil;
    }
    
    
}
