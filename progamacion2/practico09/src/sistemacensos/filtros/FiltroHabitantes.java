package sistemacensos.filtros;

import sistemacensos.Comarca;
import sistemacensos.ElementoRegion;

public class FiltroHabitantes extends Filtro{
    private Integer cantidadMin;

    public FiltroHabitantes(Integer cantidadMin){
        this.cantidadMin = cantidadMin;
    }
    @Override
    public boolean cumple(ElementoRegion elementoRegion) {
        return elementoRegion.getCantidadHabitantes() > this.cantidadMin;
    }
}
