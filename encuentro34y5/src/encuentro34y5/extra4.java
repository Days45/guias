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
public class extra4 {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero entre el 1 y el 10 ");
        numero=leer.nextInt();
        switch(numero){
            case 1:
                System.out.println("1 = I");
                break;
            case 2:
                System.out.println("2 = II");
                break;
            case 3:
                System.out.println("3 = III");
                break;
            case 4:
                System.out.println("4 = IV");
                break;
            case 5:
                System.out.println("5 = V");
                break;
            case 6:
                System.out.println("6 = VI");
                break;
            case 7:
                System.out.println("7 = VII");
                break;
            case 8:
                System.out.println("8 = VIII");
                break;
            case 9:
                System.out.println("9 = IX");
                break;
            case 10:
                System.out.println("10 = X");
                break;
            default:
                break;
            
        }
    }
    
}
