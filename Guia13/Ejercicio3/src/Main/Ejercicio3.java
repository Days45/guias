/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos para cada objeto, 
deberá comprobar si la persona está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e indicar
para cada objeto si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas variables(arrays),
para después calcular un porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en su peso ideal 
y cuantos, por encima, y también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores. 
Para esto, podemos crear unos métodos adicionales.

 */
package Main;

import Main.entidades.Persona;
import Main.servicios.PersonaServicio;

/**
 *
 * @author castr
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PersonaServicio Ps = new PersonaServicio();
        Persona persona = null;
        //modificacion para el ejercicio 1 de la guia 13 excepciones 
        try {
            boolean esMayor = Ps.esMayorDeEdad(persona);
            System.out.println("Es mayor: " + esMayor);
        } catch (NullPointerException e) {
            System.out.println("Excepción controlada: el objeto persona es nulo.");
        }
//        Persona[] Person = new Persona[4];
//        boolean[] esMayor = new boolean[4];
//        int[] imc = new int[4];
//        
//        for (int i = 0; i < 4; i++) {
//            Person[i] = Ps.crearPersona();
//            if (Ps.esMayorDeEdad(Person[i])) {
//                System.out.println("Es mayor");
//                esMayor[i] = Ps.esMayorDeEdad(Person[i]);
//
//            } else {
//                System.out.println("Es menor");
//                esMayor[i] = Ps.esMayorDeEdad(Person[i]);
//
//            }
//            switch (Ps.calcularIMC(Person[i])) {
//                case -1:
//                    System.out.println("Es un palito");
//                    imc[i] = Ps.calcularIMC(Person[i]);
//
//                    break;
//                case 0:
//                    System.out.println("Mmmm esta bien el peso");
//                    imc[i] = Ps.calcularIMC(Person[i]);
//
//                    break;
//                case 1:
//                    System.out.println("Es una ballena");
//                    imc[i] = Ps.calcularIMC(Person[i]);
//
//                    break;
//            }
//        }
//        int b = 0, a = 0, m = 0, MM = 0, MA = 0;
//        for (int i = 0; i <4; i++) {
//            //esMayorDeEdad
//            if (esMayor[i]==true) {
//                MA=MA+1;
//            } else {
//                MM=MM+1;
//            }
//            switch (imc[i]) {
//                case -1:
//                    b=b+1;
//                    break;
//                case 0:
//                    m=m+1;
//                    break;
//                case 1:
//                    a=a+1;
//                    break;
//            } 
//        }
//        System.out.println((100/4)*MA + "% son mayores");
//        System.out.println((100/4)*MM + "% son menores");
//        
//        System.out.println((100/4)*b + "% son palitos");
//        System.out.println((100/4)*m + "% estan en su peso ideal");
//        System.out.println((100/4)*a + "% son ballenas");
    }

}
