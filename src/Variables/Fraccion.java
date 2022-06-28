package Variables;

/**
 * ambito de las variables:
 * - locales: son declaradas dentro de un metodo(incluyen las variables declaradas en la linea de parametros.
 *            solo son visibles dentro del metodo en que fueron declaradas.
 * - de instancia:
 * - de clase:
 */
public class Fraccion {
    public int num;
    public int den;

    public Fraccion (int n,int d){
        num = n;
        den = d;
    }

}
