package Taller14;

public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        // Formula: pi * radio al cuadrado
        double area = Math.PI * radio * radio;
        System.out.println("El area del circulo es: " + area);
    }
}
