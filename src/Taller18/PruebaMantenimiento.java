package Taller18;

public class PruebaMantenimiento {

    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE MANTENIMIENTO (CUMPLIENDO ISP) ===\n");

        // 1. Tarea exclusivamente de limpieza
        System.out.println("--- Asignando tarea al Conserje ---");
        Limpiable conserje = new PersonalLimpieza();
        conserje.limpiar();
        // conserje.reparar(); // ¡Error de compilación! El conserje no tiene esta habilidad, lo cual es correcto.

        // 2. Tarea exclusivamente de reparación
        System.out.println("\n--- Asignando tarea al Tecnico ---");
        Reparable tecnico = new TecnicoReparacion();
        tecnico.reparar();

        System.out.println("\n=================================================");
    }
    
}
