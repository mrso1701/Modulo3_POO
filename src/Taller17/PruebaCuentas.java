package Taller17;

public class PruebaCuentas {
    
    public static void procesarRetiroCajero(CuentaBancaria cuenta, double monto) {
        System.out.println("Saldo actual antes del retiro: $" + cuenta.getSaldo());
        
        if (cuenta.retirar(monto)) {
            System.out.println("Retiro aprobado. Se retiraron: $" + monto);
            System.out.println("Nuevo saldo: $" + cuenta.getSaldo());
        } else {
            System.out.println("Retiro rechazado. Fondos insuficientes para el monto: $" + monto);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== SISTEMA BANCARIO (CUMPLIENDO LSP) ===");

        // Creamos una cuenta estándar y una cuenta de ahorros
        CuentaBancaria cuentaNormal = new CuentaBancaria(500.0);
        CuentaAhorros cuentaAhorros = new CuentaAhorros(1000.0, 0.05); // 5% de interés

        System.out.println("\n--- Procesando Cuenta Normal ---");
        procesarRetiroCajero(cuentaNormal, 200.0); // Retiro válido

        System.out.println("\n--- Procesando Cuenta de Ahorros ---");
        // Aplicamos una operación específica de la hija primero
        cuentaAhorros.aplicarInteres(); 
        // Sustitución en acción: el cajero procesa la cuenta de ahorros perfectamente
        procesarRetiroCajero(cuentaAhorros, 300.0); 

        System.out.println("\n--- Probando intento de sobregiro en Ahorros ---");
        // El sistema responde con un 'false' esperado, no con una caída del programa
        procesarRetiroCajero(cuentaAhorros, 5000.0); 

        System.out.println("=========================================");
 
    }
    
}
