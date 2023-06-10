/*
Clase Hotel4Estrellas (subclase de Hotel):

Atributos adicionales:
gimnasio (string): indica si el hotel tiene gimnasio.
nombre_restaurante (string): el nombre del restaurante del hotel.
capacidad_restaurante (int): la capacidad del restaurante del hotel.
precio_habitaciones (float): el precio de las habitaciones del hotel.
 */
package Entidades;

/**
 *
 * @author castro
 */
public class Hotel4Estrellas extends Hotel  {

    protected String gimnacio;
    protected String name_restaurante;
    protected Integer capacidad;
    protected double precio_habitacion;

    public Hotel4Estrellas() {
    }

    public Hotel4Estrellas(String gimnacio, String name_restaurante, Integer capacidad, int cant_habitaciones, int num_camas, int cant_pisos, String nombre, String direccion, String localidad, String gerente) {
        super(cant_habitaciones, num_camas, cant_pisos, nombre, direccion, localidad, gerente);
        this.gimnacio = gimnacio;
        this.name_restaurante = name_restaurante;
        this.capacidad = capacidad;
/*31*/  
    }

    public Hotel4Estrellas(String gimnacio, String name_restaurante, Integer capacidad, double precio_habitacion, int cant_habitaciones, int num_camas, int cant_pisos, String nombre, String direccion, String localidad, String gerente) {
        super(cant_habitaciones, num_camas, cant_pisos, nombre, direccion, localidad, gerente);
        this.gimnacio = gimnacio;
        this.name_restaurante = name_restaurante;
        this.capacidad = capacidad;
        this.precio_habitacion = precio_habitacion;
    }

    public String getGimnacio() {
        return gimnacio;
    }

    public void setGimnacio(String gimnacio) {
        this.gimnacio = gimnacio;
    }

    public String getName_restaurante() {
        return name_restaurante;
    }

    public void setName_restaurante(String name_restaurante) {
        this.name_restaurante = name_restaurante;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public double getPrecio_habitacion() {
        return precio_habitacion;
    }

    public void setPrecio_habitacion(double precio_habitacion) {
        this.precio_habitacion = precio_habitacion;
    }

    public double calcularPorHabitacion() {
    double valorAgregadoGimnasio = 0;

    if (gimnacio.equals("A")) {
        valorAgregadoGimnasio = 50;
    } else if (gimnacio.equals("B")) {
        valorAgregadoGimnasio = 30;
    } else {
        valorAgregadoGimnasio = 0;
    }
    double valorAgregadoRestaurante = 0;

    if (capacidad < 30) {
        valorAgregadoRestaurante = 10;
    } else if (capacidad >= 30 && capacidad <= 50) {
        valorAgregadoRestaurante = 30;
    } else if (capacidad > 50) {
        valorAgregadoRestaurante = 50;
    }

    return 50 + (1 * getCant_habitaciones()) + valorAgregadoRestaurante + valorAgregadoGimnasio;
}

    // Clase Hotel4Estrellas
    @Override
    public String toString() {
        String tipo = (this instanceof Hotel5Estrellas) ? "Hotel 5 Estrellas" : "Hotel 4 Estrellas";
        return tipo + super.toString() + "\nGimnasio: " + gimnacio + "\nNombre Restaurante: " + name_restaurante + "\nCapacidad Restaurante: " + capacidad + "\nPrecio Habitación: " + precio_habitacion;
    }

}
