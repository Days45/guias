/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5p2.entidad;

import java.util.Objects;

/**
 *
 * @author castr
 */
public class Pais {
   private String pais;

    public Pais() {
    }

    public Pais(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

 
    

    @Override
    public String toString() {
        return  "pais: " + pais;
    }

}
