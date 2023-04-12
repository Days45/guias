/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.servicios;

import java.util.Scanner;
import main.entidad.CuentaBancaria;

/**
 *
 * @author castr
 */
public class CuentaBancariaServicio {

    public Scanner leer = new Scanner(System.in);

    //Método para crear cuenta pidiéndole los datos al usuario.
    public CuentaBancaria crearCuenta() {
        System.out.println("Ingresar Numero de cuenta: ");
        int num = leer.nextInt();
        System.out.println("Ingrese su DNI:");
        long dni = leer.nextLong();
        System.out.println("Ingrese el saldo actual");
        double saldo = leer.nextDouble();
        CuentaBancaria l1=new CuentaBancaria(num, dni, saldo);
        return l1;

    }
    // Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.

    public void ingresar(CuentaBancaria l1) {
        System.out.println("Ingrese un monto");
        double monto = leer.nextDouble();
        l1.setSaldoActual(l1.getSaldoActual() + monto);
    }
//Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual.
//Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.

    public void retirar(CuentaBancaria l1) {
        System.out.println("Ingrese un monto a retirar");
        double monto = leer.nextDouble();
        if (l1.getSaldoActual() < monto) {
            System.out.println("Saldo actual: " + l1.getSaldoActual()
                    + "\n" + "se retirara el total del saldo actual: " + l1.getSaldoActual());
            l1.setSaldoActual(0);

        } else {
            l1.setSaldoActual(l1.getSaldoActual() - monto);
        }
    }
//Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.

    public void extraccionRapida(CuentaBancaria l1) {
        System.out.println("Ingrese un monto");
        l1.setSaldoActual(l1.getSaldoActual() * 0.2);
        System.out.println("Extraccion" + l1.getSaldoActual() * 0.2);

    }
//Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.

    public void consutarSaldo(CuentaBancaria l1) {
        System.out.println("Saldo disponible " + l1.getSaldoActual());
    }
//Método consultarDatos: permitirá mostrar todos los datos de la cuenta.

    public CuentaBancaria concultarDatos(CuentaBancaria l1) {
        return l1;
    }
}
