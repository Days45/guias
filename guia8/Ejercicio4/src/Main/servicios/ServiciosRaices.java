/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.servicios;

import Main.entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author castr
 */
/*RaicesServicio las operaciones que se podrán realizar son las siguientes:
Método getDiscriminante(): devuelve el valor del discriminante (double).
El discriminante tiene la siguiente fórmula: (b^2)-4*a*c


Método obtenerRaices(): llama a tieneRaices() y si devolvió́ true, imprime las 2 posibles soluciones.
Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. 
Es en el caso en que se tenga una única solución posible.
Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla las posibles 
soluciones que tiene nuestra ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan 
nuestros métodos y en caso de no existir solución, se mostrará un mensaje.
Nota: Fórmula ecuación 2o grado: {-b±√[(b^2)-(4*a*c)]}/(2*a) Solo varía el signo delante de -b
*/
public class ServiciosRaices {
    Scanner leer = new Scanner(System.in);
    public Raices crear(){
        System.out.println("a: ");
        double a=leer.nextDouble();
        System.out.println("b: ");
        double b=leer.nextDouble();
        System.out.println("c: ");
        double c=leer.nextDouble();
        return new Raices(a, b, c);
    }
    public double getDiscriminante(Raices raiz){
       double discriminante=Math.pow(raiz.getB(), 2)-(4*raiz.getA()*raiz.getC()); 
       return discriminante;
    }
//Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra,
//el discriminante debe ser igual que 0.
    public boolean tieneRaiz(Raices raiz){
        
        if (getDiscriminante(raiz)==0){
            return true;
        }else{
            return false;
        }
    }
    //Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante 
//debe ser mayor o igual que 0.
    public boolean tieneRaices(Raices raiz){
        if (getDiscriminante(raiz)>=0) {
            return true;
        }else{
            return false;
        }
    }
    public void obtenerRaices(Raices raiz){
        double x1, x2, b2,ac4,a2;
        if (tieneRaices(raiz)==true) {
            b2=Math.pow(raiz.getB(), 2);//√((b^2)
            ac4=4*raiz.getA()*raiz.getC();//4*a*c
            a2=2*raiz.getA();//2*a
            x1=((-1)*(raiz.getB())- Math.sqrt(b2-ac4))/a2;
            x2=((-1)*(raiz.getB())+ Math.sqrt(b2-ac4))/a2;
            System.out.println("x1: "+x1);
            System.out.println("x2: "+x2);
        }
    }
    public void obtenerRaiz(Raices raiz){
        double x1, b2,ac4,a2;
        if (tieneRaiz(raiz)==true) {
            b2=Math.pow(raiz.getB(), 2);//√((b^2)
            ac4=4*raiz.getA()*raiz.getC();//4*a*c
            a2=2*raiz.getA();//2*a
            x1=((-1)*(raiz.getB())- Math.sqrt(b2-ac4))/a2;
            System.out.println("x1: "+x1);
        }
    }
    public void calcular(Raices raiz){
        if (tieneRaiz(raiz)==true) {
             System.out.println("Tiene una raiz");
            obtenerRaiz(raiz);
            
        }else if (tieneRaices(raiz)==true ) {
           System.out.println("Tiene dos raices");
            obtenerRaices(raiz);
            
        }else{
            System.out.println("No tiene solución");
        }
    }
}
