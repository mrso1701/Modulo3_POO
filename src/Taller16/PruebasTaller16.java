package Taller16;

public class PruebasTaller16 {

    public static void main(String[] args) {
        double precioCamisa = 100.0;
        System.out.println("Precio original: $" + precioCamisa);
        
        // 1. Usando el descuento inicial (20%)
        Descuento promoNavidad = new DescuentoPorcentaje(20.0);
        double precioConPorcentaje = promoNavidad.aplicarDescuento(precioCamisa);
        System.out.println("Precio con descuento del 20%: $" + precioConPorcentaje);
        
        // 2. Usando la extension del sistema (Descuento fijo de $15)
        Descuento cuponEspecial = new DescuentoFijo(15.0);
        double precioConFijo = cuponEspecial.aplicarDescuento(precioCamisa);
        System.out.println("Precio con descuento fijo de $15: $" + precioConFijo);
        
        System.out.println("\n===============================================\n");
        
        
        
        
        String texto = "Reporte de ventas anuales";
        
        System.out.println("=== Sistema de Exportacion de Documentos ===");
        
        // 1. Usando el sistema original (PDF)
        Documento reportePdf = new DocumentoPDF(texto);
        reportePdf.exportar();
        
        // 2. Usando la extension del sistema (Word)
        Documento reporteWord = new DocumentoWord(texto);
        reporteWord.exportar();
        
        // 3. Usando la extension del sistema (Excel)
        Documento reporteExcel = new DocumentoExcel(texto);
        reporteExcel.exportar();
        
        System.out.println("============================================");
    }
    
}
