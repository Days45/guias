/*
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.
 */
package Entidades;

/**
 *
 * @author castr
 */
public class EdificioDeOficinas extends Edificio{
    protected int numOficinas;
    protected int personasPorOficina;
    protected int numPisos;

    public EdificioDeOficinas(double ancho, double alto, double largo, int numOficinas,
                              int personasPorOficina, int numPisos) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.personasPorOficina = personasPorOficina;
        this.numPisos = numPisos;
    }

    public int getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(int numOficinas) {
        this.numOficinas = numOficinas;
    }

    public int getPersonasPorOficina() {
        return personasPorOficina;
    }

    public void setPersonasPorOficina(int personasPorOficina) {
        this.personasPorOficina = personasPorOficina;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    public void cantPersonas() {
        System.out.println("En un piso caben " + (numOficinas * personasPorOficina) + " personas.");
        System.out.println("En todo el edificio caben " + (numOficinas * personasPorOficina * numPisos) + " personas.");
    }

    @Override
    public double calcularSuperficie() {
        return (ancho * largo);
    }

    @Override
    public double calcularVolumen() {
        return (ancho * largo * alto);
    }

    @Override
    public String toString() {
        return super.toString()+", Numero de oficinas= "+numOficinas+", Personas por oficina= "+personasPorOficina+", Numero de pisos= "+numPisos; //To change body of generated methods, choose Tools | Templates.
    }
    
}
