package sistemaarchivos.filtro;

import sistemaarchivos.ElementoArchivo;

import java.time.LocalDateTime;

public class FiltroFecha extends Filtro{
    private LocalDateTime fechaMax;

    public FiltroFecha(LocalDateTime fechaMax){
        this.fechaMax = fechaMax;
    }

    @Override
    public boolean cumple(ElementoArchivo elementoArchivo) {
        return elementoArchivo.tieneFecha(this.fechaMax);
    }
}
