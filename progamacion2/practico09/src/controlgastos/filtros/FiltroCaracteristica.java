package controlgastos.filtros;

import controlgastos.Gasto;

public class FiltroCaracteristica extends Filtro{
    private String caracteristicaBuscada;

    public FiltroCaracteristica(String caracteristicaBuscada){
        this.caracteristicaBuscada = caracteristicaBuscada;
    }
    @Override
    public boolean cumple(Gasto gasto){
        return gasto.tieneCaracteristica(this.caracteristicaBuscada);
    }
}
