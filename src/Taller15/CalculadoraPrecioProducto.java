package Taller15;

public class CalculadoraPrecioProducto {
    public double calcularPrecioFinal(Producto producto) {
        double montoImpuesto = producto.getPrecioBase() * (producto.getImpuesto() / 100);
        return producto.getPrecioBase() + montoImpuesto;
    }
}
