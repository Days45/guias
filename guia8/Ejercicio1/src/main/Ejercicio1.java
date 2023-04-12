/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
import main.entidad.CuentaBancaria;
import main.servicios.CuentaBancariaServicio;

/**
 *
 * @author castr
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CuentaBancariaServicio servi = new CuentaBancariaServicio();
        CuentaBancaria cuenta=servi.crearCuenta();
        Scanner leer=new Scanner(System.in);
        int operacion;
        String confirma = "no";
               do {
            System.out.println("Seleccione alguna opcion: " + "\n" + "1.Ingresar deposito" + "\n" + "2.retirar" + "\n" +
                    "3.Extraccion rapida" + "\n" + "4.consultar saldo" + "\n" + "5.Datos cuenta"+ "\n" + "6. Salir");
            operacion=leer.nextInt();
            switch (operacion) {
                case 1:
                    servi.ingresar(cuenta);
                    break;
                case 2:
                    servi.retirar(cuenta);
                    break;
                case 3:
                   servi.extraccionRapida(cuenta);
                    break;
                case 4:
                    servi.consutarSaldo(cuenta);
                    break;
                case 5:
                    System.out.println(servi.concultarDatos(cuenta));
                    break;
                case 6:
                    System.out.println("¿Esta seguro que quiere salir? (si/no)");
                    confirma=leer.next();
                    break;
            }
        } while ("no".equals(confirma));
    }
    
}
