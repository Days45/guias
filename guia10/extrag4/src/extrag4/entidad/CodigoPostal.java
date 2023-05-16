/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extrag4.entidad;

/**
 *
 * @author castr
 */
public class CodigoPostal {
    private int postal;
    private String nombre;

    public CodigoPostal() {
    }

    public CodigoPostal(int postal, String nombre) {
        this.postal = postal;
        this.nombre = nombre;
    }

    public int getPostal() {
        return postal;
    }

    public void setPostal(int postal) {
        this.postal = postal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
