/*
Clase Camping (subclase de Alojamiento):

Atributos adicionales:
capacidad_maxima_carpas (int): la capacidad máxima de carpas del camping.
cantidad_banos (int): la cantidad de baños disponibles en el camping.
tiene_restaurante (bool): indica si el camping tiene restaurante.

 */
package Entidades;

/**
 *
 * @author castr
 */
public class Camping extends Alojamiento{
    protected Integer max_carpas;
    protected Integer cant_banos;
    protected boolean tiene_resto;

    public Camping() {
    }

    public Camping(Integer max_carpas, Integer cant_banos, boolean tiene_resto, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.max_carpas = max_carpas;
        this.cant_banos = cant_banos;
        this.tiene_resto = tiene_resto;
    }

    public Integer getMax_carpas() {
        return max_carpas;
    }

    public void setMax_carpas(Integer max_carpas) {
        this.max_carpas = max_carpas;
    }

    public Integer getCant_banos() {
        return cant_banos;
    }

    public void setCant_banos(Integer cant_banos) {
        this.cant_banos = cant_banos;
    }

    public boolean isTiene_resto() {
        return tiene_resto;
    }

    public void setTiene_resto(boolean tiene_resto) {
        this.tiene_resto = tiene_resto;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCapacidad Máxima Carpas: " + max_carpas + "\nCantidad Baños: " + cant_banos + "\nTiene Restaurante: " + tiene_resto;
    }

}
