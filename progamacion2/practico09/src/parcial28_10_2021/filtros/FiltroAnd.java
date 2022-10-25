package parcial28_10_2021.filtros;

import parcial28_10_2021.ElementoViaje;

public class FiltroAnd extends Filtro{
    private Filtro filtro1;
    private Filtro filtro2;

    public FiltroAnd(Filtro filtro1,Filtro filtro2){
        this.filtro1 = filtro1;
        this.filtro2 = filtro2;
    }
    @Override
    public boolean cumple(ElementoViaje elementoViaje){
        return this.filtro1.cumple(elementoViaje) && this.filtro2.cumple(elementoViaje);
    }
}
