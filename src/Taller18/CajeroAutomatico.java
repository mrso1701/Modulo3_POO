package Taller18;

public class CajeroAutomatico implements Retirable{
    @Override
    public void retirar(double monto) {
        System.out.println("Cajero: Procesando el retiro fisico de $" + monto);
    }
}
