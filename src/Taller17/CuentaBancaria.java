package Taller17;

public class CuentaBancaria {
    protected double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso de: $" + monto);
        }
    }

    // El contrato promete: devuelve true si se pudo retirar, false si no hay saldo suficiente
    public boolean retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            return true;
        }
        return false; // No cumple los requisitos de saldo, se rechaza pacíficamente
    }

    public double getSaldo() {
        return saldo;
    }
}
