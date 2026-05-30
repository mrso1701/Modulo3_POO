package Taller15;

public class UsuarioContexto {
    private String nombreUsuario;
    private String contrasena;

    public UsuarioContexto(String nombreUsuario, String contrasena) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }

    // Responsabilidad 1: Manejar los datos
    public String getNombreUsuario() { return nombreUsuario; }
    public String getContrasena() { return contrasena; }

    // Responsabilidad 2: Logica de validacion
    public boolean validarFormato() {
        if(nombreUsuario != null && contrasena != null && contrasena.length() >= 8) {
            System.out.println("El formato de los datos es correcto.");
            return true;
        }
        System.out.println("Error: La contrasena debe tener minimo 8 caracteres.");
        return false;
    }

    // Responsabilidad 3: Logica de autenticacion
    public boolean iniciarSesion(String userIntento, String passIntento) {
        if(this.nombreUsuario.equals(userIntento) && this.contrasena.equals(passIntento)) {
            System.out.println("Inicio de sesion exitoso.");
            return true;
        }
        System.out.println("Credenciales incorrectas.");
        return false;
    }
}
