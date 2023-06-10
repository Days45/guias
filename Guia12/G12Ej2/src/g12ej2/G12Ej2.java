/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g12ej2;

import Entidad.Electrodomesticos;
import Entidad.Lavadora;
import Entidad.Televisor;
import Servicio.ElectrodomesticosService;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author castr
 */
public class G12Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
       
        ArrayList<Electrodomesticos> tiendita = new ArrayList();
        Electrodomesticos l1= new Lavadora(500, "amarillo", 'a', 40,65);
        Electrodomesticos l2= new Lavadora(500, "rojo", 'j', 50,20);
        Electrodomesticos t1= new Televisor(500, "blanco", 'f', 25, 40, true);
        Electrodomesticos t2= new Televisor(500, "verde", 'b', 45, 50, false);
        tiendita.add(t1);
        tiendita.add(t2);
        tiendita.add(l1);
        tiendita.add(l2);
        
        double sumaElectrodomesticos = 0;
        double sumaTelevisiones = 0;
        double sumaLavadoras =0 ;
        for (int i = 0; i < tiendita.size(); i++) {
            if (tiendita.get(i) instanceof Electrodomesticos) {
                sumaElectrodomesticos += tiendita.get(i).precioFinal();
            }
            if (tiendita.get(i) instanceof Lavadora) {
                sumaLavadoras += tiendita.get(i).precioFinal();
            }
            if (tiendita.get(i) instanceof Televisor) {
                sumaTelevisiones += tiendita.get(i).precioFinal();
            }
        }
        System.out.println("La suma del precio de los electrodomésticos es de $" +(double) sumaElectrodomesticos);
        System.out.println("La suma del precio de las lavadoras es de $" +(double) sumaLavadoras);
        System.out.println("La suma del precio de las televisiones es de $" + (double)sumaTelevisiones);
        
        for (Electrodomesticos echito : tiendita) {
            System.out.println(echito);
        }
    }

}
