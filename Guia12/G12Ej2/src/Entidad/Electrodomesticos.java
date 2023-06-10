/*

• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.

 */
package Entidad;


/**
 *
 * @author castro
 */
public class Electrodomesticos {
//Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,consumo energético (letras entre A y F) 
//y peso.
    
    protected double precio;
    protected String color;
    protected char consumo;
    protected int peso;
//1.Los constructores que se deben implementar son los siguientes:
//• Un constructor vacío.

    public Electrodomesticos() {
    }
//• Un constructor con todos los atributos pasados por parámetro.

    public Electrodomesticos(double precio, String color, char consumo, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

//2.Los métodos a implementar son:  
    //• Métodos getters y setters de todos los atributos.
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public char comprobarConsumoEnergetico(char letra) {
       letra=Character.toUpperCase(letra);
        if ((letra >= 'A' && letra <= 'F')) {
            this.consumo=letra;
        }else{
            this.consumo='F';
        }
        return this.consumo;
    }

    public String comprobarColor(String color) {
        
        if (color.equalsIgnoreCase("blanco")||color.equalsIgnoreCase("rojo")||color.equalsIgnoreCase("azul")||color.equalsIgnoreCase("negro")||color.equalsIgnoreCase("gris")) {
           this.color=color;
        }else{
            this.color="blanco";
            
        }
        return this.color;
    }

    public double precioFinal() {

        double pesoChi;
        if (peso > 0 && peso < 20) {
            pesoChi = 100;
        } else if (peso > 19 && peso < 50) {
            pesoChi = 500;
        } else if (peso > 49 && peso < 80) {
            pesoChi = 800;
        } else {
            pesoChi = 1000;
        }
        double precios = 0;
        switch (consumo) {
            case 'A':
                precios = 1000 + precio + pesoChi;
                break;
            case 'B':
                precios = 800 + precio + pesoChi;
                break;
            case 'C':
                precios = 600 + precio + pesoChi;
                break;
            case 'D':
                precios = 500 + precio + pesoChi;
                break;
            case 'E':
                precios = 300 + precio + pesoChi;
                break;
            case 'F':
                precios = 100 + precio + pesoChi;
                break;
        }
        return (double) precios;

    }

    @Override
    public String toString() {
        return ""
                + "precio=" + precio
                + ", color=" + color
                + ", consumo=" + consumo
                + ", peso=" + peso;
    }
}
