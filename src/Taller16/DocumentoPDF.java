package Taller16;

public class DocumentoPDF extends Documento{
    public DocumentoPDF(String contenido) {
        super(contenido);
    }

    @Override
    public void exportar() {
        System.out.println("Generando archivo .pdf con el texto: " + contenido);
    }
}
