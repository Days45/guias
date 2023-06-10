/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Una vez hecho esto debemos generar una clase Voto, esta clase tendrá como atributos,
un objeto Alumno que será el alumno que vota y una lista de los alumnos a los que votó.
 */
package Entidad;


import java.util.HashSet;


/**
 *
 * @author castr
 */
public class Voto {
    private Alumno al;
    private HashSet<Alumno> votados;

    public Voto() {
    }

    public Voto(Alumno al, HashSet<Alumno> votados) {
        this.al = al;
        this.votados = votados;
    }

    public Alumno getAl() {
        return al;
    }

    public void setAl(Alumno al) {
        this.al = al;
    }

    public HashSet<Alumno> getVotados() {
        return votados;
    }

    public void setVotados(HashSet<Alumno> votados) {
        this.votados = votados;
    }

    @Override
    public String toString() {
        return "Voto{" + "al=" + al + ", votados=" + votados + '}';
    }

   
   
}
