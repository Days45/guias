/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura.
La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario.
También incluirá un método para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo.
Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura.
Se deberán además definir los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author castr
 */
public class Rectangulo {
    private float base;
    private float altura;

    public Rectangulo() {
    }
    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
   public void crearRectangulo(){
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese la base");
       base=leer.nextFloat();
       System.out.println("ingrese la altura");
       altura=leer.nextFloat();
   } 
   public float superficie(float base, float altura){
       float Superficie = base * altura ;
       return Superficie;
   }
   public float perimetro(float base, float altura){
       float Perímetro = (base + altura) * 2;
       return Perímetro;
   }
   public void dibujo(float base, float altura){
       System.out.println("-----------");
          for (int i = 0; i < altura; i++) { //ira desde 0 hasta el tres
            for (int j = 0; j < base; j++) {//""
                if (i==0 || i==(altura-1)|| j==0 || j==(base-1)) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
             System.out.println('\n');
 
        }
   }
}
