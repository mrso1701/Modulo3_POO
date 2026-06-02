package Taller18;

public class AppMovil implements Transferible, Retirable, Pagable {
    @Override
    public void transferir(double monto, String cuentaDestino) {
        System.out.println("App Movil: Transfiriendo $" + monto + " a la cuenta " + cuentaDestino);
    }

    @Override
    public void retirar(double monto) {
        System.out.println("App Movil: Generando codigo sin tarjeta para retirar $" + monto);
    }

    @Override
    public void pagarFactura(String codigoFactura) {
        System.out.println("App Movil: Escaneando y pagando la factura #" + codigoFactura);
    }
}
