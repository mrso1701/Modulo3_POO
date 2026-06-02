package Taller18;

public class AppMovil implements Transferible, Retirable, Pagable {
    @Override
    public void transferir(double monto, String cuentaDestino) {
        System.out.println("App Móvil: Transfiriendo $" + monto + " a la cuenta " + cuentaDestino);
    }

    @Override
    public void retirar(double monto) {
        System.out.println("App Móvil: Generando código sin tarjeta para retirar $" + monto);
    }

    @Override
    public void pagarFactura(String codigoFactura) {
        System.out.println("App Móvil: Escaneando y pagando la factura #" + codigoFactura);
    }
}
