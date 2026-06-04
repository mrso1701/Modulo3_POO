package Taller19;

public class ReporteExcel implements GeneradorReporte {
    @Override
    public void generar(String contenido) {
        System.out.println("Preparando libro de cálculo...");
        System.out.println("Exportando a Excel en formato de tabla con los datos: [" + contenido + "]");
    }
}
