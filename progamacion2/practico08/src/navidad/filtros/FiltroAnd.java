package navidad.filtros;

import navidad.Carta;

public class FiltroAnd extends Filtro{
    private Filtro filtro1;
    private Filtro filtro2;

    public FiltroAnd(Filtro filtro1,Filtro filtro2){
        this.filtro1 = filtro1;
        this.filtro2 = filtro2;
    }
    @Override
    public boolean cumple(Carta carta){
        return this.filtro1.cumple(carta) && this.filtro2.cumple(carta);
    }
}
