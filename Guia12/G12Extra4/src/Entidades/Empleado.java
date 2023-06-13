/*

Empleado (Clase hija de Persona)

Atributos adicionales:
ano_incorporacion (int)
numero_despacho (int)
 */
package Entidades;

/**
 *
 * @author castr
 */
public class Empleado extends Persona {
    protected Integer incorporacion;
    protected Integer despacho;

    public Empleado() {
    }

    public Empleado(Integer incorporacion, Integer despacho, String nombre, String Apellido, Integer id, String civil) {
        super(nombre, Apellido, id, civil);
        this.incorporacion = incorporacion;
        this.despacho = despacho;
    }

    public Integer getIncorporacion() {
        return incorporacion;
    }

    public void setIncorporacion(Integer incorporacion) {
        this.incorporacion = incorporacion;
    }

    public Integer getDespacho() {
        return despacho;
    }

    public void setDespacho(Integer despacho) {
        this.despacho = despacho;
    }

    @Override
    public String toString() {
        return super.toString()+", incorporacion=" + incorporacion + ", despacho=" + despacho;
    }
    
    
}
