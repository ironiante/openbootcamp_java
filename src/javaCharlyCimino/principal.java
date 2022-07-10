package javaCharlyCimino;

/**
 * estado es el valor de sus atributos en el instante
 * en que lo estamos consultando
 */
public class principal {
    public static void main(String[] args) {
// creamos un nuevo auto como objeto
     Auto a =   new Auto();
     System.out.println(a.patente  + " "  +  a.color  +  " " + a.kms  +  " " + a.conAire); // para ver el estado
// le damos valores  a los atributos
        a.patente = "ABC1234";
        a.color = "verde";
        a.kms = 500;
        a.conAire = true;
        System.out.println(a.patente  + " "  +  a.color  +  " " + a.kms  +  " " + a.conAire); // para ver el estado
// agregamos otro objeto
        Auto a2 = new Auto();
        a2.patente = "DEF456";
        a2.color = "Azul";
        a2.kms = 150;
        System.out.println(a2.patente  + " "  +  a2.color  +  " " + a2.kms  +  " " + a2.conAire); // para ver el estado

    }
}
