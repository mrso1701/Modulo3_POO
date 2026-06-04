package Taller19;

public class AlmacenamientoNube implements Almacenamiento {
    @Override
    public void guardarArchivo(String nombre, String contenido) {
        System.out.println("NUBE: Subiendo el archivo '" + nombre + "' a los servidores de AWS S3...");
    }

    @Override
    public String recuperarArchivo(String nombre) {
        return "Contenido descargado desde la nube para el archivo: " + nombre;
    }
}
