/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 Crear clase CafeteraServicio en el paquete Servicios con los siguiente:

 */
package main.servicios;

import java.util.Scanner;
import main.entidad.Cafetera;

/**
 *
 * @author castr
 */
public class CafeteraServicio {
    Scanner leer=new Scanner(System.in);
    //Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
    public void llenarCafetera(Cafetera machine){
        machine.setCantidadActual(machine.getCapacidadMaxima());
        System.out.println("Cafetera llena");
    }
//Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y simula 
//la acción de servir la taza con la capacidad indicada. Si la cantidad actual de café “no alcanza” para llenar la taza, 
//e sirve lo que quede. El método le informará al usuario si se llenó o no la taza, y de no haberse llenado
//en cuanto quedó la taza.
    public void servirTaza(Cafetera machine){
        System.out.println("Ingrese Tamaño Taza:");
        int tama=leer.nextInt();
        if (machine.getCantidadActual()<tama) {
            System.out.println("La cantidad de cafe no es suficiente, se sirvio"+machine.getCantidadActual());
            machine.setCantidadActual(0);
        }else{
            System.out.println("Preparando cafe");
            machine.setCantidadActual(machine.getCantidadActual()-tama);
        }
        
    }
    //Método vaciarCafetera(): pone la cantidad de café actual en cero. 
    public void vaciarCafetera(Cafetera machine){
        System.out.println("Cafetera vacia");
        machine.setCantidadActual(0);
    }
//Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera
//la cantidad de café indicada.
    public void agregarCafe(Cafetera machine){
        System.out.println("Ingrese una cantidad de cafe, recuerde que el maximo es "+machine.getCapacidadMaxima());
        int cafe =leer.nextInt();
        machine.setCantidadActual(machine.getCantidadActual()+cafe);
    }
    
}
