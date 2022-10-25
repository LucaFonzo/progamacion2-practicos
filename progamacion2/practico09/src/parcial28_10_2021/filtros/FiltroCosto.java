package parcial28_10_2021.filtros;

import parcial28_10_2021.ElementoViaje;

public class FiltroCosto extends Filtro{
    private Double costoMin;

    public FiltroCosto(Double costoMin){
        this.costoMin = costoMin;
    }
    @Override
    public boolean cumple(ElementoViaje elementoViaje){
        return elementoViaje.getCosto() > this.costoMin;
    }
}
