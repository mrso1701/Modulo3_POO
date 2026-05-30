package Taller14;

public class PruebasTaller14 {
    
    public static void main(String[] args) {
        
        Figura figuraGenerica = new Figura();
        Figura miCirculo = new Circulo(5.0);
        Figura miRectangulo = new Rectangulo(4.0, 6.0);
        
        System.out.println("=== Demostracion de Polimorfismo ===");
        
        // Java ejecuta el metodo correspondiente a cada objeto real
        figuraGenerica.calcularArea();
        miCirculo.calcularArea();
        miRectangulo.calcularArea();
        
        System.out.println("====================================");
    }
    
}
