/*
Clase Residencia (subclase de Alojamiento):

Atributos adicionales:
cantidad_habitaciones (int): la cantidad de habitaciones de la residencia.
descuentos_gremios (bool): indica si se hacen descuentos a los gremios en la residencia.
tiene_campo_deportivo (bool): indica si la residencia tiene campo deportivo.

 */
package Entidades;

/**
 *
 * @author castr
 */
public class Residencia extends Alojamiento{
    protected Integer cant_habit;
    protected boolean descuento_g;
    protected boolean campo_deport;

    public Residencia() {
    }

    public Residencia(Integer cant_habit, boolean descuento_g, boolean campo_deport, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cant_habit = cant_habit;
        this.descuento_g = descuento_g;
        this.campo_deport = campo_deport;
    }

    public Integer getCant_habit() {
        return cant_habit;
    }

    public void setCant_habit(Integer cant_habit) {
        this.cant_habit = cant_habit;
    }

    public boolean isDescuento_g() {
        return descuento_g;
    }

    public void setDescuento_g(boolean descuento_g) {
        this.descuento_g = descuento_g;
    }

    public boolean isCampo_deport() {
        return campo_deport;
    }

    public void setCampo_deport(boolean campo_deport) {
        this.campo_deport = campo_deport;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCantidad Habitaciones: " + cant_habit + "\nDescuentos: " + descuento_g + "\nCampo Deportivo: " + campo_deport;
    }

}
