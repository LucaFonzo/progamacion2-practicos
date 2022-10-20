package navidad.filtros;

import navidad.Carta;

public class FiltroNot extends Filtro{
    private Filtro filtro;

    public FiltroNot(Filtro filtro){
        this.filtro = filtro;
    }
    @Override
    public boolean cumple(Carta carta){
        return this.filtro.cumple(carta);
    }
}
