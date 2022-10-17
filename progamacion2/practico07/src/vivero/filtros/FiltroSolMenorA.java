package vivero.filtros;

import vivero.Planta;

public class FiltroSolMenorA extends Filtro{
    private int solMax;

    public FiltroSolMenorA(int solMax){
        this.solMax = solMax;
    }

    @Override
    public boolean cumple(Planta planta){
        return planta.getSolNecesita() < this.solMax;
    }
}
