package javaCharlyCimino;

public class PrincipalCuentaBancaria {
    public static void main(String[] args) {
// creamos un objeto cuenta bancaria.
CuentaBancaria cb= new CuentaBancaria();

cb.mostrarDatos(); // este llamado del metodo por medio del objeto creado.
cb.cbu ="2500000000000";
cb.alias = "mi cuenta";
cb.mostrarDatos();

    }
}
