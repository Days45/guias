/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g3;

import g3.service.AlumnoService;

/**
 *
 * @author castr
 */
public class G3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AlumnoService alumno = new AlumnoService();
        alumno.crearAlumno();
        alumno.buscarAlumno();
    }
    
}
