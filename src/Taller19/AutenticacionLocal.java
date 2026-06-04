package Taller19;

public class AutenticacionLocal implements ServicioAuntenticacion{
    @Override
    public boolean autenticar(String usuario, String contrasena) {
        System.out.println("Validando credenciales en la base de datos local...");
        // Lógica simulada: Acepta si la contraseña es "1234"
        return "1234".equals(contrasena);
    }
}
