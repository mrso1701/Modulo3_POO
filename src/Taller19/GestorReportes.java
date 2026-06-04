package Taller19;

public class GestorReportes {
    private GeneradorReporte generador;

    // El constructor recibe cualquier cosa que sea un "GeneradorReporte"
    public GestorReportes(GeneradorReporte generador) {
        this.generador = generador;
    }

    // El gestor hace su lógica de negocio y delega la creación del archivo
    public void procesarYGenerar(String datos) {
        System.out.println("\n[Gestor] Recopilando métricas y analizando datos...");
        generador.generar(datos);
        System.out.println("[Gestor] Reporte generado y distribuido exitosamente.");
    }
}
