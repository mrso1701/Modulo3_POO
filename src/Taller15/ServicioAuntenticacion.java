package Taller15;

public class ServicioAuntenticacion {
    public boolean iniciarSesion(Usuario usuario, String intentoUser, String intentoPass) {
        if (usuario.getNombreUsuario().equals(intentoUser) && usuario.getContrasena().equals(intentoPass)) {
            System.out.println("Autenticacion exitosa: Bienvenido al sistema, " + intentoUser + ".");
            return true;
        }
        System.out.println("Error de autenticacion: Usuario o contrasena incorrectos.");
        return false;
    }
}
