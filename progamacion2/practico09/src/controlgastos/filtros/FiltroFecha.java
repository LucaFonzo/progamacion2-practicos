package controlgastos.filtros;

import controlgastos.Gasto;

import java.time.LocalDate;

public class FiltroFecha extends Filtro{
    private LocalDate fechaDada;

    public FiltroFecha(LocalDate fechaDada){
        this.fechaDada = fechaDada;
    }

    @Override
    public boolean cumple(Gasto gasto){
        return gasto.getFecha().equals(this.fechaDada);
    }
}
