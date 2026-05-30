package Taller15;

public class PruebasTaller15 {

    public static void main(String[] args) {
        // 1. Creamos el objeto con sus datos puros
        Libro miLibro = new Libro("Cien Anos de Soledad", "Gabriel Garcia Marquez");
        
        // 2. Usamos el gestor de reportes cuando necesitemos imprimir
        ReporteLibro generadorReportes = new ReporteLibro();
        generadorReportes.generarReporte(miLibro);
        
        // 3. Usamos el gestor de persistencia cuando necesitemos guardar
        PersistenciaLibro baseDeDatos = new PersistenciaLibro();
        baseDeDatos.guardar(miLibro);
    }
    
}
