/*
Clase Hotel (subclase de Alojamiento):

Atributos adicionales:
cantidad_habitaciones (int): la cantidad de habitaciones del hotel.
numero_camas (int): el número total de camas del hotel.
cantidad_pisos (int): la cantidad de pisos del hotel.
 */
package Entidades;

/**
 *
 * @author castr
 */
public class Hotel extends Alojamiento{
    protected int cant_habitaciones;
    protected int num_camas;
    protected int cant_pisos;

    public Hotel() {
    }

    
    
    public Hotel(int cant_habitaciones, int num_camas, int cant_pisos, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cant_habitaciones = cant_habitaciones;
        this.num_camas = num_camas;
        this.cant_pisos = cant_pisos;
    }
    
    public Hotel(int cant_habitaciones, int num_camas, int cant_pisos) {
        this.cant_habitaciones = cant_habitaciones;
        this.num_camas = num_camas;
        this.cant_pisos = cant_pisos;
    }

    public int getCant_habitaciones() {
        return cant_habitaciones;
    }

    public void setCant_habitaciones(int cant_habitaciones) {
        this.cant_habitaciones = cant_habitaciones;
    }

    public int getNum_camas() {
        return num_camas;
    }

    public void setNum_camas(int num_camas) {
        this.num_camas = num_camas;
    }

    public int getCant_pisos() {
        return cant_pisos;
    }

    public void setCant_pisos(int cant_pisos) {
        this.cant_pisos = cant_pisos;
    }

    @Override
    public String toString() {
        return super.toString()+ "\n cantidad de habitaciones= "+cant_habitaciones+"\n número de camas= "+num_camas+"\ncantidad de pisos= "+cant_pisos; 
    }
    
    
}
