package sistemaarchivos.filtro;

import sistemaarchivos.ElementoArchivo;

public class FiltroNot extends Filtro{
    private Filtro filtro;

    public FiltroNot(Filtro filtro){
        this.filtro = filtro;
    }

    @Override
    public boolean cumple(ElementoArchivo elementoArchivo){
        return !this.filtro.cumple(elementoArchivo);
    }

}
