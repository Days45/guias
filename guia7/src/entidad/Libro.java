/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author castr
 */
////Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, Número de páginas, 
//y un constructor con todos los atributos pasados por parámetro y un constructor vacío. 
////Crear un método para cargar un libro pidiendo los datos al usuario y luego informar mediante otro método
//el número de ISBN, el título, el autor del libro y el número de páginas.
public class Libro {
    public int ISBN;
    public String titulo;
    public String autor;
    public int cantPg;

    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int cantPg) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.cantPg = cantPg;
    }
    public int getISBN(){ //get se utilizan para consultar el estado de un objeto
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getCantPg() {
        return cantPg;
    }
    
    public void setISBN(int ISBN){// los métodos set para modificar su estado
       this.ISBN=ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setCantPg(int cantPg) {
        this.cantPg = cantPg;
    }
    
    public void cargar(){
        Scanner leer =new Scanner(System.in);
        System.out.println("ingrese el isbn del libro");
        this.ISBN=leer.nextInt();
        System.out.println("Ingrese el titulo");
        this.titulo=leer.next();
        System.out.println("Ingrese el nombre del Autor");
        this.autor=leer.next();
        System.out.println("Ingrese el numero de paginas");
        this.cantPg=leer.nextInt();
    }
    public void mostrar(){
        System.out.println("ISBN: "+ISBN);
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Cantidad de paginas: "+cantPg);
    }
    
}
