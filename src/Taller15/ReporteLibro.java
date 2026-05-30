package Taller15;

public class ReporteLibro {
    public void generarReporte(Libro libro) {
        System.out.println("=== REPORTE DE LIBRO ===");
        System.out.println("Titulo: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("========================");
    }
}
