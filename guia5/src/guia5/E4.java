/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
 */
package guia5;

import java.util.Scanner;

/**
 *Extra4
 * @author castr
 */
public class E4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner pepas = new Scanner(System.in);
        int aprobados = 0, desaprobados = 0;
        float[] n1, n2, n3, n4, nT;
        n1 = new float[3];
        n2 = new float[3];
        n3 = new float[3];
        n4 = new float[3];
        nT = new float[3];

        if ((n1.length == n2.length) && (n1.length == n3.length) && (n1.length == n4.length) && (n1.length == nT.length)) {
            for (int i = 0; i < n1.length; i++) {
                System.out.println("----- Alumno "+(i+1)+" -----");
                System.out.println("Ingrese la nota del primer trabajo práctico evaluativo");
                n1[i] += (pepas.nextFloat())*(0.1);

                System.out.println("Ingrese la nota del segundo trabajo práctico evaluativo");
                n2[i] += (pepas.nextFloat()) * (0.15);

                System.out.println("Ingrese la nota del primer integrador");
                n3[i] += (pepas.nextFloat()) * (0.25);

                System.out.println("Ingrese la nota del segundo integrador");
                n4[i] += (pepas.nextFloat()) * (0.5);

                nT[i] = ( (n1[i]) + n2[i] + n3[i] + n4[i] )/ 4;
                System.out.println("El promedio del alumno es "+nT[i]);
                if (nT[i] >= 7) {
                    aprobados++;
                } else {
                    desaprobados++;
                }

            }
        }
        System.out.println("La cantidad de aprobados es " +aprobados);
        System.out.println("La cantidad de desaprobados es " + desaprobados);

    }

}
