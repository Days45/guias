/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
En NIFService se dispondrá de los siguientes métodos.
Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le corresponderá.
Una vez calculado, le asigna la letra que le corresponde según
Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en mayúscula;
por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a traves de un método que funciona de la siguiente
manera: Para calcular la letra se toma el resto de dividir el número de DNI por 23 (el resultado debe ser un número 
entre 0 y 22). El método debe buscar en un array (vector) de caracteres la posición que corresponda al resto 
de la división para obtener la letra correspondiente. La tabla de caracteres es la siguiente:
 */
package Menu.servicios;
import Menu.entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author castr
 */
public class NIFService {
    Scanner leer = new Scanner(System.in) ; 
    public NIF crearNif(){
        System.out.println("DNI:");
        int dni=leer.nextInt();
        int resto=dni%23;
        char LNif=' ';
        char [] letra =new char[]{'T','R','W','A','G','M','Y','F','P','D',
            'X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        for (int i = 0; i <= 23; i++) {
            if (resto==i) {
               LNif=letra[i];
            }
        }
        
        
        return new NIF(dni, LNif);
    }
    public void mostrar(NIF nif){
        System.out.println(nif.getDNIs()+"-"+nif.getLetra());
    }
}
