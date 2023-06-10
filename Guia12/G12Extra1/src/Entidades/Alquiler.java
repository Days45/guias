/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


/**
 *
 * @author castr
 */
public class Alquiler {

    private String nombreCliente;
    private int dni;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDev;
    private int amarre;
    private Barco barquito;

    public Alquiler() {

    }

    public Alquiler(String nombreCliente, int dni, LocalDate fechaAlquiler, LocalDate fechaDev, int amarre) {
        this.nombreCliente = nombreCliente;
        this.dni = dni;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDev = fechaDev;
        this.amarre = amarre;
    }

    public Alquiler(String nombreCliente, int dni, LocalDate fechaAlquiler, LocalDate fechaDev, int amarre, Barco barquito) {
        this.nombreCliente = nombreCliente;
        this.dni = dni;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDev = fechaDev;
        this.amarre = amarre;
        this.barquito = barquito;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDev() {
        return fechaDev;
    }

    public void setFechaDev(LocalDate fechaDev) {
        this.fechaDev = fechaDev;
    }

    public int getAmarre() {
        return amarre;
    }

    public void setAmarre(int amarre) {
        this.amarre = amarre;
    }

    public Barco getBarquito() {
        return barquito;
    }

    public void setBarquito(Barco barquito) {
        this.barquito = barquito;
    }

    public int calcularDias() {
        // Calcula la diferencia en días entre las dos fechas
        long difDias = ChronoUnit.DAYS.between(fechaAlquiler, fechaDev);
        // Convierte la diferencia en días a un entero y devuelve el resultado
        return (int) difDias;
    }

    public double calcularAlquiler() {
        int ocupacion = calcularDias();
        double modulo = barquito.calcularModulo();
        return ocupacion * modulo;
    }

    @Override
    public String toString() {
        String tipoBarco; //amo esta cosa siii
        if (barquito instanceof Velero) { //me aseguro de que tipo es cada barquito y le asigno un nombre a la variable.
            tipoBarco = "Velero";
        } else if (barquito instanceof Yate) {
            tipoBarco = "Yate";
        } else if (barquito instanceof BarcoMotor) {
            tipoBarco = "Barco a motor";
        } else {
            tipoBarco = "Barco";
        }

        return "Alquiler{"
                + "nombreCliente='" + nombreCliente + '\''
                + ", dni=" + dni
                + ", fechaAlquiler=" + fechaAlquiler
                + ", fechaDev=" + fechaDev
                + ", amarre=" + amarre
                + ", barquito=" + tipoBarco + ": " + barquito
                + '}';
    }

}
