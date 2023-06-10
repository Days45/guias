/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Alojamiento;
import Entidades.Camping;
import Entidades.Hotel;
import Entidades.Hotel4Estrellas;
import Entidades.Hotel5Estrellas;
import Entidades.Residencia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import utilidades.ComparadorHotel;

/**
 *
 * @author castr
 */
public class AlojamientoService {

    private Scanner leer;
    private ArrayList<Alojamiento> vacaciones;

    public AlojamientoService() {
        this.leer = new Scanner(System.in);
        this.vacaciones = new ArrayList<>();
    }

    public ArrayList<Alojamiento> crearAlojamiento(ArrayList<Alojamiento> vacaciones) {

        // Creación de objetos Hotel4Estrellas por "A"=50, comision(55)=50, cantHabitacion=100,
        Hotel4Estrellas h1 = new Hotel4Estrellas("A", "Restaurante1", 55, 100, 200, 10, "Hotel1", "Dirección1", "Localidad1", "Gerente1");
        Hotel4Estrellas h2 = new Hotel4Estrellas("A", "Restaurante2", 50, 150, 250, 12, "Hotel2", "Dirección2", "Localidad2", "Gerente2");

        // Creación de objetos Hotel5Estrellas
        Hotel5Estrellas h3 = new Hotel5Estrellas(10, 20, 1, "A", "Restaurante3", 50, 100, 200, 10, "Hotelito1", "Dirección1", "Localidad1", "Gerente1");
        Hotel5Estrellas h4 = new Hotel5Estrellas(15, 25, 3, "B", "Restaurante4", 150, 200, 250, 12, "Hotelito2", "Dirección2", "Localidad2", "Gerente2");
        h1.setPrecio_habitacion(h1.calcularPorHabitacion());
        h2.setPrecio_habitacion(h2.calcularPorHabitacion());
        h3.setPrecio_habitacion(h3.calcularPorHabitacion());
        h4.setPrecio_habitacion(h4.calcularPorHabitacion());
        // Creación de objetos Camping
        Camping c1 = new Camping(50, 10, true, "Camping1", "Dirección1", "Localidad1", "Gerente1");
        Camping c2 = new Camping(30, 60, false, "Camping2", "Dirección2", "Localidad2", "Gerente2");

        // Creación de objetos Residencia
        Residencia r1 = new Residencia(40, true, true, "Residencia1", "Dirección7", "Localidad7", "Gerente7");
        Residencia r2 = new Residencia(60, false, false, "Residencia2", "Dirección8", "Localidad8", "Gerente8");
        vacaciones.add(h1);
        vacaciones.add(h2);
        vacaciones.add(h3);
        vacaciones.add(h4);
        vacaciones.add(c1);
        vacaciones.add(c2);
        vacaciones.add(r1);
        vacaciones.add(r2);

        return vacaciones;

    }

    public void mostrarAlojamiento(ArrayList<Alojamiento> vacaciones) {
        String res = "no";
        do {
            System.out.println("1.todos los alojamientos. ");
            System.out.println("2.todos los hoteles de más caro a más barato. ");
            System.out.println("3.todos los campings con restaurante ");
            System.out.println("4.todos las residencias que tienen descuento. ");
            System.out.println("5. salir");
            int op = leer.nextInt();
            switch (op) {
                case 1:
                    todo(vacaciones);
                    break;
                case 2:
                    /*aqui error*/
                    ordenarHoteles(vacaciones);

                    break;
                case 3:
                    for (Alojamiento v : vacaciones) {
                        if (v instanceof Camping) {
                            Camping camping = (Camping) v;
                            if (camping.isTiene_resto()) {
                                System.out.println(camping);
                            }
                        }
                    }
                    break;
                case 4:
                    for (Alojamiento v : vacaciones) {
                        if (v instanceof Residencia) {
                            Residencia ore = (Residencia) v;
                            if (ore.isDescuento_g()) {
                                System.out.println(ore);
                            }

                        }
                    }
                    break;
                case 5:
                    System.out.println("¿Desea Salir?(si/no)");
                    res = leer.next();
                    break;
            }
        } while (res.equalsIgnoreCase("no"));
    }

    public void ordenarHoteles(ArrayList<Alojamiento> vacaciones) {
        ComparadorHotel comparador = new ComparadorHotel();
        Collections.sort(vacaciones, comparador);

        for (Alojamiento alojamiento : vacaciones) {
            if (alojamiento instanceof Hotel4Estrellas || alojamiento instanceof Hotel5Estrellas) {
                System.out.println(alojamiento.toString());
            }
        }
    }


public void todo(ArrayList<Alojamiento> vacaciones) {
        for (Alojamiento i : vacaciones) {
            System.out.println(i.toString());
        }
    }

}
