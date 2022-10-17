package vivero.filtros;

import vivero.Planta;

public class FiltroRiegoMayorA extends Filtro{
    private int riegoMin;

    public FiltroRiegoMayorA(int riegoMin){
        this.riegoMin = riegoMin;
    }

    @Override
    public boolean cumple(Planta planta){
        return planta.getRiegoNecesita() > this.riegoMin;
    }
}
