package Taller14;

public class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra.");
    }

    // Metodo exclusivo de la clase hija
    public void buscarPelota() {
        System.out.println("El perro corre a buscar la pelota.");
    }
}
