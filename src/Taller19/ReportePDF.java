package Taller19;


public class ReportePDF implements GeneradorReporte {
    @Override
    public void generar(String contenido) {
        System.out.println("Preparando documento PDF...");
        System.out.println("Exportando a PDF con el texto: [" + contenido + "]");
    }
}
