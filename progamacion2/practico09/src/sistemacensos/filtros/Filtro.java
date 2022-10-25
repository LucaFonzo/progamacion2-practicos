package sistemacensos.filtros;

import sistemacensos.Comarca;

public abstract class Filtro {

    public abstract boolean cumple(Comarca comarca);
}
