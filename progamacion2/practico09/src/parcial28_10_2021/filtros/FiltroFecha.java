package parcial28_10_2021.filtros;

import parcial28_10_2021.ElementoViaje;

import java.time.LocalDate;

public class FiltroFecha extends Filtro{
    private LocalDate fechaBuscada;

    public FiltroFecha(LocalDate fechaBuscada){
        this.fechaBuscada = fechaBuscada;
    }
    @Override
    public boolean cumple(ElementoViaje elementoViaje){
        return elementoViaje.getFechaPago().equals(this.fechaBuscada);
    }
}
