/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 que tiene una sala con un conjunto de asientos
(8 filas por 6 columnas).  
 */
package Entidad;

/**
 *
 * @author castr
 */
public class Sala {
    private Espectador personita;
    private int numAsientos;
    private String letraAsientos;

    public Sala() {
    }

    public Sala(Espectador personita, int numAsientos, String letraAsientos) {
        this.personita = personita;
        this.numAsientos = numAsientos;
        this.letraAsientos = letraAsientos;
    }

    public Sala(int numAsientos, String letraAsientos) {
        this.numAsientos = numAsientos;
        this.letraAsientos = letraAsientos;
    }
    

    public Espectador getPersonita() {
        return personita;
    }

    public void setPersonita(Espectador personita) {
        this.personita = personita;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    public String getLetraAsientos() {
        return letraAsientos;
    }

    public void setLetraAsientos(String letraAsientos) {
        this.letraAsientos = letraAsientos;
    }

    @Override
    public String toString() {
        return "Sala{" + "personita=" + personita + ", numAsientos=" + numAsientos + ", letraAsientos=" + letraAsientos + '}';
    }
    
}
