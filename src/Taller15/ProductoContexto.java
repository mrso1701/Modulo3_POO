package Taller15;

public class ProductoContexto {
    private String nombre;
    private double precioBase;
    private double impuesto;

    public ProductoContexto(String nombre, double precioBase, double impuesto) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.impuesto = impuesto;
    }

    // Responsabilidad 1: Manejar datos
    public String getNombre() { return nombre; }
    public double getPrecioBase() { return precioBase; }

    // Responsabilidad 2: Calculo de precios (Logica de negocio)
    public double calcularPrecioFinal() {
        return precioBase + (precioBase * impuesto / 100);
    }

    // Responsabilidad 3: Generacion de etiquetas (Presentacion)
    public void generarEtiqueta() {
        System.out.println("Etiqueta: " + nombre + " - Precio: $" + calcularPrecioFinal());
    }
}
