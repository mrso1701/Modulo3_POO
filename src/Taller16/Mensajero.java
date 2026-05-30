package Taller16;

public abstract class Mensajero {
    public void enviarMensaje(String mensaje) {
        System.out.println("Conectando al servidor SMTP de correo...");
        System.out.println("Enviando EMAIL: " + mensaje);
    }
}
