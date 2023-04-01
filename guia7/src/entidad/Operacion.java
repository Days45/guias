/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. 
A continuación, se deben crear los siguientes métodos:
Método constructor con todos los atributos pasados por parámetro.
Método constructor sin los atributos pasados por parámetro.
Métodos get y set.
Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
Método sumar(): calcular la suma de los números y devolver el resultado al main.
Método restar(): calcular la resta de los números y devolver el resultado al main
Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero,
el método devuelve 0 y se le informa al usuario el error. Si no, se hace la multiplicación y se devuelve el resultado al main
Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero,
el método devuelve 0 y se le informa al usuario el error se le informa al usuario.
Si no, se hace la división y se devuelve el resultado al main.

 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author castr
 */
public class Operacion {
     private int num1;
     private int num2;
//constructor sin parametros
    public Operacion() {
    }
//constructor con parametros
    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
//get y set de num1 y num2   
    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
//metodo crearOperacion()
    public void crearOperacion(){
        Scanner odio = new Scanner(System.in);
        System.out.println("Ingrese dos numeros para empezar con las operciones ");
        num1=odio.nextInt();
        num2=odio.nextInt();
    }
//Metodo sumar
    public int sumar(int num1, int num2){
        int suma=num1+num2;
        return suma;
    }
 //metodo resta
    public int resta(int num1, int num2){
        int resta=num1-num2;
        return resta;
    }
    
 //metodo multiplicacion
    
    public int multiplicacion(int num1, int num2){
        if (num1==0 || num2==0) {
            System.out.println("Error. Multiplicando por cero es cero");
            return 0;
        }else{
            int producto= num1*num2;
            return producto;
        }
    } 
    
 //metodo division
    
    public int division(int num1, int num2){
        if (num1==0 || num2==0) {
            System.out.println("Error .Dividiendo por cero es cero");
            return 0;
        }else{
            int cociente= num1/num2;
            return cociente;
        }
    } 
    
}
