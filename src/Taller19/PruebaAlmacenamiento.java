package Taller19;

public class PruebaAlmacenamiento {

    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE ARCHIVOS (CUMPLIENDO DIP) ===");

        String nombreArchivo = "reporte_financiero_2026.pdf";
        String contenidoSimulado = "010101010101111000";

        // Escenario 1: El usuario decide guardar en su computadora
        System.out.println("\n--- Configurando sistema para ALMACENAMIENTO LOCAL ---");
        Almacenamiento discoLocal = new AlmacenamientoLocal();
        GestorArchivos gestorLocal = new GestorArchivos(discoLocal);
        
        gestorLocal.procesarYGuardar(nombreArchivo, contenidoSimulado);
        gestorLocal.leerArchivo(nombreArchivo);

        // Escenario 2: El usuario decide guardar en la nube
        System.out.println("\n--- Configurando sistema para ALMACENAMIENTO EN LA NUBE ---");
        Almacenamiento googleDrive = new AlmacenamientoNube();
        GestorArchivos gestorNube = new GestorArchivos(googleDrive);
        
        gestorNube.procesarYGuardar(nombreArchivo, contenidoSimulado);
        gestorNube.leerArchivo(nombreArchivo);

        System.out.println("\n============================================");
    }
    
}
