/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como atributos, un vector 
con la palabra a buscar, la cantidad de letras encontradas y la cantidad jugadas máximas que puede realizar el usuario.
 */
package je2.entidad;

/**
 *
 * @author castr
 */
public class Ahorcado {
    private char [] vector;
    private int encontradas; //letras encontradas
    private int juegos;

    public Ahorcado() {
    }

    public Ahorcado(char[] vector, int encontradas, int juegos) {
        this.vector = vector;
        this.encontradas = encontradas;
        this.juegos = juegos;
    }

    public char[] getVector() {
        return vector;
    }

    public void setVector(char[] vector) {
        this.vector = vector;
    }

    public int getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }

    public int getJuegos() {
        return juegos;
    }

    public void setJuegos(int juegos) {
        this.juegos = juegos;
    }
    
}
