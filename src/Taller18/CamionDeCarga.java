package Taller18;

public class CamionDeCarga implements Conducible, Cargable{
    @Override
    public void conducir() {
        System.out.println("Camión: Conduciendo por la autopista con precaución debido al peso.");
    }

    @Override
    public void cargarMercancias() {
        System.out.println("Camión: Abriendo las compuertas y cargando 5 toneladas de mercancía.");
    }
}
