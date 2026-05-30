package Taller16;

public class MensajeroPush extends Mensajero {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Procesando envio de NOTIFICACION PUSH...");
        System.out.println("Mensaje: " + mensaje);
    }
}
