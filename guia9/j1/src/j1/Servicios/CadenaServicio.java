/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.Servicios;

import j1.Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author castr
 */
public class CadenaServicio {
        Scanner leer = new Scanner(System.in);
    //Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
    public void mostrarVocales(Cadena fc){
        int c=0;
        for (int i = fc.getLongitud()-1; i >=0; i--) {
            //trae la frase y la descompone para evaluar cada letra en mayus
            switch(fc.getFrase().substring(i, i+1).toLowerCase()){ 
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    c++;
            }
        }
        System.out.println("vocales: "+c);
    }
//Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca",
//Salida: "acnalb asac".
    public void invertirFrase(Cadena fc){
        String fraseInvertida="";
        for (int i = fc.getLongitud()-1; i >=0; i--) {
            fraseInvertida+=fc.getFrase().charAt(i); 
//charAt(indice) es una funcion de String que devuelve el caracter ubicado en la posicion indice de la cadena
        }
        System.out.println("Frase Invertida: "+fraseInvertida);
    }
//Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se 
//repite el carácter en la frase, por ejemplo:
//Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    public int vecesRepetido(Cadena fc) {
        System.out.println("Ingrese la letra a buscar");
        String buscada = leer.next();
        int repet = 0;
        for (int i = fc.getLongitud() - 1; i >= 0; i--) {
            String letra = fc.getFrase().substring(i, i + 1);
            if (letra.equals(buscada)) {
                repet++;
            }
        }
        return repet;
    }
//Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva 
//frase ingresada por el usuario.
    public boolean compararLongitud(Cadena fc, String frase2){
        return (fc.getLongitud()==frase2.length());
    }
//Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada
//por el usuario y mostrar la frase resultante.
    public void unirFrases(Cadena fc,String nuevaFrase){
        String  cadena=fc.getFrase().concat(nuevaFrase);
        System.out.println(cadena);
    }
//Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún 
//otro carácter seleccionado por el usuario y mostrar la frase resultante.
    public String reemplazar(Cadena fc, String car){
        String cripto= "";
        for (int i = 0; i < fc.getLongitud(); i++) {
            String letra= fc.getFrase().substring(i, i+1);
            if (letra.equals("a")) {
                cripto=cripto.concat(car);
            }else{
                cripto=cripto.concat(letra);
            }
        }
        return cripto;
    }
//Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve 
//verdadero si la contiene y falso si no.
    public boolean contiene(Cadena fc, String letra){
        return fc.getFrase().contains(letra);//contains comprueba si una secuencia de caracteres es parte de una cadena
    }
}
