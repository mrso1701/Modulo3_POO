package Taller16;

public class DocumentoWord extends Documento {
    public DocumentoWord(String contenido) {
        super(contenido);
    }

    @Override
    public void exportar() {
        System.out.println("Generando archivo .docx con el texto: " + contenido);
    }
}
