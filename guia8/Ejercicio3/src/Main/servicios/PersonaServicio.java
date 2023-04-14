/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.servicios;

import Main.entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author castr
 */
/*En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y 
después se le asignan a sus respectivos atributos para llenar el objeto Persona.
Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
Si no es correcto se deberá mostrar un mensaje.
Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)).
Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de su peso ideal 
y la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que 
la persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la fórmula es un 
valor mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
*/
public class PersonaServicio {
   Scanner leer = new Scanner(System.in); 
   
   
   public boolean esMayorDeEdad(Persona infeliz){
       if (infeliz.getEdad()<18) {
           return false;
       }else{
           return true;
       }
   }
   public Persona crearPersona(){
       System.out.println("Nombre:");
       String nombre=leer.next();
       System.out.println("Edad:");
       int edad=leer.nextInt();
       System.out.println("Sexo: ");
       String sexo="";
       while (!sexo.equalsIgnoreCase("m")&&!sexo.equalsIgnoreCase("h")&&!sexo.equalsIgnoreCase("o")) {           
           System.out.println("H:hombre, M:mujer y O:otro ");
           sexo=leer.next();
       }
       System.out.println("Peso:");
       double peso=leer.nextDouble();
       System.out.println("Altura:");
       double altura= leer.nextDouble();
       return new Persona(nombre, edad, sexo, peso, altura);
   }
    public int calcularIMC(Persona infeliz){
        double IMC=(infeliz.getPeso()/Math.pow(infeliz.getAltura(), 2));
        if(IMC<20){
            return -1;
        }else if (IMC>=20 && IMC<=25) {

            return 0;
        }else{
            return 1;
        }
    }
}
