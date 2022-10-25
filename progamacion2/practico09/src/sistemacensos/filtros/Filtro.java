package sistemacensos.filtros;

import sistemacensos.Comarca;
import sistemacensos.ElementoRegion;

public abstract class Filtro {

    public abstract boolean cumple(ElementoRegion elementoRegion);
}
