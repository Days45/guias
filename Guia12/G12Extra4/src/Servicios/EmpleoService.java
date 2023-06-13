
package Servicios;

import Entidades.Empleado;
import Entidades.PersonalServicio;
import Entidades.Profesor;
import java.util.ArrayList;
import java.util.Scanner;


public class EmpleoService  {

    protected ArrayList<Empleado> listaEmpleados= new ArrayList<>();
    protected Scanner leer= new Scanner(System.in);

    

    public void agregarEmpleado(Empleado empleado) {
        listaEmpleados.add(empleado);
    }

    // Otros métodos de la clase EmpleadoService
    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void listaEmpleo() {
        for (Empleado li : listaEmpleados) {
            if (li instanceof Profesor) {
                Profesor profesor = (Profesor) li;
                System.out.println("Profesor: " + profesor.toString());
            } else if (li instanceof PersonalServicio) {
                PersonalServicio personalServicio = (PersonalServicio) li;
                System.out.println("Personal de Servicio: " + personalServicio.toString());
            }
        }
        System.out.println("Ingrese el DNI del empleado:");
        int dniEmpleado = leer.nextInt();
        leer.nextLine();

        System.out.println("Ingrese el nuevo despacho:");
        int nuevoDespacho = leer.nextInt();
        leer.nextLine();

        boolean encontrado = false;
        for (Empleado li : listaEmpleados) {
            if (li instanceof Empleado && li.getId() == dniEmpleado) {
                Empleado empleado = (Empleado) li;
                empleado.setDespacho(nuevoDespacho);
                System.out.println("Se ha reasignado el despacho del empleado con DNI " + dniEmpleado + " al despacho número " + nuevoDespacho);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró al empleado con DNI: " + dniEmpleado);
        }
    }
}
