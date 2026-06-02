package Taller17;

public class CuentaAhorros extends CuentaBancaria {
    private double tasaInteres;

    public CuentaAhorros(double saldoInicial, double tasaInteres) {
        super(saldoInicial);
        this.tasaInteres = tasaInteres;
    }

    // Nueva funcionalidad: Extiende el sistema sin alterar lo existente
    public void aplicarInteres() {
        double interes = saldo * tasaInteres;
        saldo += interes;
        System.out.println("Intereses aplicados: $" + interes);
    }

    // Cumple LSP: Si decide sobrescribir retirar, mantiene intacto el contrato.
    // No lanza excepciones inesperadas ni restringe el retiro si hay saldo disponible.
    @Override
    public boolean retirar(double monto) {
        // Mantiene la lógica del padre de forma limpia y predecible
        return super.retirar(monto);
    }
}
