/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor
2) Crea una clase "Estudiante" con las propiedades "nombre", "edad" y "nota media".
Crea un método para calcular la nota media de un grupo de estudiantes y otro para mostrar por pantalla los estudiantes 
que tienen una nota media superior.

 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author castr
 */
public class Estudiante {
    private String nombre;
    private int edad;
    private float notaM;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getNotaM() {
        return notaM;
    }

    public void setNotaM(float notaM) {
        this.notaM = notaM;
    }
    public void calcularNota(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante");
        nombre =leer.next();
        System.out.println("Ingrese la edad");
        edad=leer.nextInt();
       
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
}
