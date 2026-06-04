package Taller19;

public class AutenticacionOAuth implements ServicioAuntenticacion {
    @Override
    public boolean autenticar(String usuario, String token) {
        System.out.println("Conectando con el servidor OAuth externo...");
        // Lógica simulada: Acepta si el token empieza con "auth-"
        return token.startsWith("auth-");
    }
}
