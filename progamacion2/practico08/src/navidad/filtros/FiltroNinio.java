package navidad.filtros;

import navidad.Carta;

public class FiltroNinio extends Filtro{
    private String regaloMalo;

    public FiltroNinio(String regaloMalo){
        this.regaloMalo = regaloMalo;
    }
    @Override
    public boolean cumple(Carta carta){
        return carta.tieneRegalo(regaloMalo);
    }
}
