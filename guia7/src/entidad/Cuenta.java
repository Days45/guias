/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad de dinero del saldo de la cuenta.
Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.

 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author castr
 */
public class Cuenta {
    private float saldo;
    private String titular;

    public Cuenta() {
    }

    public Cuenta(float saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public void retirar_dinero(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del titular");
        this.titular=leer.next();
        System.out.println("Ingrese el saldo de la cuenta");
        this.saldo=leer.nextFloat();
        System.out.println("ingrese el dinero a retirar");
        float retiro=leer.nextFloat();
        if (saldo>=retiro) {
            saldo=saldo-retiro;
            System.out.println("Titular de la cuenta: "+titular);
            System.out.println("Saldo actual: " +saldo);
        }else{
            System.out.println("Titular de la cuenta: "+titular);
            System.out.println("Retiro: "+retiro);
            System.out.println("Saldo de la cuenta: "+saldo);
            System.out.println("El saldo es insuficiente para el retiro");
        }
    }
    
}
