public class MainCuenta {
    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria("12345", 1000);

        // usar métodos
        cuenta.depositar(500);
        cuenta.retirar(200);

        // usar getter
        System.out.println("Saldo final: " + cuenta.getSaldo());
    }
}