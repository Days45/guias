
package Servicios;

import Entidades.PersonalServicio;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalService{

    protected Scanner leer=new Scanner(System.in) ;
    protected ArrayList<PersonalServicio> listaPersonal= new ArrayList<>() ;

    

    public void agregarProfeService(PersonalServicio personal) {
        listaPersonal.add(personal);
    }

    public void trasladarSeccion() {
        System.out.println("Lista de Empleados del Personal de Servicio:");
        listaPersonal();

        System.out.println("Ingrese el DNI del empleado que desea trasladar de sección:");
        int dni = leer.nextInt();
        leer.nextLine(); // Consumir el salto de línea

        PersonalServicio empleado = buscarEmpleado(dni);

        if (empleado == null) {
            System.out.println("No se encontró al empleado con DNI: " + dni);
            return;
        }

        System.out.println("Ingrese la nueva sección:");
        String nuevaSeccion = leer.nextLine();

        if (empleado.getSeccion().equalsIgnoreCase(nuevaSeccion)) {
            System.out.println("El empleado ya pertenece a esa sección.");
        } else {
            empleado.setSeccion(nuevaSeccion);
            System.out.println("Se ha trasladado al empleado " + empleado.getNombre()
                    + " con DNI " + dni + " a la sección " + nuevaSeccion);
        }
    }

    public void listaPersonal() {
        for (int i = 0; i < listaPersonal.size(); i++) {
            PersonalServicio empleado = listaPersonal.get(i);
            System.out.println((i + 1) + ". " + empleado.getNombre() + " (DNI: " + empleado.getId()+ ")");
        }
    }

    public PersonalServicio buscarEmpleado(int dni) {
        for (PersonalServicio empleado : listaPersonal) {
            if (empleado.getId() == dni) {
                return empleado;
            }
        }
        return null;
    }
}
