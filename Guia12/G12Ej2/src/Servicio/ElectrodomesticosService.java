/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Electrodomesticos;
import Entidad.Lavadora;
import Entidad.Televisor;
import java.util.Scanner;

/**
 *
 * @author castr
 */
public class ElectrodomesticosService {
    private Scanner leer;
    private Scanner leer2;
    private Electrodomesticos e =new Electrodomesticos();
    public ElectrodomesticosService() {
        this.leer=new Scanner(System.in);
        this.leer2 =new Scanner(System.in);
    }

   
////    public Electrodomesticos crearElectrodomesticos(){
////        System.out.println("Ingrese el peso");
////        int peso=(leer.nextInt());
////        System.out.println("Ingrese el color {blanco, negro, rojo, azul, gris}");
////        String color=(leer2.next());
////        System.out.println("Ingrese el consumo {A,B,C,D,E,F}");
////        char letra=(leer2.next().charAt(0));
////        System.out.println("INgrese el precio");
////        double precio=(leer.nextDouble());
////        
////        return new Electrodomesticos(precio,comprobarColor(color) , comprobarConsumoEnergetico(letra), peso);
////    }
//    public Lavadora crearLavadora(){
//        Electrodomesticos lava = crearElectrodomesticos();
//        System.out.println("Ingrese la carga");
//        int carga=leer.nextInt();
//        return new Lavadora(lava.getPrecio(), lava.getColor(), lava.getConsumo(), lava.getPeso(), carga);
//    }
//    public Televisor crearTelevisor(){
//        Electrodomesticos tele= crearElectrodomesticos();
//        System.out.println("INgrese la resolucion");
//        int resolucion=leer.nextInt();
//        System.out.println("Tiene TDT?");
//        String entrada = leer2.next();
//        boolean TDT=entrada.matches("[SsNn]");
//        return new Televisor(tele.getPrecio(), tele.getColor(), tele.getConsumo(), tele.getPeso(), resolucion, TDT);
//        
//    }
   
}
