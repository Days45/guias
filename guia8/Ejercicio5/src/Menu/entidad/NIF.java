/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su correspondiente letra (NIF). 
Los atributos serán el número de DNI (entero largo) y la letra (String o char) que le corresponde.
 */
package Menu.entidad;

/**
 *
 * @author castr
 */
public class NIF {
    private int DNIs;
    private char letra;

    public NIF() {
    }

    public NIF(int DNIs, char letra) {
        this.DNIs = DNIs;
        this.letra = letra;
    }

    public long getDNIs() {
        return DNIs;
    }

    public void setDNIs(int DNIs) {
        this.DNIs = DNIs;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
    
}
