package Taller18;

public class PruebaVehiculo {

    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN DE VEHÍCULOS (CUMPLIENDO ISP) ===\n");

        System.out.println("--- Asignando tareas al Coche Familiar ---");
        Conducible miCoche = new CocheFamiliar();
        miCoche.conducir();
        // miCoche.cargarMercancias(); // ¡Error de compilación! El coche no firmó el contrato de carga, lo cual nos protege de errores lógicos.

        System.out.println("\n--- Asignando tareas al Camión de Carga ---");
        // Referenciamos al camión por su clase concreta para usar ambas habilidades, 
        // o podríamos pasarlo a métodos que requieran 'Cargable' o 'Conducible'.
        CamionDeCarga miCamion = new CamionDeCarga();
        miCamion.cargarMercancias();
        miCamion.conducir();

        System.out.println("\n=========================================================");
    }
    
}
