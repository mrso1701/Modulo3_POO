package Taller18;

public class PagoFacturas implements Pagable {
    @Override
    public void pagarFactura(String codigoFactura) {
        System.out.println("Kiosco: Procesando el pago de la factura #" + codigoFactura);
    }
}
