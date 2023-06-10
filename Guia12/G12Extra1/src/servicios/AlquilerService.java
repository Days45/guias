/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import Entidades.Alquiler;
import Entidades.Barco;
import Entidades.BarcoMotor;
import Entidades.Velero;
import Entidades.Yate;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author castr
 */
public class AlquilerService {

    private Scanner leer;
    private ArrayList<Barco> barcos;
    private ArrayList<Barco> barcosAlquilados;

    public AlquilerService() {
        this.leer = new Scanner(System.in);
        this.barcos = new ArrayList();
        this.barcosAlquilados = new ArrayList<>();
    }

    public ArrayList<Barco> crearBArco() {
        Barco b1 = new Barco("matricula1", 10.0, 2001);
        Barco b2 = new Barco("matricula2", 20.0, 1982);
        Barco b3 = new Barco("matricula3", 30.0, 2020);
        Velero v1 = new Velero("matricula4", 10.0, 2003, 2);
        Velero v2 = new Velero("matricula5", 20.0, 2020, 3);
        Yate y1 = new Yate("matricula6", 10.0, 2006, 100, 2);
        Yate y2 = new Yate("matricula7", 20.0, 2000, 200, 3);
        BarcoMotor bm1 = new BarcoMotor("matricula8", 10.0, 1999, 100);
        BarcoMotor bm2 = new BarcoMotor("matricula9", 20.0, 2022, 200);
        barcos.add(b1);
        barcos.add(b2);
        barcos.add(b3);
        barcos.add(v1);
        barcos.add(v2);
        barcos.add(y1);
        barcos.add(y2);
        barcos.add(bm1);
        barcos.add(bm2);
        return barcos;
    }



    public Alquiler crearAlquiler(ArrayList<Barco> barcos) {
        Scanner leer = new Scanner(System.in);

        System.out.println("nombre: ");
        String nombre = leer.next();
        System.out.println("documento: ");
        int dni = leer.nextInt();
        System.out.println("fecha de alquiler:(año/mes/dias)");
        LocalDate fechaAlquiler = LocalDate.of(leer.nextInt(), leer.nextInt(), leer.nextInt());
        System.out.println("fecha devolucion:(año/mes/dias) ");
        LocalDate fechaDev = LocalDate.of(leer.nextInt(), leer.nextInt(), leer.nextInt());
        System.out.println("posicion: ");
        int amarre = leer.nextInt();
        Barco barquito = null;
        boolean encontrado = false;
        while (!encontrado) {
            System.out.println("Ingrese la matrícula del barco que desea alquilar:");
            String matricula = leer.next();

            for (Barco barco : barcos) {
                if (barco.getMatricula().equals(matricula)) {
                    barquito = barco;
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("No se encontró ningún barco con la matrícula " + matricula + ".");
            }
        }

        Alquiler alquiler = new Alquiler(nombre, dni, fechaAlquiler, fechaDev, amarre, barquito);
        System.out.println("El precio final del alquiler es: " + alquiler.calcularAlquiler());
        return alquiler;
    }

    public void mostrar(ArrayList<Barco> barcos) {
        System.out.println("Barcos Disponibles");
        for (Barco b : barcos) {
            if (b instanceof Velero) {
                System.out.println("Velero: {" + b.toString() + "}");
            } else if (b instanceof Yate) {
                System.out.println("Yate: {" + b.toString() + "}");
            } else if (b instanceof BarcoMotor) {
                System.out.println("Barco a motor: {" + b.toString() + "}");
            } else {
                System.out.println("Barco: {" + b.toString() + "}");
            }
        }
    }

    public void mostrarAlquiler() {
        System.out.println("");

    }

}
