package Taller16;

public class MensajeroContexto {
    // Si mañana nos piden SMS, tendriamos que modificar este archivo
    public void enviarMensaje(String mensaje, String canal) {
        if (canal.equals("EMAIL")) {
            System.out.println("Enviando correo electronico: " + mensaje);
        } 
        // else if (canal.equals("SMS")) {
        //     System.out.println("Enviando mensaje de texto SMS: " + mensaje);
        // }
        else {
            System.out.println("Canal no soportado.");
        }
    }
}
