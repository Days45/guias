/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g5.entidad;

import java.util.Objects;

/**
 *
 * @author castr
 */
public class Pais implements Comparable<Pais>{
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
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.pais);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pais other = (Pais) obj;
        if (!Objects.equals(this.pais, other.pais)) {
            return false;
        }
        return true;
    }
    

    @Override
    public String toString() {
        return  "pais: " + pais;
    }

    @Override
    public int compareTo(Pais t) {
        return this.pais.compareTo(t.getPais());
    }
    
    
}
