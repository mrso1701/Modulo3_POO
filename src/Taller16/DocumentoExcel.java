package Taller16;

public class DocumentoExcel extends Documento {
    public DocumentoExcel(String contenido) {
        super(contenido);
    }

    @Override
    public void exportar() {
        System.out.println("Generando hoja de calculo .xlsx con los datos: " + contenido);
    }
}
