package controlgastos.filtros;

import controlgastos.Gasto;

public class FiltroMonto extends Filtro{
    private Double minMonto;

    public FiltroMonto(Double minMonto){
        this.minMonto = minMonto;
    }
    @Override
    public boolean cumple(Gasto gasto){
        return gasto.getMonto() > minMonto;
    }
}
