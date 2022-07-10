package grupo24;

public class inicio {

    public static void main(String[] args) {
        /*
        System.out.println("hola mundo");
        System.out.println("Otra linea\n");
//_____________________________________________________________________________________
        //VARIABLES
        int entero;
        entero = 10;
        double decimales = 5.5;
        boolean bandera = true;
        String nombre = "Andrés Quintero";
        char caracter = 'a';

//Concatenando dentro de un print
        System.out.println("Entero-> "+entero);
        System.out.println("Decimales-> "+decimales);
        System.out.println("Bandera-> "+bandera);
        System.out.println("Nombre-> "+nombre);
        System.out.println("Caracter-> "+caracter);

        //OPERACIONES
        double suma;
        suma = 10+10;
        double multiplicacion = 5*10;
        int modulo = 10%2;
        double division = 10/2;
        int resta = 10-5;

        suma += 10;
        multiplicacion *= 2;
        modulo %= 2;
        division /= 2;
        resta -= 2;
        System.out.println("Suma-> "+suma);
        //Incrementa una unidad
        suma++;
        System.out.println("Suma-> "+suma);

        System.out.println("Resta-> "+resta);
        //Decrementa una unidad
        resta--;
        System.out.println("Resta-> "+resta);
        */
        //____________________________________________________________________________________-__
        //   incremental();
        // decremental();
        //operadores_logicos();
        //cadenas();
        libreria_math();

    }

    //Función incremental, esta función no retorna ningún dato (void)
    public static void incremental() {
        System.out.println("--------------------------INCREMENTAL--------------------------");
        int x = 0;
        //Imprimir valor inicial de 'x'
        System.out.println(x);
        //INCREMENTAL
        System.out.println("INCREMENTAL");
        System.out.println(++x);
        System.out.println(++x);

        //POSTINCREMENTAL
        System.out.println("POSTINCREMENTAL");
        System.out.println(x++);
        System.out.println(x);
        x++;
        System.out.println(x);


    }

    public static void decremental() {
        System.out.println("--------------------------DECREMENTAL--------------------------");
        int x = 10;
        //Imprimir valor inicial de 'x'
        System.out.println(x);
        System.out.println("DECREMENTAL");
        System.out.println(--x);
        System.out.println(--x);
        //POSTDECREMENTAL
        System.out.println("POSTDECREMENTAL");
        System.out.println(x--);
        System.out.println(x);


    }

    public static void operadores_logicos() {

        int n1 = 10;
        int n2 = 10;
        int n3 = 5;
        int n4 = 8;
        boolean resultado;

        resultado = n1 == n2;
        System.out.println(resultado);
        resultado = n1 > n3;
        System.out.println(resultado);
        resultado = n4 <= n3;
        System.out.println(resultado);
        resultado = n4 != n3;
        System.out.println(resultado);

    }

    public static void cadenas() {
        System.out.println("--------------------------CONCATENANDO CADENAS--------------------------");
        String mensaje_1 = "Hola mundo";
        String mensaje_2 = "UTP MISION TIC 2022";
        int n1 = 10;
        double n2 = 3.1416;

        String mensaje = mensaje_1 + " " + mensaje_2;
        System.out.println(mensaje);
        mensaje = mensaje_1 + " " + n1;
        System.out.println(mensaje);

        mensaje = mensaje_2 + " " + n2;
        System.out.println(mensaje);
        //-------
        //Obtener Tamaño del String
        int tamanio = mensaje_1.length();
        System.out.println(tamanio);
        //Obtener caracter a partir de su posición
        char caracter = mensaje_1.charAt(5);
        System.out.println("Caracter -> " + caracter);
        //Obtener posición de un caracter (retorna -1 en caso de no contener el caracter)
        int index = mensaje_1.indexOf('o');
        System.out.println(index);

        mensaje_1 = "HOLA";
        mensaje_2 = "hola";
        //Igualar cadena de caracteres (Strings) equals diferencia entre mayúsculas y minúsculas
        boolean igual = mensaje_1.equals(mensaje_2);
        System.out.println("Igual -> " + igual);

        igual = mensaje_1.equalsIgnoreCase(mensaje_2);
        System.out.println("Igual -> " + igual);


    }

    public static void libreria_math() {
        System.out.println("--------------------------LIBRERÍA MATH--------------------------");
        //Elevar a la potencia un número (5 elevado al cuadrado)
        double resultado = Math.pow(5, 2);
        System.out.println("5^2-> " + resultado);
        //Raíz cuadrada de 5
        resultado = Math.sqrt(5);
        System.out.println("Raíz cuadrada de 5-> " + resultado);

    }
}