package javaCharlyCimino;

/**
 * 1. comportamiento de un objeto: metodos en java.
 * 2. creamos un objeto cuenta bancaria, en la clase principal.
 * 3. los objetos tienen comportamientos , creamos un metodo
 */
public class CuentaBancaria {
/**
 * atributos
 */
//__________________________________________________________________________________________________
String cbu; // clave bancaria uniforme
String alias;
double saldo;
//___________________________________________________________________________________________________
// 3. creamos un metodo
    void mostrarDatos(){
        System.out.println(cbu  +   " "   +  alias  +   " "   +  saldo);
    }


}
