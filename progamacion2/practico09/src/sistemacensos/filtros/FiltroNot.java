package sistemacensos.filtros;

import sistemacensos.Comarca;
import sistemacensos.ElementoRegion;

public class FiltroNot extends Filtro{
    private Filtro filtro;

    public FiltroNot(Filtro filtro){
        this.filtro = filtro;
    }
    @Override
    public boolean cumple(ElementoRegion elementoRegion){
        return !this.filtro.cumple(elementoRegion);
    }
}
