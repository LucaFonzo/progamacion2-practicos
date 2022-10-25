package controlgastos.filtros;

import controlgastos.Gasto;

public class FiltroNot extends Filtro{
    private Filtro filtro;

    public FiltroNot(Filtro filtro){
        this.filtro = filtro;
    }
    @Override
    public boolean cumple(Gasto gasto){
        return !this.filtro.cumple(gasto);
    }
}
