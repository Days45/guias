/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j4;

import j4.Servicios.FechaService;
import java.util.Date;

/**
 *
 * @author castr
 */
public class J4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FechaService fs = new FechaService();
        Date fechaNacimiento= fs.fechaNacimiento();
        Date fachaActual=fs.fechaActual();
        System.out.println("Tu edad: "+fs.diferencia(fechaNacimiento, fachaActual)+" años");
        
    }
    
}
