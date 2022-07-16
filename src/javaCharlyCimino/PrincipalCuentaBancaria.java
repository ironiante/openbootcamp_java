package javaCharlyCimino;

public class PrincipalCuentaBancaria {
    public static void main(String[] args) {
// creamos un objeto cuenta bancaria.
CuentaBancaria cb= new CuentaBancaria();
cb.mostrarDatos();
cb.establecerAlias("jirman");
cb.mostrarDatos();
cb.establecerAlias(null);
cb.mostrarDatos();
String a = cb.obteneralias(); // pedir solo el alias sin pasar por el metodo datos
        System.out.println(a);
















//__________________________________________________________________________
/* cb.mostrarDatos(); // este llamado del metodo por medio del objeto creado.
cb.cbu ="2500000000000";
cb.alias = "mi cuenta";
cb.mostrarDatos();

double x = cb.obtenerSaldo(); // creamos una variable para guardar saldo y despues lo imprimimos.
System.out.println(x);
cb.depositar(200);
        cb.mostrarDatos();
        cb.depositar(-800);
        cb.obtenerSaldo();
// hacemos la consulta y prueba del saldo disponible.
        System.out.println(cb.saldoDisponible(100));
        System.out.println(cb.saldoDisponible(300));
// probamos metodo extraer
cb.extraer(180);
        System.out.println(cb.obtenerSaldo());
        cb.extraer(100);
        System.out.println(cb.obtenerSaldo()); */



    }
}
