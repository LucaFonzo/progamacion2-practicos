package parcial28_10_2021.filtros;

import parcial28_10_2021.ElementoViaje;

public class FiltroCiudadBuscada extends Filtro{
    private String destinoBuscado;

    public FiltroCiudadBuscada(String destinoBuscado){
        this.destinoBuscado = destinoBuscado;
    }
    @Override
    public boolean cumple(ElementoViaje elementoViaje){
        return elementoViaje.getCiudadDestino().equals(this.destinoBuscado);
    }
}
