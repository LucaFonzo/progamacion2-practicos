package futbol5.filtro;

import futbol5.Socio;

public class FiltroCuotaPaga extends Filtro{

    @Override
    public boolean cumple(Socio socio){
        return socio.isTienePaga();
    }
}
