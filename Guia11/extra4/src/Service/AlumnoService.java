/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author castr
 */
public class AlumnoService {

    ArrayList<Alumno> unito= new ArrayList<>();
    ArrayList<String> nombre= new ArrayList<>();
    ArrayList<String> apellido=new ArrayList<>();
     ArrayList<Integer> dne=new ArrayList<>();

    public ArrayList<String>  agregarNombres() {
        nombre.add("BENJAMIN");
        nombre.add("IGNACIO");
        nombre.add("FELIPE");
        nombre.add("ANTONIA");
        nombre.add("VICENTE");
        nombre.add("VIOLETA");
        nombre.add("SOFIA");
        nombre.add("TOMAS");
        nombre.add("CARLOS");
        nombre.add("EMILIA");
        nombre.add("MANUEL");
        nombre.add("JIMIN");
        nombre.add("JIN");
        nombre.add("JUNG-KOOK");
        nombre.add("RM");
        Collections.shuffle(nombre);
        return nombre;
    }
    public ArrayList<String>  agregarApellidos(){
        apellido.add("RAMIREZ");
        apellido.add("CHOI");
        apellido.add("CASTRO");
        apellido.add("VILLAGRAN");
        apellido.add("CONCHA");//XD
        apellido.add("AMADO");
        apellido.add("DECIMA");
        apellido.add("DOMINGO");
        apellido.add("SABADO");
        apellido.add("LECHUGA");//PUSE CUALQUIER COSA
        apellido.add("MANUEL");
        apellido.add("ARAOZ");
        apellido.add("JUAREZ");
        apellido.add("RODRIGUEZ");
        apellido.add("HERNANDEZ");
        Collections.shuffle(apellido);
        return apellido;
    }
    public ArrayList<Integer> agregarDni(ArrayList<Integer> dne){
        Integer min=15149254;
        Integer max=43739496;
        Integer dniRango;
        for (int i = 0; i < 15; i++) {
            dniRango=(int)(Math.random()*(max-min))+min;
            dne.add(dniRango);
        }
        Collections.shuffle(dne);
        return dne;
        
    }
    
}
