package Servicios;

import Entidades.Estudiante;
import java.util.ArrayList;
import java.util.Scanner;

public class EstudianteService {

    protected Scanner leer = new Scanner(System.in);
    protected ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();

    public void agregarEstudiante(Estudiante estudiante) {
        listaEstudiantes.add(estudiante);
    }

    public void matricularNuevoCurso() {
        System.out.println("Lista de Estudiantes:");
        for (Estudiante estudiante : listaEstudiantes) {
            System.out.println("Estudiante: " + estudiante.toString());
        }

        System.out.println("Ingrese el DNI del estudiante que desea matricular en un nuevo curso:");
        int dniEstudiante = leer.nextInt();
        leer.nextLine();

        Estudiante estudiante = buscarEstudiante(dniEstudiante);

        if (estudiante == null) {
            System.out.println("Estudiante no encontrado con DNI: " + dniEstudiante);
            return;
        }
        System.out.println("Ingrese el nombre del curso:");
        String nombreCurso = leer.nextLine();
        if (estudiante.estaMatriculadoEnCurso(nombreCurso)) {
            System.out.println("El estudiante ya está matriculado en ese curso.");
        } else {
            estudiante.getCurso().add(nombreCurso);
            System.out.println("Matriculación exitosa en el curso: " + nombreCurso);
        }

    }

    public Estudiante buscarEstudiante(int dniEstudiante) {
        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.getId() == dniEstudiante) {
                return estudiante;
            }
        }
        return null;
    }
}
