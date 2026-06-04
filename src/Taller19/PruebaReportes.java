package Taller19;

public class PruebaReportes {

    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE REPORTES (CUMPLIENDO DIP) ===");

        String datosDelMes = "Ventas Totales: $15,000 | Nuevos Clientes: 45";

        // Escenario 1: El usuario solicita el reporte en PDF
        System.out.println("\n--- Solicitud de Reporte Mensual (Formato PDF) ---");
        GeneradorReporte motorPdf = new ReportePDF();
        GestorReportes gestorPdf = new GestorReportes(motorPdf);
        gestorPdf.procesarYGenerar(datosDelMes);

        // Escenario 2: El departamento contable solicita el reporte en Excel
        System.out.println("\n--- Solicitud de Reporte Mensual (Formato Excel) ---");
        GeneradorReporte motorExcel = new ReporteExcel();
        // Reutilizamos la misma clase GestorReportes, pero le inyectamos un comportamiento distinto
        GestorReportes gestorExcel = new GestorReportes(motorExcel);
        gestorExcel.procesarYGenerar(datosDelMes);

        System.out.println("\n============================================");
    }
    
}
