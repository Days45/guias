package Service;

import Entidad.Alumno;
import Entidad.Voto;
import Enums.ApellidosEnum;
import Enums.NombresEnum;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SimuladorService {

    private Scanner leer;
    private ArrayList<Alumno> alumnos;
    private ArrayList<Voto> votos;
    private ArrayList<Alumno> votito;
    private AlumnoService as;

    public SimuladorService() {
        this.leer = new Scanner(System.in);
        this.alumnos = new ArrayList<>();
        this.votos = new ArrayList<>();
        this.votito = new ArrayList<>();
        this.as = new AlumnoService();
    }

    public ArrayList<Integer> agregarDni(ArrayList<Alumno> alumnos) {
        ArrayList<Integer> dniAl = new ArrayList<>();
        Integer min = 15149254;
        Integer max = 43739496;
        Integer dniRango;
        for (int i = 0; i < 15; i++) {
            dniRango = (int) (Math.random() * (max - min)) + min;
            dniAl.add(dniRango);
        }
        Collections.shuffle(dniAl);
        return dniAl;

    }

    public ArrayList<Alumno> crearAlumnos() {
        ArrayList<Integer> dniAl = new ArrayList<>(agregarDni(alumnos));
        Random rand = new Random();
        HashSet<Integer> dnis = new HashSet<>();

        while (alumnos.size() < 15) {
            NombresEnum[] nombres = NombresEnum.values();
            ApellidosEnum[] apellidos = ApellidosEnum.values();
            String nombre = nombres[rand.nextInt(nombres.length)].toString();
            String apellido = apellidos[rand.nextInt(apellidos.length)].toString();
            int dni = dniAl.get(rand.nextInt(dniAl.size()));
            if (!dnis.contains(dni)) {
                alumnos.add(new Alumno(nombre, apellido, dni));
                dnis.add(dni);
            }
        }
        return alumnos;
    }

    public void imprimir(ArrayList<Alumno> alumnos) {

        System.out.println("Lista de alumnos de egg");
        for (Alumno alumno : alumnos) {
            System.out.print("Nombre: " + alumno.getNombreCompleto() + " DNI: " + alumno.getDni() + "\n");
        }
    }

    public ArrayList<Alumno> votacion(ArrayList<Alumno> alumnos) {
        Random rand = new Random();
        Alumno aux = new Alumno();
        System.out.println("Votacion :(");
        System.out.println("Debe votar a 3 personas distintas y no votarse a sí mismo");

        for (Alumno alum : alumnos) {
            HashSet<Alumno> alumnito = new HashSet<>();
            HashSet<Alumno> alumnosVotados = new HashSet<>(); // Conjunto auxiliar para llevar el seguimiento de los alumnos votados
            // Crear una copia de la lista de alumnos
            ArrayList<Alumno> alumnosCopia = new ArrayList<>(alumnos);
            // Eliminar al propio alumno de la lista
            alumnosCopia.remove(alum);
            int cont = 0;
            while (alumnito.size() < 3) {
                aux = alumnosCopia.get(rand.nextInt(alumnosCopia.size()));
                // Verificar que el alumno no se haya votado previamente
                if (aux != alum && !alumnosVotados.contains(aux)) {
                    alumnito.add(aux);
                    alumnosVotados.add(aux);

                }
            }
            
            for (Alumno auxi : alumnito) {
                cont += 1;
                auxi.setCantVotos(cont);
            }
            Voto votos = new Voto(alum, alumnito);
            alum.setV1(votos);
        }

        return alumnos;
    }

    public void mostrarVOtdados(ArrayList<Alumno> alumnos) {
        for (Alumno alumno : alumnos) {
            System.out.println("El alumno " + alumno.getNombreCompleto() + " recibió " + alumno.getCantVotos() + " votos.");
            System.out.println("Y votó a: ");
            for (Alumno votado : alumno.getV1().getVotados()) {
                System.out.println(votado.getNombreCompleto());
            }
        }
    }

    public void recuentoV(ArrayList<Alumno> alumnos) {
        int votados = 0, voto=0;
        for (Alumno alumno : alumnos) {
            voto=alumno.getCantVotos();
            votados += voto;
        }
        System.out.println("Se realizaron un total de: " + votados + " votos");
    }

    public void facilitadores(ArrayList<Alumno> alumnos) {
        alumnos.sort(Alumno.votitosD);
        for (int i = 0; i < 5; i++) {
            System.out.println(alumnos.get(i).getNombreCompleto() + " - " + alumnos.get(i).getCantVotos() + " votos");
        }
        List<Alumno> suplentes = alumnos.subList(5, alumnos.size());
        System.out.println("\nLos 5 suplentes son:");
        suplentes.sort(Alumno.votitosD); // Ordenar la lista de suplentes por el número de votos

        for (int i = 0; i < 5; i++) {
            System.out.println(suplentes.get(i).getNombreCompleto() + " - " + suplentes.get(i).getCantVotos() + " votos");
        }
    }

}
