package metodoconstructor;

import java.util.Scanner;

public class SinConstructor {
    private Scanner entrada = new Scanner(System.in);  // pedir datos al usuario
    String nombre = ""; // variable
    public void PedirNombre(){   // crearemos metodo que va ha suplir la funcion del constructor.
        System.out.println("¿ cual es tu nombre");
        nombre = entrada.nextLine(); // utilizamos nextline por que es string.
    }
    public void imprimir (){
        System.out.println("tu nombre es :  " + nombre);
    }


}
