package Taller16;

public class DescuentoContexto {
    public double aplicarDescuento(double precio, String tipo, double valor) {
        if (tipo.equals("PORCENTAJE")) {
            return precio - (precio * valor / 100);
        } 
        // Si mañana queremos un descuento fijo, tendriamos que modificar esta clase agregando otro IF:
        // else if (tipo.equals("FIJO")) { return precio - valor; }
        
        return precio;
    }
}
