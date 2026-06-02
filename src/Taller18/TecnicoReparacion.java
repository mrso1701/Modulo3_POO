package Taller18;

public class TecnicoReparacion implements Reparable {
    @Override
    public void reparar() {
        System.out.println("Tecnico: Diagnosticando fallas, soldando circuitos y cambiando piezas defectuosas.");
    }
}
