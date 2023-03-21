/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro34y5;

import java.util.Scanner;

/**
 *
 * @author castr
 */
public class extra3 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        String letra="x";
      do{
        System.out.println("Ingrese una letra");
        letra= leer.nextLine();
        if(letra.equals("a")|| letra.equals("e")|| letra.equals("i")|| letra.equals("o")|| letra.equals("u") ){
            continue;
        }else{
            System.out.println("No es vocal");
            break;
        }
      }while(letra.length()==1);
    }
    
}
