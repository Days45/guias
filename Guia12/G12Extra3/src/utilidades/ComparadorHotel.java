/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import Entidades.Alojamiento;
import Entidades.Hotel4Estrellas;
import Entidades.Hotel5Estrellas;
import java.util.Comparator;

/**
 *
 * @author castr
 */
public class ComparadorHotel implements Comparator<Alojamiento> {

    @Override
    public int compare(Alojamiento alojamiento1, Alojamiento alojamiento2) {
        if (alojamiento1 instanceof Hotel4Estrellas && alojamiento2 instanceof Hotel4Estrellas) {
            Hotel4Estrellas hotel1 = (Hotel4Estrellas) alojamiento1;
            Hotel4Estrellas hotel2 = (Hotel4Estrellas) alojamiento2;
            return Double.compare(hotel2.getPrecio_habitacion(), hotel1.getPrecio_habitacion());
        } else if (alojamiento1 instanceof Hotel5Estrellas && alojamiento2 instanceof Hotel5Estrellas) {
            Hotel5Estrellas hotel1 = (Hotel5Estrellas) alojamiento1;
            Hotel5Estrellas hotel2 = (Hotel5Estrellas) alojamiento2;
            return Double.compare(hotel2.getPrecio_habitacion(), hotel1.getPrecio_habitacion());
        }
        // Si los alojamientos no son hoteles 4 o 5 estrellas, no se puede comparar por precio de habitación
        return 0;
    }
}
