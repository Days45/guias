/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos que asisten a las clases.
Nosotros nos encargaremos de almacenar esta información en un arreglo e iterar con un bucle, solicitando 
en cada repetición que se ingrese el nombre de cada alumno.
Método crearCurso(): el método crear curso, le pide los valores de los atributos al usuario y después se le 
asignan a sus respectivos atributos para llenar el objeto Curso. En este método invocamos al método cargarAlumnos() 
para asignarle valor al atributo alumnos
Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en una semana por curso. 
Para ello, se deben multiplicar la cantidad de horas por día, el precio por hora, la cantidad de alumnos y la cantidad
de días a la semana que se repite el encuentro.

 */
package j6.Servicios;

import j6.Entidades.Curso;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author castr
 */
public class CursoService {
    Scanner leer= new Scanner(System.in);
    
    public String[] cargarAlumnos(int longitud){
      String[] alumno = new String[longitud] ;  
        for (int i = 0; i < alumno.length; i++) {
            System.out.println("Nombre Alumno:");
            alumno[i]=leer.next();
            
        }
        return alumno;
        
    }
    public Curso crearCurso() {
        Curso c = new Curso();
        System.out.println("nombre del curso:");
        c.setNombreCurso(leer.next());
        System.out.println("horas cursadas por dia: ");
        c.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("cantidad de dias por semanas: ");
        c.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("turno: ");
        c.setTurno(leer.next());
        System.out.println("valor por hora:");
        c.setPrecioPorHora(leer.nextDouble());
        c.setAlumnos(cargarAlumnos(c.getAlumnos().length));
        return c;

    } 
    public void mostrarAlumnos(Curso c1){
        System.out.println(Arrays.toString(c1.getAlumnos()));
    }
   
    public void calcularGananciaSemanal(Curso c1){
        double d=c1.getCantidadDiasPorSemana()*c1.getCantidadHorasPorDia()*c1.getPrecioPorHora()*c1.getAlumnos().length;
        System.out.println("La ganancia semanal es de "+ d);
    }
}
