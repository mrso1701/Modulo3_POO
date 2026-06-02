package Taller18;

public class CamionDeCarga implements Conducible, Cargable{
    @Override
    public void conducir() {
        System.out.println("Camion: Conduciendo por la autopista con precaucion debido al peso.");
    }

    @Override
    public void cargarMercancias() {
        System.out.println("Camion: Abriendo las compuertas y cargando 5 toneladas de mercancia.");
    }
}
