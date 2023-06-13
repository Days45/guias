package Servicios;

import Entidades.Empleado;
import Entidades.Estudiante;
import Entidades.Persona;
import Entidades.PersonalServicio;
import Entidades.Profesor;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonaService {

    protected Scanner leer;
    protected ArrayList<Persona> personas = new ArrayList();
    protected EstudianteService a;
    protected ProfeService b;
    protected PersonalService c;
    protected EmpleoService d;

    public PersonaService() {
        this.leer = new Scanner(System.in);
        this.a = new EstudianteService();
        this.b = new ProfeService();
        this.c = new PersonalService();
        this.d = new EmpleoService();
    }

    public void agregarPersona(Persona persona) {
        personas.add(persona);

        if (persona instanceof Estudiante) {
            a.agregarEstudiante((Estudiante) persona);

        } else if (persona instanceof Profesor) {
            b.agregarProfeService((Profesor) persona);
            d.agregarEmpleado((Empleado) persona);
        } else if (persona instanceof PersonalServicio) {
            c.agregarProfeService((PersonalServicio) persona);
            d.agregarEmpleado((Empleado) persona);
        }
    }

    public void crearObjetosClasesHijas() {
        Estudiante e1 = new Estudiante("Juan", "Pérez", 45123678, "Soltero");
        Estudiante e2 = new Estudiante("María", "Gómez", 78901234, "Casada");
        e1.agregarCurso("Curso A");
        e1.agregarCurso("Curso B");
        e2.agregarCurso("Curso X");
        Profesor profesor1 = new Profesor("Departamento de Matemáticas", 2005, 201, "Carlos", "López", 56789012, "Soltero");
        Profesor profesor2 = new Profesor("Departamento de Lenguajes", 2010, 202, "Ana", "Ramírez", 12345678, "Casada");
        PersonalServicio personalServicio1 = new PersonalServicio("Biblioteca", 2018, 301, "Luis", "González", 89012345, "Soltero");
        PersonalServicio personalServicio2 = new PersonalServicio("Decanato", 2017, 302, "Laura", "Martínez", 67890123, "Casada");
        agregarPersona(e1);
        agregarPersona(e2);
        agregarPersona(profesor1);
        agregarPersona(profesor2);
        agregarPersona(personalServicio1);
        agregarPersona(personalServicio2);
    }

    public void menu() {
        String letra = "no";
        do {
            System.out.println("Seleccione una opción del 1 al 6:");
            System.out.println("1. Cambio de estado civil de una persona.");
            System.out.println("2. Reasignación de despacho a un empleado.");
            System.out.println("3. Matriculación de un estudiante en un nuevo curso.");
            System.out.println("4. Cambio de departamento de un profesor.");
            System.out.println("5. Traslado de sección de un empleado del personal de servicio.");
            System.out.println("6. Imprimir toda la información de cada tipo de individuo.");
            System.out.println("7. salir");
            int op = leer.nextInt();
            switch (op) {
                case 1:
                    cambiarEstadoCivil();
                    break;
                case 2:
                    d.listaEmpleo();
                    break;
                case 3:
                    a.matricularNuevoCurso();
                    break;
                case 4:
                    b.cambiarDepartamento();
                    break;
                case 5:
                    c.trasladarSeccion();
                    break;
                case 6:
                    listaP();
                    break;
                case 7:
                    System.out.println("Desea Sair? (si/no)");
                    letra = leer.next();
                    break;

            }
        } while (letra.equalsIgnoreCase("no"));

    }

    public void cambiarEstadoCivil() {
        listaP();
        System.out.println("Ingrese el DNI de la persona:");
        int dniPersona = leer.nextInt();
        leer.nextLine();

        System.out.println("Ingrese el nuevo estado civil:");
        String nuevoEstadoCivil = leer.nextLine();

        boolean encontrado = false;
        for (Persona persona : personas) {
            if (persona.getId() == dniPersona) {
                if (!persona.getCivil().equalsIgnoreCase(nuevoEstadoCivil)) {
                    persona.setCivil(nuevoEstadoCivil);
                    System.out.println("Se ha actualizado el estado civil de la persona con DNI " + dniPersona + " a " + nuevoEstadoCivil);
                } else {
                    System.out.println("El nuevo estado civil es igual al estado civil actual.");
                }
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró a la persona con DNI: " + dniPersona);
        }
    }

    public void listaP() {
        for (Persona persona : personas) {
            if (persona instanceof Estudiante) {
                Estudiante estudiante = (Estudiante) persona;
                System.out.println("Estudiante: " + estudiante.toString());
            } else if (persona instanceof Profesor) {
                Profesor profesor = (Profesor) persona;
                System.out.println("Profesor: " + profesor.toString());
            } else if (persona instanceof PersonalServicio) {
                PersonalServicio personalServicio = (PersonalServicio) persona;
                System.out.println("Personal de Servicio: " + personalServicio.toString());
            }
        }
    }

    
}
