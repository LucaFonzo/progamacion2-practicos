package candycrush.filtros;

import candycrush.Ficha;

public class FiltroFortalezaMayorA extends Filtro{
    private int fortalezaMin;

    public FiltroFortalezaMayorA(int fortalezaMin){
        this.fortalezaMin = fortalezaMin;
    }

    @Override
    public boolean cumple(Ficha ficha) {
        return ficha.getFortaleza() > this.fortalezaMin;
    }
}
