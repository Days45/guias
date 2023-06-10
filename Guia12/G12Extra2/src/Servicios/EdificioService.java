/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Edificio;
import Entidades.EdificioDeOficinas;
import Entidades.Polideportivo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author castr
 */
public class EdificioService {
    private Scanner leer;

    public EdificioService() {
        this.leer = new Scanner(System.in);
    }
    public void crearPolideportivo(ArrayList<Edificio> edi) {
        for (int i = 0; i < 2; i++) {
            System.out.println("crear edificio polideportivo");
            System.out.println("Ancho: ");
            double ancho = leer.nextDouble();
            System.out.println("Alto: ");
            double alto = leer.nextDouble();
            System.out.println("Largo: ");
            double largo = leer.nextDouble();
            System.out.println("Nombre: ");
            String nombre = leer.next();
            System.out.println("Tipo De Instalación:(true:techo/salse:abierto)");
            boolean tipoInstalacion = leer.nextBoolean();

            edi.add(new Polideportivo(ancho, alto, largo, nombre, tipoInstalacion));
        }
    }

    public void crearEdiOfice(ArrayList<Edificio> edi) {
       
        for (int i = 0; i < 2; i++) {
             System.out.println("Crear edificio de oficinas");
            System.out.println("Ancho: ");
            double ancho = leer.nextDouble();
            System.out.println("Alto: ");
            double alto = leer.nextDouble();
            System.out.println("Largo: ");
            double largo = leer.nextDouble();
            System.out.println("Numero de oficinas: ");
            int oficinas = leer.nextInt();
            System.out.println("Numero de personas por oficina: ");//linea 56
            int perOfice = leer.nextInt();
            System.out.println("Numero de pisos: ");
            int numPisos = leer.nextInt();
            edi.add(new EdificioDeOficinas(ancho, alto, largo, oficinas, perOfice, numPisos));
            
        }
    }
    public void mostrar(ArrayList<Edificio> edi){
        for (Edificio i : edi) {
            if (i instanceof Polideportivo) {
                System.out.println("PoliDeportivo{ "+i.toString());
            }else if (i instanceof EdificioDeOficinas) {
                System.out.println("Edificio De Oficinas{ "+i.toString());
            }
        }
    }
}
