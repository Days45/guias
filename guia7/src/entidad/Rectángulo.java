/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un método "calcular_area" que calcule y 
devuelva el área del rectángulo.
Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados de 4 y 6 y imprime el área del rectángulo.

 */
package entidad;



/**
 *
 * @author castr
 */
public class Rectángulo {
    private float lado1;
    private float lado2;

    public Rectángulo() {
    }

    public Rectángulo(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public float getLado1() {
        return lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }
    public float calcular_area()  {
        float Area = lado1*lado2;
        return Area;     
    }
}
