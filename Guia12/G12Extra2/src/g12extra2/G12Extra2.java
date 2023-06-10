/*
 Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.
Estos métodos serán abstractos y los implementarán las siguientes clases:
• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.

 */
package g12extra2;

import Entidades.Edificio;
import Entidades.EdificioDeOficinas;
import Entidades.Polideportivo;
import Servicios.EdificioService;
import java.util.ArrayList;

/**
 *
 * @author castr
 */
public class G12Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EdificioService ED = new EdificioService();
        ArrayList<Edificio> edi = new ArrayList<>();
        ED.crearPolideportivo(edi);
        ED.crearEdiOfice(edi);
        System.out.println(" ");
        ED.mostrar(edi);
        int contTa=0;
        int contAb=0;
        System.out.println(" ");
        System.out.println(" ");
        for (Edificio i : edi) {
            if (i instanceof Polideportivo) {
                System.out.println("Polideportivo: ");
                Polideportivo poli = (Polideportivo) i;
                
                System.out.println("Superficie: " + poli.calcularSuperficie() + ", Volumen: " + poli.calcularVolumen());
                if (poli.getTipoInstalacion()) {
                    contTa++;
                } else{
                    contAb++;
                }
                
            } else if (i instanceof EdificioDeOficinas) {
                System.out.println("Edificio de Oficinas: ");
                EdificioDeOficinas edif = (EdificioDeOficinas) i;
                System.out.println(" ");
                System.out.println("Superficie: " + edif.calcularSuperficie()+ ", Volumen: " + edif.calcularVolumen());
                edif.cantPersonas();
            }
        }
        System.out.println(" ");
        System.out.println("Tachados: " + contTa+", No tachados: " + contAb);
        

        /*
Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
*/

    }
    
}
