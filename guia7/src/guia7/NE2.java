/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7;

import entidad.Estudiante;

/**
 *
 * @author castr
 */
public class NE2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante[] alumnos = new Estudiante[3];
       
        for (int i = 0; i <alumnos.length; i++) {
          Estudiante Alumno=new Estudiante();  
          Alumno.calcularNota();
          alumnos[i]=Alumno;
        }
        for (Estudiante alumno : alumnos) {
            System.out.println(alumno.toString());
        }
        
        
        
    }
    
}
