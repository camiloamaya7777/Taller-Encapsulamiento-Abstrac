public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;

    // Constructor
    public CuentaBancaria(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    // GETTERS
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    // SETTERS
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // MÉTODOS usando get y set
    public void depositar(double cantidad) {
        setSaldo(getSaldo() + cantidad);
    }

    public void retirar(double cantidad) {
        if (getSaldo() >= cantidad) {
            setSaldo(getSaldo() - cantidad);
        } else {
            System.out.println("Fondos insuficientes");
        }
    }
}