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
        
        System.out.println("\n===========================================\n");
        
        // 1. Creamos el objeto con sus datos base (Impuesto del 19%)
        Producto miProducto = new Producto("Zapatillas Deportivas", 100.0, 19.0);
        
        // 2. Usamos el servicio de calculo para obtener el precio total
        CalculadoraPrecioProducto calculadora = new CalculadoraPrecioProducto();
        double precioVenta = calculadora.calcularPrecioFinal(miProducto);
        
        // 3. Usamos el servicio de impresion para generar la etiqueta
        EtiquetadorProducto etiquetador = new EtiquetadorProducto();
        etiquetador.generarEtiqueta(miProducto, precioVenta);
        
        System.out.println("\n===========================================\n");
         
         
        // 1. Creamos el objeto usuario
        Usuario miUsuario = new Usuario("dev_admin", "Secreta1234");
        
        // 2. Usamos el servicio especializado en validacion
        ServicioValidacion validador = new ServicioValidacion();
        boolean esValido = validador.validarDatos(miUsuario);
        
        // 3. Si la informacion es valida, usamos el servicio de autenticacion
        if (esValido) {
            ServicioAuntenticacion autenticador = new ServicioAuntenticacion();
            
            System.out.println("\n--- Simulando intento fallido ---");
            autenticador.iniciarSesion(miUsuario, "dev_admin", "claveMala");
            
            System.out.println("\n--- Simulando intento exitoso ---");
            autenticador.iniciarSesion(miUsuario, "dev_admin", "Secreta1234");
        }
    }
    
}
