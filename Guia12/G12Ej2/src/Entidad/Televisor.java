/*
 Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
 */
package Entidad;

/**
 *
 * @author castr
 */
public class Televisor extends Electrodomesticos{
    protected int resolucion;
    protected boolean TDT;

    public Televisor() {
       
    }

    public Televisor(double precio, String color, char consumo, int peso, int resolucion, boolean TDT) {
        super(precio, color, consumo, peso);
        super.comprobarColor(color);
        super.comprobarConsumoEnergetico(consumo);
        this.resolucion=resolucion;
        this.TDT=TDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

  

    @Override
    public double precioFinal() {
        double plus = super.precioFinal();
        if (resolucion > 40) {
            plus += plus * 0.3;
        }
        if (TDT) {
            plus += 500;
        }
        return (double)plus;
    }

    @Override
    public String toString() {
        return "Televisor{" + 
                "resolucion=" + resolucion +
                ", TDT=" + TDT + ", "+
                super.toString()+ '}';
    }
    
    
}
