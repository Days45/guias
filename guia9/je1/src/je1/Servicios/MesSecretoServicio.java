/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
ostrarlo. ¡Muchas gracias!
Crea una clase en Java donde declares una variable de tipo array de Strings que contenga los doce meses del año, 
en minúsculas. A continuación, declara una variable mesSecreto de tipo String, y hazla igual a un elemento del array 
(por ejemplo, mesSecreto = mes[9]

 */
package je1.Servicios;

import java.util.Scanner;
import je1.Entidad.MesSecreto;

/**
 *
 * @author castr
 */
public class MesSecretoServicio {
    Scanner leer = new Scanner(System.in);
    public MesSecreto  llenar(String[] mes){
       MesSecreto nuevo= new MesSecreto();
       nuevo.setMesSecret(mes[(int)(Math.random()*12 )+1]);
       return nuevo;
    }
    public void adivinar(MesSecreto  MesSecret){
        System.out.println("Adivina el mes!");
        String mes =leer.next();
        while (!mes.equalsIgnoreCase(MesSecret.getMesSecret())) {            
            System.out.println("Incorrecto, ingrese nuevamente");
            mes =leer.next();
        }
        System.out.println("Acertaste!");
    }
    
}
