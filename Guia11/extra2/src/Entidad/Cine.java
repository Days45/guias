/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada.
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author castr
 */
public class Cine {
    private Pelicula peli;
    private String [][]salita;
    private Double entrada;

    public Cine() {
    }

    public Cine(Pelicula peli, String[][] salita, Double entrada) {
        this.peli = peli;
        this.salita = salita;
        this.entrada = entrada;
    }

    public Pelicula getPeli() {
        return peli;
    }

    public void setPeli(Pelicula peli) {
        this.peli = peli;
    }

    public String[][] getSalita() {
        return salita;
    }

    public void setSalita(String[][] salita) {
        this.salita = salita;
    }

    public Double getEntrada() {
        return entrada;
    }

    public void setEntrada(Double entrada) {
        this.entrada = entrada;
    }

    @Override
    public String toString() {
        return "Cine{" + "peli=" + peli + ", salita=" + salita + ", entrada=" + entrada + '}';
    }

   
    
}
