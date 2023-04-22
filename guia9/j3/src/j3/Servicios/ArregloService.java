/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:

 */
package j3.Servicios;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author castr
 */
public class ArregloService {
  //Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
    public void incializarA(Double[] A){
        for (int i = 0; i < A.length; i++) {
            A[i]=Math.round((Math.random()*10+1) * 100.0) / 100.0;
        }
    }
//    Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
    public void mostrar(Double[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.print("["+vector[i]+"]");
        }
    }
//    Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
    public void ordenar(Double[] vector){
         Arrays.sort(vector, Collections.reverseOrder());
        for (int i = vector.length; i >=0 ; i--) {
           
        }
        
    }
//Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B.
//Luego llenar las últimas 10 posiciones del arreglo B con 0.5
    public void inicializarB(Double[] A, Double[] B){
        Double aux;
        for (int i = 0; i < 20; i++) {
            aux=A[i];
            if (i<=9) {
                B[i]=aux;
            }else if(i>=10){
                B[i]=(0.5);
            }
        }
    }
    
}
