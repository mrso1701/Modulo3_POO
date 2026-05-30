package Taller14;

public class Gato extends Animal {
    // MALA PRACTICA: Sobrescribir para no aportar nada nuevo
    @Override
    public void hacerSonido() {
        super.hacerSonido(); // Simplemente llama al padre
    }
}
