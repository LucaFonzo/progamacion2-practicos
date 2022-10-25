package sistemacensos.filtros;

import sistemacensos.Comarca;

public class FiltroDensidad extends Filtro{
    private Double densidadMin;

    public FiltroDensidad(Double densidadMin){
        this.densidadMin = densidadMin;
    }
    @Override
    public boolean cumple(Comarca comarca){
        return comarca.getDensidadPoblacion() > this.densidadMin;
    }
}
