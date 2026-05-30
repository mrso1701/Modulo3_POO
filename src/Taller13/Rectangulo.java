package Taller13;

public class Rectangulo extends Figura {
    private double base;
    private double altura;

    // Constructor para inicializar las dimensiones
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Implementación obligatoria del método abstracto
    @Override
    public double calcularArea() {
        return base * altura;
    }
}
