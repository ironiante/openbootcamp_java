package Funciones3_1;

/***_________________________________________________________________________________________________
 * segunda sesion:
 * que es una funcion?
 * como se declara y se usa una funcion?
 * parametros?
 * paso de parametros por valor o referencia
 * ambito de una funcion
 * retorno de las funciones
 * como hacer uso del retorno de una funcion?
 * las funciones anonimas
 * sobrecarga de funciones.
 *______________________________________________________________________________________________________
 */
public class Main {
    public static void main(String[] args) { // aca es donde se corre el programa.
// para repetir codigo.
// option 1: vamos hacer un menu que se repita y no retorne nada (void), utilizamos static
     // showmenu();
// option 2: funcion sin parametros y con tipo de retorno.
        // si lo corremos de una no va hacer nada, toca crear una variable y guardarlo ahi e imprimirlo.
     // String menu = getMenu();
     //   System.out.println(menu );

// option 3 ; creamos el llamado y luego hacemos automatico la funcion
  //   double price = getprice();
  //      System.out.println(price);
// option 4 ; funcion con parametros y sin tipo de retorno
//      imprimirSaludosDias("openBootcamp");
// option 5 --> funcion con parametros y con tipo de retorno
 //  String nombre ="jirman  ";
 //  String apellido =" rodriguez";
//   String saludo = obtenerSaludo(nombre,apellido);
  //      System.out.println(saludo);
//____________________________________________________________________________________________________________________
/**
 * la sobre carga de funciones permite duplicar un metodo simpre  y cuando tengan diferentes numeros/ tipo de
 * parametros
 */

    }
  static double suma(double number1,double number2 , double number3){
        return number1 + number2 + number3 ; }
    static int suma(int number1 , int number2 , int number3){
        return number1 + number2;
    }















//_____________________________________________________________________________________________________________________

   static int suma(int number1, int number2) {
        return number1 + number2;
    }

    private static String obtenerSaludo(String nombre,String apellido) {
        return "Buenas tardes" + " " + nombre + apellido ;
    }

    static void imprimirSaludosDias(String nombre) {
         System.out.println("buenas tardes  "    +   nombre  );
    }

    private static double getprice() {
        return 100.99;
    }

    static void showmenu(){ // este es con la option 1
      System.out.println("bienvenido al e-commerce de zapatillas:");
      System.out.println("1 - ver Zapatillas ");
      System.out.println("2 - comprar zapatillas" );
      System.out.println("3 - salir");
  }
  static String getMenu(){ // option 2
        return "Bienvenidos al E - commerce de zapatillas:\n 1 - ver Zapatilas ....  ";


  }
}
