package estructurascontrol.condicionales;

import java.security.spec.RSAOtherPrimeInfo;

/**
 * primer ejercicio es de seleccion simple.
 * segundo ejercicio es de if .. else o seleccion doble, realiza la accion cuando es verdadera y otra
 *         distinta cuando es falsa.
 */
public class If {
    public static void main(String[] args) {
/**
 * si la calificacion del estudiante es mayor o igual que 60.
 *   imprimir "aprobado"
 */
        //calificacionEstudiante(); se comento

/**
 * if .. else.
 * si la calificacion del estudiante es mayor o igual que 60
 *     imprimir "aprobado"
 * de lo contrario
 *    imprimir "reprobado"
 *      */
        // CalificacionEstudianteIfElse(); se comento

/**
 * instrucciones if ... else anidadas , cuando un programa puede evaluar varios casos colocando instrucciones
 * if.. else dentro de otras instrucciones. ejemplo:
 * - A--> >= 90; B-->rango de 80 a 89; C--> rango de 70 a 79; D--> rango de 60 a 69; F--> demas calificaciones.
 */
       // calificacionesAnidadas(); se comento

/**
 * operador ternario (3 operandos) : java cuenta con operador condicional (?:), en lugar de if else
 * ? --> expresion booleana, true y false.
 * segundo operando --> entre ? y : es el valor de la expresion condicional si la expresion boolena es true.
 * tercer operando --> si la condicion es false.
 */
 // calificacionTernario(); comentado


    }


    //_________________________________________________________________________________________
    private static void calificacionEstudiante() {
        double calificacion = 61;
        if (calificacion >= 60) {
            System.out.println("aprobado");
        }
//___________________________________________________________________________________________
    }

    private static void CalificacionEstudianteIfElse() {
        double calificacion2 = 10;
        if (calificacion2 >= 60) {
            System.out.println("aprobado");
        } else {
            System.out.println("Reprobado");
        }
    }
//_______________________________________________________________________________________________

    private static void calificacionesAnidadas() {
        double calificacion3 = 90.5;
        if (calificacion3 >= 90) {
            System.out.println(" A");
        } else {
            if (calificacion3 >=80){
                System.out.println("B");
            } else {
                if (calificacion3 >=70){
                    System.out.println(" C");
                } else {
                    if (calificacion3 >=60){
                        System.out.println(" D");
                    } else {
                        System.out.println(" F");
                    }
                }

            }

        }


    }
//______________________________________________________________________________________________

    private static void calificacionTernario() {
        double calificacion4 = 61;
        System.out.println(calificacion4 >=60 ? "aprobado" :"reprobado");

    }

//_______________________________________________________________________________________________
}