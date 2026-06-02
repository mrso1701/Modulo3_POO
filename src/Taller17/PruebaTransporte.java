package Taller17;

public class PruebaTransporte {
    
    // Recibe la abstracción (Transporte) y confía plenamente en que cualquier 
    // subclase ejecutará el método 'moverse' de forma pacífica y correcta.
    public static void gestionarViaje(Transporte transporte) {
        System.out.println("Iniciando los preparativos del viaje...");
        transporte.moverse(); // Sustitución en tiempo de ejecución
        System.out.println("El trayecto se ha completado con exito.");
        System.out.println("------------------------------------------------");
    }
   
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE TRANSPORTE (CUMPLIENDO LSP) ===");
        System.out.println("------------------------------------------------");

        // Polimorfismo: Referencias de la clase base apuntando a objetos derivados
        Transporte miCoche = new Coche();
        Transporte miBicicleta = new Bicicleta();

        // Verificación 1: Sustitución con la clase Coche
        System.out.println("[Prueba 1: Usando Coche]");
        gestionarViaje(miCoche);

        // Verificación 2: Sustitución con la clase Bicicleta
        System.out.println("[Prueba 2: Usando Bicicleta]");
        gestionarViaje(miBicicleta);

        System.out.println("=== VERIFICACION EXITOSA: NINGUN COMPORTAMIENTO FUE ALTERADO ===");
    }
    
}
