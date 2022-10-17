package busquedadocumentos.Filtros;

import busquedadocumentos.Documento;

public class FIltroNot extends  Filtro{
    private Filtro filtro;

    public FIltroNot(Filtro filtro){
        this.filtro = filtro;
    }

    @Override
    public boolean cumple(Documento documento){
        return this.filtro.cumple(documento);
    }
}
