package futbol5.filtro;

import futbol5.Cancha;
import futbol5.Socio;

public class FiltroCancha extends Filtro{
    private Cancha canchaBuscada;

    public FiltroCancha(Cancha canchaBuscada){
        this.canchaBuscada = canchaBuscada;
    }



    @Override
    public boolean cumple(Socio socio) {
        return socio.alquiloCancha(canchaBuscada);
    }
}
