/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Nos piden hacer un programa sobre un Cine,
Para representar la sala con los espectadores vamos a utilizar una matriz. Los asientos son
etiquetados por una letra y un número la fila A1 empieza al final del mapa como se muestra en
la tabla. También deberemos saber si el asiento está ocupado por un espectador o no, si esta
ocupado se muestra una X, sino un espacio vacío.
 */
package Servicios;

import Entidad.Cine;
import Entidad.Espectador;
import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author castr
 */
public class ServiciosCine {

    private Scanner leer;
    private ArrayList<Espectador> entran;
    private Cine cine;
    private ArrayList<Espectador> reachazados ;

    public ServiciosCine() {
        this.leer = new Scanner(System.in);
        this.cine = new Cine();
        this.reachazados = new ArrayList<>();
        this.entran=new ArrayList<>();
    }
////Me da paja pasar usuarios por teclado asi que agregue varios :b
    public void crearEspectador() {
        entran.add(new Espectador("DANIEL", 39, 1500.50));
        entran.add(new Espectador("BENJAMIN", 8, 800.50));
        entran.add(new Espectador("CARINA", 41, 5000.50));
        entran.add(new Espectador("LAURA", 35, 950.5));
        entran.add(new Espectador("IVAN", 26, 2000.5));
        entran.add(new Espectador("BIANCA", 13, 700.5));
        entran.add(new Espectador("FERNANDA", 18, 1000.5));
        entran.add(new Espectador("LEANDRO", 22, 2300.5));
        entran.add(new Espectador("PAMELA", 20, 800.5));
        entran.add(new Espectador("JAVIER", 29, 650.5));
        entran.add(new Espectador("GABRIEL", 6, 1100.5));
        entran.add(new Espectador("LUCIO", 15, 20000.5));
        entran.add(new Espectador("CHUNG", 96, 700.5));
        entran.add(new Espectador("CARLOS", 52, 3300.5));
        entran.add(new Espectador("ELIANA", 30, 1300.5));
        entran.add(new Espectador("JUAN", 12, 1200.5));
        entran.add(new Espectador("FRANCO", 29, 2600.5));
        entran.add(new Espectador("ANDREA", 21, 4300.5));
        entran.add(new Espectador("ERIKA", 31, 2900.5));
        entran.add(new Espectador("LUCAS", 51, 400.5));
        entran.add(new Espectador("CARLA", 50, 990.5));
        entran.add(new Espectador("FLORENCIA", 21, 800.5));
        entran.add(new Espectador("JORGE", 19, 780.5));
        entran.add(new Espectador("MAXIMILIANO", 19, 880.5));
        entran.add(new Espectador("FACUNDO", 48, 10000.5));
        Collections.shuffle(entran);

    }
    //crear la peli
    public void crearPelicula() {
        System.out.println("Ingrese el titulo de la peli");
        String titulo = leer.next();
        System.out.println("Ingrese la duracion de la peli");
        double duracion = leer.nextDouble();
        System.out.println("Ingrese la edad minima");
        int edadM = leer.nextInt();
        System.out.println("Nombre del Director");
        String nombre = leer.next();
        Pelicula p = new Pelicula(titulo, duracion, edadM, titulo);
        cine.setPeli(p);         
    }
//creamos la sala vacia primero
    public void crearSala() {
        crearPelicula();
        System.out.println(cine.getPeli());
        cine.setEntrada(500.60);
        String[][] matri = new String[8][6];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                matri[i][j] = " ";
            }
        }
        cine.setSalita(matri); 
    }
//verificar que los interesados en ver la peli tengsn la edad y el dinero minimo o lo superen... si cumplen asignar en ese espacio x 
    public void ocupado() {
        crearSala();
        Iterator<Espectador> it = entran.iterator();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                if (it.hasNext()) {
                    Espectador espi = it.next();
                    if (espi.getEdad() > cine.getPeli().getEdadM() && espi.getPlata() > cine.getEntrada()) {
                        cine.getSalita()[i][j] = "X";
                    } else {
                        
                        reachazados.add(espi);
                    }
                }
            }
        }
        
    }
//imprimir con la posicion numero y letra mas si esta ocupado o no
    public void imprimir() {
        ocupado();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                switch (j) {
                    case 0:
                        System.out.print("[" + (i + 1) + "A" + cine.getSalita()[i][j] + "] | ");
                        break;
                    case 1:
                        System.out.print("[" + (i + 1) + "B" + cine.getSalita()[i][j] + "] | ");
                        break;
                    case 2:
                        System.out.print("[" + (i + 1) + "C" + cine.getSalita()[i][j] + "] | ");
                        break;
                    case 3:
                        System.out.print("[" + (i + 1) + "D"  + cine.getSalita()[i][j] + "] | ");
                        break;
                    case 4:
                        System.out.print("[" + (i + 1) + "E" + cine.getSalita()[i][j] + "] | ");
                        break;
                    case 5:
                        System.out.print("[" + (i + 1) + "F" + cine.getSalita()[i][j] + "] | ");
                        break;
                }
            }
            System.out.println("");
        }
    }
//los que no pudieron entrar para ver la peli
    public void imprimiLista() {
        System.out.println("Total de rechazados: " + reachazados.size());
        reachazados.forEach((no) -> System.out.println(no));
    }
}
