package futbol5.filtro;

import futbol5.Socio;

public class FiltroOr extends Filtro{
    private Filtro filtro1;
    private Filtro filtro2;

    public FiltroOr(Filtro filtro1,Filtro filtro2){
        this.filtro1 = filtro1;
        this.filtro2 = filtro2;
    }


    @Override
    public boolean cumple(Socio socio) {
        return filtro1.cumple(socio) || filtro2.cumple(socio);
    }
}
