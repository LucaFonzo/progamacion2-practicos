package sistemacensos.filtros;

import sistemacensos.Comarca;
import sistemacensos.ElementoRegion;

public class FiltroOr extends Filtro{
    private Filtro filtro1;
    private Filtro filtro2;


    public FiltroOr(Filtro filtro1,Filtro filtro2){
        this.filtro1 = filtro1;
        this.filtro2 = filtro2;
    }
    @Override
    public boolean cumple(ElementoRegion elementoRegion){
        return this.filtro1.cumple(elementoRegion) || this.filtro2.cumple(elementoRegion);
    }
}
