package futbol5.filtro;

import futbol5.Socio;

public class FiltroEdadMenor extends Filtro{
    private int edadMax;

    public FiltroEdadMenor(int edadMax){
        this.edadMax = edadMax;
    }

    @Override
    public boolean cumple(Socio socio){
        return socio.getEdad() < this.edadMax;
    }
}
