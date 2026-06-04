package Taller19;

public class GestorAunteticacion {
    // Dependencia basada en la interfaz
    private ServicioAuntenticacion servicioAutenticacion;
    private final ServicioAuntenticacion servicioAuntenticacion;

    // Inyección de dependencias a través del constructor
    public GestorAunteticacion(ServicioAuntenticacion servicioAuntenticacion) {
        this.servicioAuntenticacion = servicioAuntenticacion;
    }

    public void iniciarSesion(String usuario, String credencial) {
        System.out.println("\nIntentando iniciar sesión para el usuario: " + usuario);
        
        boolean esValido = servicioAutenticacion.autenticar(usuario, credencial);
        
        if (esValido) {
            System.out.println("¡Acceso concedido! Bienvenido al sistema.");
        } else {
            System.out.println("Acceso denegado. Credenciales incorrectas.");
        }
    }
}
