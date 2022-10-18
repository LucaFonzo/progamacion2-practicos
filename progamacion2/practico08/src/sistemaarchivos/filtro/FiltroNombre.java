package sistemaarchivos.filtro;

import sistemaarchivos.ElementoArchivo;

public class FiltroNombre extends Filtro{
    private String nombreBuscado;

    public FiltroNombre(String nombreBuscado){
        this.nombreBuscado = nombreBuscado;
    }

    @Override
    public boolean cumple(ElementoArchivo elementoArchivo) {
        return elementoArchivo.tieneNombre(this.nombreBuscado);
    }
}
