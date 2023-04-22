/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Vamos a usar la clase Date que ya existe en Java. Crearemos la clase FechaService, en paquete Servicios, 
que tenga los siguientes métodos:
Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento.
Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar el objeto Date.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor vacío de la clase
Date. Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra 
(edad del usuario).

 */
package j4.Servicios;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author castr
 */
public class FechaService {
    public Date fechaNacimiento(){
        Scanner leer=new Scanner(System.in);
        int anio,mes,dia;
        System.out.println("Ingrese año, mes y dia");
        anio=leer.nextInt()-1900;
        mes=leer.nextInt()-1;
        dia=leer.nextInt();
        return new Date(anio, mes,dia);
    }
    public Date fechaActual(){
        return new Date();
    }
    public int diferencia(Date fechaNacimiento, Date fechaActual){
        int dife= (fechaActual.getYear()- fechaNacimiento.getYear());
        return dife;
    }
}
