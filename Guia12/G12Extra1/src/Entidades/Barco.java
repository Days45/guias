/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author castr
 */
public  class Barco {
    protected String matricula;
    protected double eslora;
    protected int fabricacion;

    public Barco() {
    }

    public Barco(String matricula, double eslora, int fabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.fabricacion = fabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public int getFabricacion() {
        return fabricacion;
    }

    public void setFabricacion(int fabricacion) {
        this.fabricacion = fabricacion;
    }
    public double calcularModulo(){
        return eslora*10;
    }

    @Override
    public String toString() {
        return  "matricula=" + matricula +  ", eslora=" + eslora +  ", fabricacion=" + fabricacion  ;
    }

}
