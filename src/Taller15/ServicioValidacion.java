package Taller15;

public class ServicioValidacion {
    public boolean validarDatos(Usuario usuario) {
        if (usuario.getNombreUsuario() != null && usuario.getContrasena() != null && usuario.getContrasena().length() >= 8) {
            System.out.println("Validacion aprobada: Los datos del usuario cumplen con las politicas.");
            return true;
        }
        System.out.println("Validacion rechazada: La contrasena no cumple con los requisitos minimos.");
        return false;
    }
}
