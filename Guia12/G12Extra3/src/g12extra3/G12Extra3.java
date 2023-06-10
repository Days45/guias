/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g12extra3;

import Entidades.Alojamiento;
import Servicios.AlojamientoService;
import java.util.ArrayList;

/**
 *
 * @author castr
 */
public class G12Extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        AlojamientoService AS=new AlojamientoService();
        ArrayList<Alojamiento>vacaciones=new ArrayList();
        AS.crearAlojamiento(vacaciones);
        AS.mostrarAlojamiento(vacaciones);
    }
    
}
