package vivero.filtros;

import vivero.Planta;

public class FiltroClasificacion extends Filtro{
    private String clasificacionBuscada;

    public FiltroClasificacion(String clasificacionBuscada){
        this.clasificacionBuscada = clasificacionBuscada;
    }

    @Override
    public boolean cumple(Planta planta){
        return this.clasificacionBuscada.equals(planta.getClasificacionSuperior());
    }
}
