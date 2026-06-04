package Taller19;

public class PruebaAutenticacion {

    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE AUTENTICACIÓN (CUMPLIENDO DIP) ===");

        // 1. Probamos con la autenticación local
        System.out.println("\n--- Estrategia: Local ---");
        ServicioAuntenticacion servicioLocal = new AutenticacionLocal();
        GestorAunteticacion gestorLocal = new GestorAunteticacion(servicioLocal);
        
        gestorLocal.iniciarSesion("admin_andres", "1234"); // Éxito
        gestorLocal.iniciarSesion("admin_andres", "0000"); // Fallo

        // 2. Probamos con la autenticación OAuth
        System.out.println("\n--- Estrategia: OAuth ---");
        ServicioAuntenticacion servicioOAuth = new AutenticacionOAuth();
        // Reutilizamos la misma clase GestorAutenticacion, pero inyectándole otro comportamiento
        GestorAunteticacion gestorOAuth = new GestorAunteticacion(servicioOAuth);
        
        gestorOAuth.iniciarSesion("andres_google", "auth-998877"); // Éxito
        gestorOAuth.iniciarSesion("andres_google", "invalid-token"); // Fallo

        System.out.println("\n=================================================");
    }
    
}
