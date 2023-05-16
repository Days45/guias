/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

4. Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta
página:  Nota: Poner el código postal sin la letra, solo el
numero.
• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
• Muestra por pantalla los datos introducidos
• Pide un código postal y muestra la ciudad asociada si existe sino avisa al
usuario.
• Muestra por pantalla los datos
• Agregar una ciudad con su código postal correspondiente más al HashMap.
• Elimina 3 ciudades existentes dentro del HashMap
 */
package extrag4;

import extrag4.servicios.CodigoPostalServicios;

/**
 *
 * @author castr
 */
public class Extrag4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CodigoPostalServicios cPs= new CodigoPostalServicios();
        for (int i = 0; i < 5; i++) {
          cPs.ingresoCiudad();  
        }
        cPs.mostrarIntroducidos();
        System.out.println("");
        cPs.exitenciaCiudad();
        System.out.println("");
        System.out.println("Ingresa un nuevo codigo y ciudad ");
        cPs.ingresoCiudad();
        System.out.println("");
        cPs.eliminarCiudades();
        System.out.println("");
        cPs.mostrarIntroducidos();
        
    }
    
}
/** algunos codigos con sus respectivas ciudades
 * Agua Dulce          4115
 * Aguadita            4178
 * Alabama             4117
 * Abra del Tafi       4105 
 * Alto de Leiva       4142 
 * Aranilla            4134
 * Alizal              4122
 * Alto de los Gimenez 4124
 * Agua Azul           4132
 * Alto Las Flores     4152
 **/
