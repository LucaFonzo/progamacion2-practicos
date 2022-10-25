package sistemacensos.filtros;

import sistemacensos.Comarca;
import sistemacensos.ElementoRegion;

public class FiltroDensidad extends Filtro{
    private Double densidadMin;

    public FiltroDensidad(Double densidadMin){
        this.densidadMin = densidadMin;
    }
    @Override
    public boolean cumple(ElementoRegion elementoRegion){
        return elementoRegion.getDensidadPoblacion() > this.densidadMin;
    }
}
