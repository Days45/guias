/*
Clase Alojamiento:

Atributos:
nombre (string): el nombre del alojamiento.
direccion (string): la dirección del alojamiento.
localidad (string): la localidad donde se encuentra el alojamiento.
gerente (string): el gerente encargado del alojamiento.
 */
package Entidades;

/**
 *
 * @author castr
 */
public class Alojamiento {
    protected String nombre;
    protected String direccion;
    protected String localidad;
    protected String gerente;

    public Alojamiento() {
    }
    
    public Alojamiento(String nombre, String direccion, String localidad, String gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerente = gerente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    @Override
    public String toString() {
        String tipoAlojamiento = "";
        if (this instanceof Residencia) {
            tipoAlojamiento = "Residencia";
        } else if (this instanceof Camping) {
            tipoAlojamiento = "Camping";
        }

        return tipoAlojamiento + ":\nNombre: " + nombre + "\nDirección: " + direccion + "\nLocalidad: " + localidad + "\nGerente: " + gerente;
    }

}
