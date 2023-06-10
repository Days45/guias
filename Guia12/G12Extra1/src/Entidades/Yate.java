/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author castro
 */
public class Yate extends Barco{
    //• Potencia en CV y número de camarotes para yates de lujo.
    protected int PotenciaCv;
    protected int camarotes;

    public Yate() {
    }

    public Yate(String matricula, double eslora, int fabricacion) {
        super(matricula, eslora, fabricacion);
    }
    
    public Yate(String matricula, double eslora, int fabricacion, int PotenciaCv, int camarotes) {
        super(matricula, eslora, fabricacion);
        this.PotenciaCv=PotenciaCv;
        this.camarotes=camarotes;
    }

    public int getPotenciaCv() {
        return PotenciaCv;
    }

    public void setPotenciaCv(int PotenciaCv) {
        this.PotenciaCv = PotenciaCv;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }
    
    //en los yates se suma la potencia en CV y el número de camarotes.
    @Override
    public double calcularModulo() {
        return super.calcularModulo()+PotenciaCv + camarotes;
    }

    @Override
    public String toString() {
        return super.toString()+ ", Potencia Cv= "+PotenciaCv+",  Numero de Camarotes= "+camarotes; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
