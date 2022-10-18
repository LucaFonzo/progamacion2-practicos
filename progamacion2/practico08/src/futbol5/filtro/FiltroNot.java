package futbol5.filtro;

import futbol5.Socio;

public class FiltroNot extends Filtro{
    private Filtro filtro;

    public FiltroNot(Filtro filtro){
        this.filtro = filtro;
    }

    @Override
    public boolean cumple(Socio socio) {
        return !filtro.cumple(socio);
    }
}
