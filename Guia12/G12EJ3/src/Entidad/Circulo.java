/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author castr
 */
public class Circulo implements CalculoDeFormas{
    private double radio;
    private double diametro;

    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }
 
    @Override
    public double calcularArea() {
        return (PI*Math.pow(radio, 2));
    }

    @Override
    public double calcularPerimetro() {
        return (PI*diametro);
    }

   
    
}
