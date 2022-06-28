package metodoconstructor;

import java.util.Scanner;

public class ConConstructor {
    /**
     * ya no trabajaremos con metodos, usaremos el constructor.
     */
    public ConConstructor(){
        Scanner entrada = new Scanner(System.in);
        String nombre ="";
        System.out.println("¿ cual es tu nombre ?");
        nombre = entrada.nextLine();
        System.out.println(" tu nombre es : " + nombre);
    }
}
