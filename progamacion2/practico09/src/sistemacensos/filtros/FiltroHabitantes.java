package sistemacensos.filtros;

import sistemacensos.Comarca;

public class FiltroHabitantes extends Filtro{
    private Integer cantidadMin;

    public FiltroHabitantes(Integer cantidadMin){
        this.cantidadMin = cantidadMin;
    }
    @Override
    public boolean cumple(Comarca comarca) {
        return comarca.getCantidadHabitantes() > this.cantidadMin;
    }
}
