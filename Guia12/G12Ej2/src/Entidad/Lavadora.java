/*
Lavadora, con el atributo carga,
además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de los atributos heredados. Recuerda que debes
llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set del atributo carga.
• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.
 */
package Entidad;

/**
 *
 * @author castr
 */
public class Lavadora extends Electrodomesticos{
    protected int carga;

    public Lavadora() {
    }

    public Lavadora(double precio, String color, char consumo, int peso, int carga) {
        super(precio, color, consumo, peso);
        super.comprobarColor(color);
        super.comprobarConsumoEnergetico(consumo);
        this.carga=carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    
    
    
    @Override
    public double precioFinal() {
        double plus = super.precioFinal();
        if (carga > 30) {
            plus += 500;
        }
        return (double) plus;
    }

    @Override
    public String toString() {
        return "Lavadora{" + 
                "carga=" + carga + " "+
                super.toString()+ '}';
    }
   
}
