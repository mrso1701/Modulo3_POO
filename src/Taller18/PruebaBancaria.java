package Taller18;

public class PruebaBancaria {

    public static void main(String[] args) {
        System.out.println("=== SISTEMA BANCARIO (CUMPLIENDO ISP) ===\n");

        System.out.println("--- Usando el Cajero Basico ---");
        Retirable cajero = new CajeroAutomatico();
        cajero.retirar(150.0);
        // cajero.transferir(); // Error de compilación: El cajero no conoce esta operación.

        System.out.println("\n--- Usando el Kiosco de Pagos ---");
        Pagable kiosco = new PagoFacturas();
        kiosco.pagarFactura("ELEC-998877");

        System.out.println("\n--- Usando la App Móvil ---");
        // La App tiene acceso a todas las operaciones
        AppMovil app = new AppMovil();
        app.transferir(500.0, "0099881122");
        app.pagarFactura("AGUA-112233");
        app.retirar(100.0);

        System.out.println("\n=========================================");
    }
    
}
