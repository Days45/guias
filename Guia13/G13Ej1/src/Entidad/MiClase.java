/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
 */
package Entidad;

/**
 *
 * @author castr
 */
public class MiClase {
    private int[] array;

    public MiClase(int size) { //pido que me pase el tamaño del vector
        this.array = new int[size];
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
    public int getNumber(int index) {
        return array[index];
    }
    public void nose(int i, int u){
        try {
            array[i]=u;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Excepción capturada: Índice de arreglo fuera de rango.");
        }
        //ArrayIndexOutOfBoundsException: Esta excepción se lanza cuando se intenta acceder a un 
        //índice fuera de los límites de un arreglo (array). 
        //Se utiliza cuando se intenta acceder a un índice que no existe en el arreglo.
    }
    
}
