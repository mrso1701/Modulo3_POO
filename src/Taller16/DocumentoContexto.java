package Taller16;

public class DocumentoContexto {
    private String contenido;

    public DocumentoContexto(String contenido) {
        this.contenido = contenido;
    }

    // Este metodo es el problema: esta abierto a la modificacion constante
    public void exportar(String formato) {
        if (formato.equals("PDF")) {
            System.out.println("Generando archivo .pdf con el texto: " + contenido);
            
        } else if (formato.equals("WORD")) {
            System.out.println("Generando archivo .docx con el texto: " + contenido);
            
        } 
        // Si nos piden agregar soporte para Excel, tendriamos que romper la regla y 
        // modificar este codigo ya existente agregando lo siguiente:
        //
        // else if (formato.equals("EXCEL")) {
        //     System.out.println("Generando archivo .xlsx con el texto: " + contenido);
        // }
        //
        else {
            System.out.println("Error: Formato no soportado.");
        }
    }
}
