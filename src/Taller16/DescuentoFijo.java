package Taller16;

public class DescuentoFijo implements Descuento {
    private double montoFijo;

    public DescuentoFijo(double montoFijo) {
        this.montoFijo = montoFijo;
    }

    @Override
    public double aplicarDescuento(double precioOriginal) {
        // Aseguramos que el precio no sea negativo
        if (montoFijo > precioOriginal) {
            return 0.0;
        }
        return precioOriginal - montoFijo;
    }
}
