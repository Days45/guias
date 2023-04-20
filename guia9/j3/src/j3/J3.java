/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j3;

import j3.Servicios.ArregloService;

/**
 *
 * @author castr
 */
public class J3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Double[] A=new Double[50];
        Double[] B=new Double[20];
        ArregloService Ar= new ArregloService();
        Ar.incializarA(A);
        System.out.print("A: ");
        Ar.mostrar(A);
        Ar.ordenar(A);
        System.out.println(" ");
        Ar.inicializarB(A, B);
        System.out.print("A: ");
        Ar.mostrar(A);
        System.out.println(" ");
        System.out.print("B: ");
        Ar.mostrar(B);
        System.out.println(" ");
    }
    
}
