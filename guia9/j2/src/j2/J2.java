/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2;

import j2.Entidad.ParDeNumeros;
import j2.Servicio.ParDeNumerosService;
import java.util.Scanner;

/**
 *
 * @author castr
 */
public class J2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        ParDeNumerosService Ps=new ParDeNumerosService();
        ParDeNumeros p1=new ParDeNumeros();
        String op="no";
        do {      
            System.out.println("");
            System.out.println("1.Mostrar valores");
            System.out.println("2.Devolver el mayor");
            System.out.println("3.Calcular potencia");
            System.out.println("4.Calcular Raiz");
            System.out.println("5. Salir");
            int menu=leer.nextInt();
            switch(menu){
                case 1:Ps.mostrarValores(p1);
                    break;
                case 2:System.out.println("El mayor entre "+p1.getNum1()+ " y "+ p1.getNum2()+" = "+Ps.devolverMayor(p1));
                    break;
                case 3:
                    System.out.println("El numero mayor elevado al numero menor es: "+Ps.calcularPotencia(p1));
                    
                    break;
                case 4:System.out.println("La raiz del numero menor: "+Ps.calcularRaiz(p1));
                    break;
                case 5:
                    System.out.println("Esta seguro que quiere salir?");
                    op=leer.next();
                    break;
            }
        } while ("no".equalsIgnoreCase(op));
    }
    
}
