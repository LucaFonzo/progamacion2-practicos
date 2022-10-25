package sistemacensos.filtros;

import sistemacensos.Comarca;

public class FiltroNombre extends Filtro{
    private String nombreBuscado;

    public FiltroNombre(String nombreBuscado){
        this.nombreBuscado = nombreBuscado;
    }
    @Override
    public boolean cumple(Comarca comarca){
        return comarca.getNombre().equals(this.nombreBuscado);
    }
}
