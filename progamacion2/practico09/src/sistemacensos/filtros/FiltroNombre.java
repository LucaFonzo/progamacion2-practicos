package sistemacensos.filtros;

import sistemacensos.Comarca;
import sistemacensos.ElementoRegion;

public class FiltroNombre extends Filtro{
    private String nombreBuscado;

    public FiltroNombre(String nombreBuscado){
        this.nombreBuscado = nombreBuscado;
    }
    @Override
    public boolean cumple(ElementoRegion elementoRegion){
        return elementoRegion.getNombre().equals(this.nombreBuscado);
    }
}
