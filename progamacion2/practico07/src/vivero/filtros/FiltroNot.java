package vivero.filtros;

import vivero.Planta;

public class FiltroNot extends Filtro{
    private Filtro filtro;

    public FiltroNot(Filtro filtro){
        this.filtro = filtro;
    }

    @Override
    public boolean cumple(Planta planta){
        return !filtro.cumple(planta);
    }
}
