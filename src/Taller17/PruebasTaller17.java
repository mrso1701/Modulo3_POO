package Taller17;

public class PruebasTaller17 {

    public static void imprimirAreaFormateada(Figura figura) {
        System.out.printf("El area calculada de la figura es: %.2f\n", figura.calcularArea());
    }
    
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE FIGURAS (CUMPLIENDO LSP) ===");

        // Creamos los objetos usando polimorfismo (referencia padre, objeto hijo)
        Figura miCirculo = new Circulo(5.0);         // Radio = 5
        Figura miRectangulo = new Rectangulo(4.0, 6.0); // Ancho = 4, Alto = 6

        // Sustitución en acción: el método acepta ambos tipos transparentemente
        System.out.print("Probando Circulo: ");
        imprimirAreaFormateada(miCirculo);

        System.out.print("Probando Rectangulo: ");
        imprimirAreaFormateada(miRectangulo);

        System.out.println("===========================================");
    }
    
}
