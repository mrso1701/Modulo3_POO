package Taller13;

public class PruebasTaller13 {

    public static void main(String[] args) {
        Figura miRectangulo = new Rectangulo(5.0, 4.0);
        
        // Instanciamos un Triángulo (Base = 6.0, Altura = 3.0)
        Figura miTriangulo = new Triangulo(6.0, 3.0);
        
        System.out.println("=== Cálculo de Áreas ===");
        
        // Java sabe dinámicamente cuál método ejecutar según el objeto real
        System.out.println("El area del rectangulo es: " + miRectangulo.calcularArea());
        System.out.println("El area del triangulo es: " + miTriangulo.calcularArea());
        
        System.out.println("========================");
    }
    
}
