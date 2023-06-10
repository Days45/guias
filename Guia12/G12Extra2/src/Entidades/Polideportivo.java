/*
 • Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
 */
package Entidades;

/**
 *
 * @author castr
 */
public class Polideportivo extends Edificio{
    protected String nombre;
    protected boolean tipoInstalacion;

    public Polideportivo() {
        
    }

    public Polideportivo(double ancho, double alto, double largo, String nombre, boolean tipoInstalacion) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getTipoInstalacion() {
        return tipoInstalacion;
    }

    public void setTipoInstalacion(boolean tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }

    
    

    @Override
    public double calcularSuperficie() {
        return (ancho*largo);
    }

    @Override
    public double calcularVolumen() {
        return (ancho*largo*alto);
    }

    @Override
    public String toString() {
        return super.toString()+", Nombre= "+nombre+", Tipo de Instalación= "+tipoInstalacion; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
