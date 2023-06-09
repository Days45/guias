/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author castro
 */
/**
Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
 **/
public class Revolver {
    private int posicionActual;
    private int posicionAgua;
    private static final int TAMANIO_TAMBOR = 6;


    public Revolver() {
        
    }

    public Revolver(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }
    //1
    public void llenarRevolver(){
        this.posicionActual=(int)(Math.random()*6)+1;
        this.posicionAgua =(int)(Math.random()*6)+1 ;
    }
    //2
    public boolean mojar(){
        return posicionActual==posicionAgua;
    }
    //3
    public void siguienteChorro(){
        posicionActual= (posicionActual==6)?1:++posicionActual;
    }
    //4

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual= " + this.posicionActual + ", posicionAgua= " + this.posicionAgua + '}';
    }
    
    
}
