package Taller15;

public class EtiquetadorProducto {
    
    public void generarEtiqueta(Producto producto, double precioFinal) {
        System.out.println("=== ETIQUETA DE PRODUCTO ===");
        System.out.println("Articulo: " + producto.getNombre());
        System.out.println("Precio de Venta: $" + precioFinal);
        System.out.println("============================");
    }
}
