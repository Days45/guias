/*
 PersonalServicio (Clase hija de Empleado)

Atributos adicionales:
seccion (string)
 */
package Entidades;

/**
 *
 * @author castr
 */
public class PersonalServicio extends Empleado{
    protected  String seccion;

    public PersonalServicio() {
    }

    public PersonalServicio(String seccion, Integer incorporacion, Integer despacho, String nombre, String Apellido, Integer id, String civil) {
        super(incorporacion, despacho, nombre, Apellido, id, civil);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return super.toString()+ ", seccion = " + seccion;
    }
    
}
