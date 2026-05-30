package Taller16;

public abstract class Documento {
    protected String contenido;

    public Documento(String contenido) {
        this.contenido = contenido;
    }

    // El "hueco" que los hijos deben rellenar
    public abstract void exportar();
}
