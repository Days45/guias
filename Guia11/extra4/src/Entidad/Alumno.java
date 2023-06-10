/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
llamada Alumno con los siguientes atributos:
nombre completo, DNI y cantidad de votos.
 */
package Entidad;

import java.util.Comparator;



/**
 *
 * @author castr
 */
public class Alumno {
    private String nombreCompleto;
    private String apellido;
    private Integer dni;
    private Integer cantVotos;
    private Voto v1;

    public Alumno() {
    }

    public Alumno(String nombreCompleto, String apellido, Integer dni, Integer cantVotos, Voto v1) {
        this.nombreCompleto = nombreCompleto;
        this.apellido = apellido;
        this.dni = dni;
        this.cantVotos = cantVotos;
        this.v1 = v1;
    }

    public Alumno(String nombreCompleto, String apellido, Integer dni) {
        this.nombreCompleto = nombreCompleto;
        this.apellido = apellido;
        this.dni = dni;
    }
    

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getCantVotos() {
        return cantVotos;
    }

    public void setCantVotos(Integer cantVotos) {
        this.cantVotos = cantVotos;
    }

    public Voto getV1() {
        return v1;
    }

    public void setV1(Voto v1) {
        this.v1 = v1;
    }
    public static Comparator<Alumno> votitosD = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno  a1, Alumno a2) {
            return a2.getCantVotos().compareTo(a1.getCantVotos());
        }
    };

    @Override
    public String toString() {
        return "Alumno{" + "nombreCompleto=" + nombreCompleto + ", apellido=" + apellido + ", dni=" + dni + ", cantVotos=" + cantVotos + ", v1=" + v1 + '}';
    }

    

}
