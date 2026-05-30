package Taller16;

public class MensajeroSMS extends Mensajero {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Procesando envio de SMS...");
        System.out.println("Mensaje: " + mensaje);
    }
}
