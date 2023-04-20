/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1;

import j1.Entidad.Cadena;
import j1.Servicios.CadenaServicio;

/**
 *
 * @author castr
 */
public class J1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CadenaServicio Se1=new CadenaServicio();
        Cadena c1 = new Cadena("casa blanca");
        
        Se1.mostrarVocales(c1); 
        Se1.invertirFrase(c1);
        System.out.println("veces repetido: "+Se1.vecesRepetido(c1)); 
        System.out.println("longitud: "+Se1.compararLongitud(c1, "empresa"));
        Se1.unirFrases(c1, "no se que poner"); 
        System.out.println("frase reemplazada: "+Se1.reemplazar(c1, "+"));
        System.out.println("letra ingresada: "+Se1.contiene(c1, "a"));
        
    }
    
}
