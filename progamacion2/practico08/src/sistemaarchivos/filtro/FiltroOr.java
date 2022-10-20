package sistemaarchivos.filtro;

import sistemaarchivos.ElementoArchivo;

public class FiltroOr extends Filtro{
    private Filtro filtro1;
    private Filtro filtro2;

    public FiltroOr(Filtro filtro1,Filtro filtro2){
        this.filtro1 = filtro1;
        this.filtro2 = filtro2;
    }
    @Override
    public boolean cumple(ElementoArchivo elementoArchivo){
        return this.filtro1.cumple(elementoArchivo) || this.filtro2.cumple(elementoArchivo);
    }
}
