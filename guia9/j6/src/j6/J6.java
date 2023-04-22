/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j6;

import j6.Entidades.Curso;
import j6.Servicios.CursoService;

/**
 *
 * @author castr
 */
public class J6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CursoService cs= new CursoService();
        Curso c= cs.crearCurso();
        cs.mostrarAlumnos(c);
        cs.calcularGananciaSemanal(c);
    }
    
}
