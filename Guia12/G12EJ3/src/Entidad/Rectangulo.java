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
public class Rectangulo implements CalculoDeFormas{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    

    @Override
    public double calcularArea() {
        return (base*altura);
    }

    @Override
    public double calcularPerimetro() {
        return (base + altura)*2;
    }
    
}
