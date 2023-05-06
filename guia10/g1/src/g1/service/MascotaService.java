/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g1.service;


import java.util.ArrayList;
import static java.util.Collections.sort;
import java.util.Scanner;
import java.util.Iterator;

/**
 *
 * @author castr
 */
public class MascotaService {
    private Scanner leer;
    private ArrayList<String> mascotas;

    public MascotaService() {
        this.leer= new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList();
    }
    public void crearMascota(){
        System.out.println("Ingrese la raza");
        String raza=leer.next();
        mascotas.add(raza);
        
    }
    public void mostrarMascotas(){
        for (String aux : mascotas) {
            System.out.println(aux);
        }
        System.out.println("Cantidad= "+mascotas.size());//Este método retorna el tamaño de una lista / conjunto.
    }
   
    public String ingreso(){
        System.out.println("¿Que perro busca?");
        String buscar=leer.next();
        return buscar;
    }
    public void encontrar(){
        String buscar= ingreso();
        int cont=0;
        Iterator<String>intr = mascotas.iterator() ;
        while (intr.hasNext()) {            
            if (intr.next().equals(buscar)) {
                intr.remove();
                sort(mascotas);
                mostrarMascotas();
            }else{
                cont++;
            }
        }
        if (cont==mascotas.size()) {
            System.out.println("El perro no se encuentra en la lista");
            System.out.println("La lista disponible");
            sort(mascotas);
            mostrarMascotas();
        }  
    }
    //despues 
    public void bucle(){
        
    }
   
}
