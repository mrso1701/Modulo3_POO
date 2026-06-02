package Taller18;

public interface OperacionBancaria {
    void transferir(double monto, String cuentaDestino);
    void retirar(double monto);
    void pagarFactura(String codigoFactura);
}
