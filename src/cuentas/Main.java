package cuentas;

public class Main {

    public static void main(String[] args) {
        CCuenta nuevaCuenta;
        double saldoActual;

        nuevaCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = nuevaCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        operativa_cuenta(nuevaCuenta, null);
    }

    public static void operativa_cuenta(CCuenta cuenta1, java.lang.Float cantidad) {
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}