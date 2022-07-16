package javaCharlyCimino;

/**
 * 1. comportamiento de un objeto: metodos en java.
 * 2. creamos un objeto cuenta bancaria, en la clase principal.
 * 3. los objetos tienen comportamientos , creamos un metodo
 * 4. creamos un metodo con retorno
 * 5. creamos metodos con parametros ( depositar).
 * 6. creamos un metodo que devuelva algo y que tambien reciba parametros ( saldo disponible).
 * 7. metodo extraer
 */
public class CuentaBancaria {
/**
 * atributos
 */
//__________________________________________________________________________________________________
 private String cbu; // clave bancaria uniforme; mejoramos con accesibilidad
 private String alias;
 private double saldo;
//___________________________________________________________________________________________________
// 3. creamos un metodo ( mostrar datos)
    void mostrarDatos(){
        System.out.println(cbu  +   " "   +  alias  +   " "   +  saldo);
    }
//_____________________________________________________________________________________________
 // 4. creamos un metodo con retorno
 double obtenerSaldo (){
 return saldo;
 }
 //_______________________________________________________________________________
 // establecer alias

 void establecerAlias(String nuevoAlias){
       if (nuevoAlias !=null){
           alias= nuevoAlias;
       }
 //__________________________________________________________________________________
 }
 //obtener alias
    String obteneralias(){
        return  alias;
    }

 // 5. metodo depositar con parametros.
    void depositar(double monto){
        if (monto >0){
            saldo = saldo + monto; // o saldo +=monto
        }

    }
//6.  saldo disponible
boolean saldoDisponible(double monto){
        return saldo >= monto;
}
// metodo extraer
void extraer (double monto){
        if (saldoDisponible(monto)){
            saldo -= monto;
        }
}

}
