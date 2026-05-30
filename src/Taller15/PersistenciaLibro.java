package Taller15;

public class PersistenciaLibro {
    public void guardar(Libro libro) {
        // Aqui iria la logica real de conexion a base de datos (SQL, MongoDB, etc)
        System.out.println("Guardando el libro '" + libro.getTitulo() + "' en la base de datos de la biblioteca...");
    }
}
