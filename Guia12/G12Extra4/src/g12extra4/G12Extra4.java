package g12extra4;

import Servicios.PersonaService;
import Servicios.EstudianteService;
import Servicios.ProfeService;
import Servicios.PersonalService;
import Servicios.EmpleoService;
import java.util.Scanner;

public class G12Extra4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PersonaService p = new PersonaService();
        PersonalService c = new PersonalService();
        EmpleoService d = new EmpleoService();
        EstudianteService a = new EstudianteService();
        ProfeService b = new ProfeService();
        
        p.crearObjetosClasesHijas();
        p.menu();


    }
}

