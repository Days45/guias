/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra2;

import Servicios.ServiciosCine;

/**
 *
 * @author castr
 */
public class Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServiciosCine sc=new ServiciosCine();       

         sc.crearEspectador();
         System.out.println(" ");
         sc.imprimir();
         System.out.println(" ");
         sc.imprimiLista();

        
    }
    
}
