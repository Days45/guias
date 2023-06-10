/*
Clase Hotel5Estrellas (subclase de Hotel):

Atributos adicionales:
gimnasio (string): indica si el hotel tiene gimnasio.
nombre_restaurante (string): el nombre del restaurante del hotel.
capacidad_restaurante (int): la capacidad del restaurante del hotel.
cantidad_salones_conferencia (int): la cantidad de salones de conferencia del hotel.
cantidad_suites (int): la cantidad de suites del hotel.
cantidad_limosinas (int): la cantidad de limosinas disponibles en el hotel.
precio_habitaciones (float): el precio de las habitaciones del hotel.

 */
package Entidades;

/**
 *
 * @author castr
 */
public class Hotel5Estrellas extends Hotel4Estrellas{
    protected Integer cant_salon;
    protected Integer cant_suit;
    protected Integer cant_limosinas;

    public Hotel5Estrellas() {
    }

    public Hotel5Estrellas(Integer cant_salon, Integer cant_suit, Integer cant_limosinas, String gimnacio, String name_restaurante, Integer capacidad, int cant_habitaciones, int num_camas, int cant_pisos, String nombre, String direccion, String localidad, String gerente) {
/*29*/  super(gimnacio, name_restaurante, capacidad, cant_habitaciones, num_camas, cant_pisos, nombre, direccion, localidad, gerente);
        this.cant_salon = cant_salon;
        this.cant_suit = cant_suit;
        this.cant_limosinas = cant_limosinas;
        
    }
    
    public Hotel5Estrellas(Integer cant_salon, Integer cant_suit, Integer cant_limosinas, String gimnacio, String name_restaurante, Integer capacidad, double precio_habitacion, int cant_habitaciones, int num_camas, int cant_pisos, String nombre, String direccion, String localidad, String gerente) {
        super(gimnacio, name_restaurante, capacidad, precio_habitacion, cant_habitaciones, num_camas, cant_pisos, nombre, direccion, localidad, gerente);
        this.cant_salon = cant_salon;
        this.cant_suit = cant_suit;
        this.cant_limosinas = cant_limosinas;
    }

    public Integer getCant_salon() {
        return cant_salon;
    }

    public void setCant_salon(Integer cant_salon) {
        this.cant_salon = cant_salon;
    }

    public Integer getCant_suit() {
        return cant_suit;
    }

    public void setCant_suit(Integer cant_suit) {
        this.cant_suit = cant_suit;
    }

    public Integer getCant_limosinas() {
        return cant_limosinas;
    }

    public void setCant_limosinas(Integer cant_limosinas) {
        this.cant_limosinas = cant_limosinas;
    }

    @Override
    public double calcularPorHabitacion() {
/*69*/   return super.calcularPorHabitacion()+(15 * cant_limosinas);
    }


    @Override
    public String toString() {
        return super.toString() + "\nCantidad Salones: " + cant_salon + "\nCantidad Suites: " + cant_suit + "\nCantidad Limosinas: " + cant_limosinas;
    }
}
