package Taller19;

public class GestorArchivos {
    private Almacenamiento almacenamiento;

    // Inyección de dependencias mediante el constructor
    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    // Método que utiliza el contrato sin saber cómo está implementado por debajo
    public void procesarYGuardar(String nombre, String contenido) {
        System.out.println("\n[Gestor] Iniciando proceso para el archivo: " + nombre);
        almacenamiento.guardarArchivo(nombre, contenido);
        System.out.println("[Gestor] Proceso de guardado finalizado con éxito.");
    }

    public void leerArchivo(String nombre) {
        String datos = almacenamiento.recuperarArchivo(nombre);
        System.out.println("[Gestor] Lectura: " + datos);
    }
}
