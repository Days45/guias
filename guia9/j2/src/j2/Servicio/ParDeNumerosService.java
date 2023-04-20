/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Crear una clase ParDeNumerosService, en el paquete Servicios, que deberá además implementar los siguientes métodos:
 */
package j2.Servicio;

import j2.Entidad.ParDeNumeros;
import java.util.Scanner;

/**
 *
 * @author castr
 */
public class ParDeNumerosService {
    Scanner leer =new Scanner(System.in);
    //Método mostrarValores que muestra cuáles son los dos números guardados.
    public void mostrarValores(ParDeNumeros par){
        System.out.println("Numero 1: "+par.getNum1());
        System.out.println("Numero 2: "+par.getNum2());
    }
    //Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
    public double devolverMayor(ParDeNumeros par){
        return Math.max(par.getNum1(), par.getNum2());
    }
// Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número.
//Previamente se deben redondear ambos valores.
    public double calcularPotencia(ParDeNumeros par){
        double potencia, mayor, menor;
        mayor=Math.max(par.getNum1(),par.getNum2());
        menor=Math.min(par.getNum1(),par.getNum2());
        potencia=Math.pow(Math.round(mayor), Math.round(mayor));
        return potencia;
    }
//  Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. 
//Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.  
    public double calcularRaiz(ParDeNumeros par){
        double menor,  raiz;
        menor=Math.min(par.getNum1(), par.getNum2());
        raiz=Math.sqrt(Math.abs(menor));
        return Math.round(raiz*100.0)/100.0;
    }
}
