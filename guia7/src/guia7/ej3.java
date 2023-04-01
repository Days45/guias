/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7;

import entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author castr
 */
public class ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner odio = new Scanner(System.in);
        Operacion o1= new Operacion();
        o1.crearOperacion();
        int operacion;
        String confirma = "no";
        do {
            System.out.println("Seleccione: " + "\n" + "1.sumar" + "\n" + "2.restar" + "\n" + "3.multiplicar" + "\n" + "4.dividir" + "\n" + "5.salir");
            operacion=odio.nextInt();
            switch (operacion) {
                case 1:
                    System.out.println("Suma: "+o1.sumar(o1.getNum1(), o1.getNum2()));
                    break;
                case 2:
                    System.out.println("resta: "+o1.resta(o1.getNum1(), o1.getNum2()));
                    break;
                case 3:
                    System.out.println("Multiplicacion: "+o1.multiplicacion(o1.getNum1(), o1.getNum2()));
                    break;
                case 4:
                    System.out.println("Division: "+o1.division(o1.getNum1(), o1.getNum2()));
                    break;
                case 5:
                    System.out.println("Esta seguro que quiere salir?");
                    confirma=odio.next();
                    break;
            }
        } while ("no".equals(confirma));
    }
    
}
