package futbol5.filtro;

import futbol5.Socio;

public class FiltroMontoPagado extends Filtro{
    private int montoMax;

    public FiltroMontoPagado(int montoMax){
        this.montoMax = montoMax;
    }
    @Override
    public boolean cumple(Socio socio) {
        return socio.pagoMonto(this.montoMax);
    }
}
