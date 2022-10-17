package candycrush.filtros;

import candycrush.Ficha;

public class FiltroNot extends Filtro{
    private Filtro filtro;

    public FiltroNot(Filtro filtro){
        this.filtro = filtro;
    }

    @Override
    public boolean cumple(Ficha ficha){
        return !this.filtro.cumple(ficha);
    }
}
