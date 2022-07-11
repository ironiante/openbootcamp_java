package grupo24;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
     /*   // capturar datos por consola
        Scanner entrada = new Scanner(System.in);
        System.out.print(" por favor ingrese su nombre: ");
        // queda a la escucha para capturar datos por teclado
        // capturar un string
        String nombre = entrada.next();
        System.out.print("su nombres es  : " + nombre);

        System.out.println("ingrese su edad:  ");
        int edad = entrada.nextInt();
        System.out.println("por favor ingrese su nota :");
        Double nota = entrada.nextDouble();
        System.out.println(" su nombre es : " + nombre + "\nedad:" + edad + "\nNota:" + nota); */

// probar funcion _____________________________________________________________________________________________
    calcular_numero_suerte();

    }

    /**
     * programa que pida por teclado la fecha de nacimiento de una persona
     */
    public static void calcular_numero_suerte() {
        //Crear objeto scanner para capturar datos por consola
        Scanner entrada = new Scanner(System.in);
        //Capturar el día de nacimiento
        System.out.print("Por favor ingrese día de nacimiento: ");
        int dia = entrada.nextInt();
        //Capturar el mes de nacimiento
        System.out.print("Por favor ingrese mes de nacimiento: ");
        int mes = entrada.nextInt();
        //Capturar el año de nacimiento
        System.out.print("Por favor ingrese año de nacimiento: ");
        int anio = entrada.nextInt();
        //Obtener suma de dia,mes,año
        String suma = "" + (dia + mes + anio);
        //Castear/convertir a entero
        int numero_suerte = Integer.parseInt("" + suma.charAt(0));
        numero_suerte += Integer.parseInt("" + suma.charAt(1));
        numero_suerte += Integer.parseInt("" + suma.charAt(2));
        numero_suerte += Integer.parseInt("" + suma.charAt(3));
        System.out.println("NUMERO DE LA SUERTE-> " + numero_suerte);

    }
}
