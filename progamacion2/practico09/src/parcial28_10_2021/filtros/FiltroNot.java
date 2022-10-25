package parcial28_10_2021.filtros;

import parcial28_10_2021.ElementoViaje;

public class FiltroNot extends Filtro{
    private Filtro filtro;

    public FiltroNot(Filtro filtro){
        this.filtro = filtro;
    }
    @Override
    public boolean cumple(ElementoViaje elementoViaje){
        return !this.filtro.cumple(elementoViaje);
    }
}
