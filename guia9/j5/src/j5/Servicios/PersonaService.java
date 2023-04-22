/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear.
Retornar el objeto Persona creado.
Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la 
edad consultada o false en caso contrario.
Método mostrarPersona que muestra la información de la persona deseada.

 */
package j5.Servicios;

import j5.Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author castr
 */
public class PersonaService {
    Scanner leer =new Scanner(System.in);
    public Persona crearPersona(){
        Persona p =new Persona();
        System.out.println("Ingrese nombre: ");
        p.setNombre(leer.next());
        System.out.println("Ingrese dia de nacimiento :");
        int dia=leer.nextInt();
        System.out.println("Ingrese mes de nacimiento (1/12): ");
        int mes = leer.nextInt()-1;
        System.out.println("Ingrese año de nacimiento: ");
        int anio=leer.nextInt()-1900;
        Date nacimiento=new Date(anio,mes,dia);
        p.setFechaNacimiento(nacimiento);
        return p;
    }
    public int calcularEdad(Persona p1){
        Date fechaActual= new Date();
        return  (fechaActual.getYear()- p1.getFechaNacimiento().getYear());
    }
    public boolean menorQue (Persona p1, int edad){
        int edadPersona= calcularEdad(p1);
        return edadPersona<edad;
    }
    public void mostrarPersona(Persona p1){
        System.out.println("Nombre: "+p1.getNombre());
        System.out.println("Fecha de nacimiento: "+p1.getFechaNacimiento());
    }
}
