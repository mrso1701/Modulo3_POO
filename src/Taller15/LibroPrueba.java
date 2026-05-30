package Taller15;

public class LibroPrueba {
    private String titulo;
    private String autor;

    public LibroPrueba(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // Responsabilidad 1: Conocer su propia informacion
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }

    // Responsabilidad 2: Generar reportes
    public void generarReporte() {
        System.out.println("Generando reporte para el libro: " + titulo);
    }

    // Responsabilidad 3: Guardar en base de datos (Persistencia)
    public void guardarEnBaseDeDatos() {
        System.out.println("Guardando " + titulo + " en la base de datos.");
    }
}
