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
public class BarcoMotor extends Barco{
    //Potencia en CV para barcos a motor.
    protected int MpotenciaCV;

    public BarcoMotor() {
    }

    public BarcoMotor(String matricula, double eslora, int fabricacion) {
        super(matricula, eslora, fabricacion);
    }
    
    public BarcoMotor(String matricula, double eslora, int fabricacion, int MpotenciaCV) {
        super(matricula, eslora, fabricacion);
        this.MpotenciaCV=MpotenciaCV;
    }

    public int getMpotenciaCV() {
        return MpotenciaCV;
    }

    public void setMpotenciaCV(int MpotenciaCV) {
        this.MpotenciaCV = MpotenciaCV;
    }
    

    @Override
    public double calcularModulo() {
        return super.calcularModulo()+MpotenciaCV;
    }

    @Override
    public String toString() {
        return super.toString()+", Potencia Cv= "+MpotenciaCV; 
    }
    
    
}
