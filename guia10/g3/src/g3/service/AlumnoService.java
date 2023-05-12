/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide 
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le 
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno: 
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota 
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro 
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este 
promedio final, devuelto por el método y mostrado en el main.
 */
package g3.service;

import g3.entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author castr
 */
public class AlumnoService {

    private Scanner leer;
    private ArrayList<Alumno> c;
    private ArrayList<Integer> notas;

    public AlumnoService() {
        this.leer = new Scanner(System.in);
        this.c = new ArrayList();
        this.notas = new ArrayList();
    }

    public void crearAlumno() {
        String respuesta = "";
        do {
            System.out.println("Ingrese nombre:");
            String nombre = leer.next();
            System.out.println("nota1: ");
            int nota1 = leer.nextInt();
            notas.add(nota1);
            System.out.println("nota2: ");
            int nota2 = leer.nextInt();
            notas.add(nota2);
            System.out.println("nota3: ");
            int nota3 = leer.nextInt();
            notas.add(nota3);
            System.out.println("desea agregar otro alumno?");
            respuesta = leer.next();
            c.add(new Alumno(nombre, notas));
        } while (respuesta.equalsIgnoreCase("si"));

    }

    public void buscarAlumno() {
        System.out.println("¿Que alumno desea buscar?");
        String nombre = leer.next();
        for (Alumno aux : c) {
            if (aux.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(notaFinal(aux));
            }
        }
    }

    public Double notaFinal(Alumno aux) {
        double promedio;
        int suma = 0;
        for (int i = 0; i < aux.getNotas().size(); i++) {
            suma += aux.getNotas().get(i);
        }
        promedio = (double)suma / aux.getNotas().size();
        return promedio;
    }

}
