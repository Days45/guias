/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
 */
package g12ej1;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

/**
 *
 * @author castr
 */
public class G12Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal perro1= new Perro("Stich","Carnivoro", 15, "Doberman");
        perro1.Alimentarse();
        Animal perro2=new Perro("Teddy","Croquetas", 18, "Chihuahua");
        perro2.Alimentarse();
        Animal gato= new Gato("Pelusa","Galletas", 15, "Siames");
        gato.Alimentarse();
        Animal caballo=new Caballo("Spark","Pasto", 25, "Fino");
        caballo.Alimentarse();
        
        
    }
    
}
