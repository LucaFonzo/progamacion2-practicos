package vivero.filtros;

import vivero.Planta;

public class FiltroSolSuperiorA extends Filtro {
    private int solMin;

    public FiltroSolSuperiorA(int solMin){
        this.solMin = solMin;
    }

    @Override
    public boolean cumple(Planta planta){
        return planta.getSolNecesita() > solMin;
    }
}
