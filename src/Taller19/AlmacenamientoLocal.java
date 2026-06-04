package Taller19;


public class AlmacenamientoLocal implements Almacenamiento {
    @Override
    public void guardarArchivo(String nombre, String contenido) {
        System.out.println("LOCAL: Guardando el archivo '" + nombre + "' en el disco duro (C:/archivos/)...");
    }

    @Override
    public String recuperarArchivo(String nombre) {
        return "Contenido recuperado del disco local para el archivo: " + nombre;
    }
}
