/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario".
Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un empleado en función de su edad y salario actual. 
El aumento salarial debe ser del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.

 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author castr
 */
public class Empleado {
    private String nombre;
    private int edad;
    private double salario;
    private int empleado;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void calcular_aumento() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de empleados");
        int empleados = leer.nextInt();

        for (int i = 0; i < empleados; i++) {
            System.out.println("Ingrese el nombre del empleado");
            this.nombre = leer.next();
            System.out.println("Ingrese la edad ");
            this.edad = leer.nextInt();
            System.out.println("Ingrese su salario actual");
            this.salario = leer.nextDouble();
            if (edad>30) {
                salario=salario*1.1;
                System.out.println("El aumento salarial del empleado "+nombre+" es de "+(double)(Math.round(salario*100.0)/100.0));
            } else if (edad>0 && edad<30) {
                salario=salario*1.05;
                System.out.println("El aumento salarial del empleado "+nombre+" es de "+(double)(Math.round(salario*100.0)/100.0));
            }
        }
    }

}
