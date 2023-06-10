/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author castr
 */
public class Velero extends Barco{
    protected int mastiles;

    public Velero() {
    }

    public Velero(String matricula, double eslora, int fabricacion) {
        super(matricula, eslora, fabricacion);
    }
    
    public Velero(String matricula, double eslora, int fabricacion, int mastiles) {
        super(matricula, eslora, fabricacion);
        this.mastiles=mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }
    

    @Override
    public double calcularModulo() {
        return super.calcularModulo()+mastiles;
    }

    @Override
    public String toString() {
        return super.toString()+", Numero de mastiles= "+mastiles; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
