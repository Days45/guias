/*
Profesor (Clase hija de Empleado)

Atributos adicionales:
departamento (string)
 */
package Entidades;

/**
 *
 * @author castr
 */
public class Profesor extends Empleado{
    protected String departamento;

    public Profesor() {
    }

    public Profesor(String departamento, Integer incorporacion, Integer despacho, String nombre, String Apellido, Integer id, String civil) {
        super(incorporacion, despacho, nombre, Apellido, id, civil);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString()+ ", departamento= " + departamento;
    }
    
}
