package candycrush.filtros;

import candycrush.Ficha;

public class FiltroOcupaMayorA extends Filtro{
    private int lugaresMin;

    public FiltroOcupaMayorA(int lugaresMin){
        this.lugaresMin = lugaresMin;
    }

    @Override
    public boolean cumple(Ficha ficha){
        return ficha.getCasillerosOcupa() > this.lugaresMin;
    }

}
