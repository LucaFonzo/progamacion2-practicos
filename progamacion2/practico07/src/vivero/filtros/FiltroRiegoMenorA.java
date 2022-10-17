package vivero.filtros;

import vivero.Planta;

public class FiltroRiegoMenorA extends Filtro {
    private int riegoMax;

    public FiltroRiegoMenorA(int riegoMax){
        this.riegoMax = riegoMax;
    }
    @Override
    public boolean cumple(Planta planta){
        return planta.getRiegoNecesita() < riegoMax;
    }
}
