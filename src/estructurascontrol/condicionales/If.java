package estructurascontrol.condicionales;

/**
 * seleccion simple,
 */
public class If {
    public static void main(String[] args) {
/**
 * si la calificacion del estudiante es mayor o igual que 60.
 *   imprimir "aprobado"
  */
  calificacionEstudiante();
    }

    private static void calificacionEstudiante() {
        double calificacion = 61;
        if (calificacion >=60){
            System.out.println("aprobado");
        }
    }


}
