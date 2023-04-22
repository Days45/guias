/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j5;

import j5.Entidad.Persona;
import j5.Servicios.PersonaService;
import java.util.Scanner;

/**
 *
 * @author castr
 */
public class J5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner (System.in);
        PersonaService ps = new PersonaService();
        Persona p1= ps.crearPersona();
        ps.calcularEdad(p1);
        System.out.println("Ingrese edad a comparar");
        System.out.println("Es menor: " + ps.menorQue(p1,leer.nextInt() ));
        ps.mostrarPersona(p1);
    }
    
}
