package candycrush.filtros;

import candycrush.Ficha;

public class FiltroPoderDestruccioMayorA extends Filtro{
    private int poderMin;

    public FiltroPoderDestruccioMayorA(int poderMin){
        this.poderMin = poderMin;
    }
    @Override
    public boolean cumple(Ficha ficha){
        return ficha.getPoderDestruccion() > this.poderMin;
    }
}
