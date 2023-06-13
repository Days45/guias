
package Servicios;


import Entidades.Profesor;
import java.util.ArrayList;
import java.util.Scanner;


public class ProfeService {

    protected Scanner leer= new Scanner(System.in) ;
    protected ArrayList<Profesor> listaProfe = new ArrayList<>();

    public void agregarProfeService(Profesor profe) {
        listaProfe.add(profe);
    }

    public void cambiarDepartamento() {
        System.out.println("Lista de Profesores:");
        listaProfesores();

        System.out.println("Ingrese el DNI del profesor que desea cambiar de departamento:");
        int dni = leer.nextInt();
        leer.nextLine(); // Consumir el salto de línea

        Profesor profesor = buscarProfesor(dni);

        if (profesor == null) {
            System.out.println("No se encontró al profesor con DNI: " + dni);
            return;
        } else {
            System.out.println("Ingrese el nuevo departamento:");
            String nuevoDepartamento = leer.nextLine();

            if (profesor.getDepartamento().equalsIgnoreCase(nuevoDepartamento)) {
                System.out.println("El profesor ya pertenece a ese departamento.");
            } else {
                profesor.setDepartamento(nuevoDepartamento);
                System.out.println("Se ha cambiado el departamento del profesor " + profesor.getNombre()
                        + " con DNI " + dni + " a " + nuevoDepartamento);
            }
        }

        
    }

    public void listaProfesores() {
        for (int i = 0; i < listaProfe.size(); i++) {
            Profesor profesor = listaProfe.get(i);
            System.out.println((i + 1) + ". " + profesor.getNombre() + " (DNI: " + profesor.getId()+ ")");
        }
    }

    public Profesor buscarProfesor(int dni) {
        for (Profesor profesor : listaProfe) {
            if (profesor.getId() == dni) {
                return profesor;
            }
        }
        return null;
    }
}
